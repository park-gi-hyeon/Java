package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import javafx.scene.Parent;
import javafx.scene.layout.Border;

public class BoardDBBean {
	private static BoardDBBean instance = new BoardDBBean();
	
	public static BoardDBBean getinstance() {
		return instance;
	}
	public Connection getConnection()throws Exception {
		Context ctx = new InitialContext();
		DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/oracle");
		return ds.getConnection();
	}
	// 정보를 삽입하는 메소드
	public int insertBoard(BoardBean board){
		Connection conn= null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int re = -1;
		int number;
		String sql ="";
		int id = board.getB_id(); //부모 글번호
		int ref = board.getB_ref(); //부모 그룹
		int step = board.getB_step(); //부모 그룹내 순서
		int level = board.getB_level(); //부모 그룹내 들여쓰기 정도
		try {
			conn = getConnection();
			String sql2 = "SELECT MAX(B_ID)FROM BOARDT";			
			pstmt = conn.prepareStatement(sql2);
			rs=pstmt.executeQuery();
			
			if (rs.next()) {
				number = rs.getInt(1)+1;
			} else {
				number = 1;
			}
			
			if (id != 0) { //답변글이 부모글의 글번호를 가짐(답변)
//				특정 조건에 step+1로 업데이트
				sql = "update boardt set b_step = b_step+1 where b_ref=? and b_step > ?";
				pstmt = conn.prepareStatement(sql);			
				pstmt.setInt(1, ref);
				pstmt.setInt(2, step);
				pstmt.executeUpdate();
				
				step = step+1;
				level = level+1;
			} else {//부모글인 경우(신규글)
				ref = number;
				step = 0;
				level = 0;
			}
			
			sql = "INSERT INTO boardt(b_id,b_name,b_email,b_title,b_content,"
					+ "b_date,b_pwd,b_ip,b_ref,b_step,b_level,b_fname,b_fsize) "
					+ "VALUES((select nvl(max(b_id),0)+1 from boardt),?,?,?,?,?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);			
//			pstmt.setInt(1, num);
			pstmt.setString(1, board.getB_name());
			pstmt.setString(2, board.getB_email());
			pstmt.setString(3, board.getB_title());
			pstmt.setString(4, board.getB_content());
			pstmt.setTimestamp(5, board.getB_date());
//			pstmt.setInt(6, board.getB_hit());
			pstmt.setString(6, board.getB_pwd());
			pstmt.setString(7, board.getB_ip());
			pstmt.setInt(8,ref);
			pstmt.setInt(9,step);
			pstmt.setInt(10,level);
			pstmt.setString(11, board.getB_fname());
			pstmt.setInt(12, board.getB_fsize());
			
			pstmt.executeUpdate();
			re = 1;
			pstmt.close();
			conn.close();
			
			System.out.println("추가성공");
		} catch (Exception e) {
			System.out.println("추가실패");
			e.printStackTrace();
		}
		return re;
	}
	// 모든 게시글의 정보가 담긴 메소드
//	public ArrayList<BoardBean> listBoard(){
	public ArrayList<BoardBean> listBoard(String pageNumber){
		Connection conn= null;
		Statement stmt = null;
		ResultSet rs = null;
		
		ResultSet pageSet = null; //페이지에 관련된 결과값을 받기위한 참조변수
		int dbCount=0;//게시글 총 갯수
		int absoulutePage = 1; //현재 페이지의 첫번째 게시글
		
		String sql = "select * from boardt order by b_ref desc, b_step asc";
		String sql2 = "select count(b_id) from boardT";
		
		ArrayList<BoardBean> boardList = new ArrayList<BoardBean>();
		
		try {
			conn = getConnection();
//			order by b_ref desc,b_step asc 최신순이고 답변순
//			stmt = conn.prepareStatement(sql);
//			페이지 처리를 위한 메소드 파라미터 추가
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
//			rs= stmt.executeQuery(sql);
			pageSet = stmt.executeQuery(sql2);
			
			if (pageSet.next()) {//게시글 총 갯수(dbCount)존재 여부
				dbCount = pageSet.getInt(1);//게시글 총 갯수
				pageSet.close();//자원반납
			}
			
			//ex>84건인경우 (84%10 = 4)
			//ex>80건인경우 (80%10 = 0)
			if (dbCount % BoardBean.pageSize == 0) {//BoardBean.pageSize는 10
//				80/10 = 8 페이지
				BoardBean.pageCount = dbCount / BoardBean.pageSize;
			} else {//84건인 경우는 else를 탐
//				(84/10)+1 = 9페이지(84건인경우는 9페이지가 필요하단 소리)
				BoardBean.pageCount = dbCount / BoardBean.pageSize + 1;				
			}
			
			if(pageNumber != null) {//넘겨오는 페이지 번호가 있는 경우
				BoardBean.pageNum= Integer.parseInt(pageNumber); //매개 변수 pageNumber를 가지고옴
//				ex>1: 0*10+1=1, 2: 1*10+1=11 =>1페이지는 1,2페이지는 11(페이지의 기준 게시글)
				absoulutePage = (BoardBean.pageNum - 1) * BoardBean.pageSize +1;
			}
			
			rs = stmt.executeQuery(sql);
			
			if (rs.next()) {//게시글 있으면 참
				rs.absolute(absoulutePage);//페이지의 기준 게시글 셋팅
				int count = 0;
				
				while (count < BoardBean.pageSize) {//게시글 갯수만큼 반복
					BoardBean board=new BoardBean();
					//쿼리결과를 BoardBean 객체에 담아서 ArrayList에 저장
					board.setB_id(rs.getInt(1));
					board.setB_name(rs.getString(2));
					board.setB_email(rs.getString(3));
					board.setB_title(rs.getString(4));
					board.setB_content(rs.getString(5));
					board.setB_date(rs.getTimestamp(6));
					board.setB_hit(rs.getInt(7));
					board.setB_pwd(rs.getString(8));
					board.setB_ip(rs.getString(9));
					board.setB_ref(rs.getInt(10));
					board.setB_step(rs.getInt(11));
					board.setB_level(rs.getInt(12));
					board.setB_fname(rs.getString(13));
					board.setB_fsize(rs.getInt(14));
					//여기까지가 1행을 가져와서 저장
					
					//행의 데이터를 ArrayList에 저장
					boardList.add(board);
					
					//페이지 변경시 처리위한 로직
					if (rs.isLast()) {
						break;
					} else {
						rs.next();
					}
					
					count++;
				}
			}
			
			/*
			while (rs.next()) {
				BoardBean board=new BoardBean();
				//쿼리결과를 BoardBean 객체에 담아서 ArrayList에 저장
				board.setB_id(rs.getInt(1));
				board.setB_name(rs.getString(2));
				board.setB_email(rs.getString(3));
				board.setB_title(rs.getString(4));
				board.setB_content(rs.getString(5));
				board.setB_date(rs.getTimestamp(6));
				board.setB_hit(rs.getInt(7));
				board.setB_pwd(rs.getString(8));
				board.setB_ip(rs.getString(9));
				board.setB_ref(rs.getInt(10));
				board.setB_step(rs.getInt(11));
				board.setB_level(rs.getInt(12));
				//여기까지가 1행을 가져와서 저장
				
				//행의 데이터를 ArrayList에 저장
				boardList.add(board);
			}
			
			*/
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return boardList;
	}
	// 프라이머리 키가 일치하는 것으로 조회수가 올라가고 게시글의 정보를 얻어오는 메소드
	public BoardBean getBoard(int num, boolean count) {
		Connection conn= null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BoardBean board = new BoardBean();
		String sql = "";
		try {
			conn = getConnection();
//			조회수 1증가 sql
			
			if(count == true) {
				sql = "update boardt set b_hit = b_hit+1 where b_id=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, num);
				rs = pstmt.executeQuery();
				
				sql = "select b_id,b_name,b_email,b_title,b_content,b_date,b_hit,b_pwd,b_ip"
						+ ",b_ref,b_step,b_level,b_fname,b_fsize "
						+ "from boardt where b_id=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, num);
				rs = pstmt.executeQuery();
			}else {
	//			글 내용 보기
				sql = "select b_id,b_name,b_email,b_title,b_content,b_date,b_hit,b_pwd,b_ip"
						+ ",b_ref,b_step,b_level,b_fname,b_fsize "
						+ "from boardt where b_id=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, num);
				rs = pstmt.executeQuery();
			}
			if(rs.next()) {
				board.setB_id(num);
				board.setB_name(rs.getString("b_name"));
				board.setB_email(rs.getString("b_email"));
				board.setB_title(rs.getString("b_title"));
				board.setB_content(rs.getString("b_content"));
				board.setB_date(rs.getTimestamp("b_date"));
				board.setB_hit(rs.getInt("b_hit"));
				board.setB_pwd(rs.getString("b_pwd"));
				board.setB_ip(rs.getString("b_ip"));
				board.setB_ref(rs.getInt("b_ref"));
				board.setB_step(rs.getInt("b_step"));
				board.setB_level(rs.getInt("b_level"));
				board.setB_fname(rs.getString("b_fname"));
				board.setB_fsize(rs.getInt("b_fsize"));
				rs.close();
				pstmt.close();
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return board;
	}
	// 삭제시키는 메소드
	public int deleteBoard(int num,String pwd) {
		Connection con= null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int re = -1;
		String sql = "";
		String board_pw="";
		
		try {
			con = getConnection();
			sql = "select b_pwd from boardt where b_id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
		if (rs.next()) {//삭제실패-1
			board_pw = rs.getString("b_pwd");
			if (pwd.equals(board_pw)) {//삭제 성공하면 1
				sql="delete from boardt where b_id=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, num);
				pstmt.executeUpdate();
				re=1;
			}else {//비밀번호가 틀렸을 경우 -2
				re=-2;
			}
		} 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return re;
	}
	// 수정하는 메소드
	public int editBoard(BoardBean board) {
		Connection conn= null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql ="";
		String pwd = "";
		int re = -1;
		
		try {
			conn = getConnection();
			sql = "select b_pwd from boardt where b_id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, board.getB_id());
			rs = pstmt.executeQuery();
			
			if(rs.next()) {//비밀번호가 있으면 참
				pwd = rs.getString(1);//비밀번호를 가져옴
				if(pwd.equals(board.getB_pwd())) {//비밀번호 일치 수정성공
					sql="update boardt set b_name=?,b_email=?,b_title=?,b_content=? "
							+ "where b_id=?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, board.getB_name());
					pstmt.setString(2, board.getB_email());
					pstmt.setString(3, board.getB_title());
					pstmt.setString(4, board.getB_content());
					pstmt.setInt(5, board.getB_id());
					pstmt.executeUpdate();
					re=1;
				}else {//비밀번호 불일치
					re = 0;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return re;
	}
}
