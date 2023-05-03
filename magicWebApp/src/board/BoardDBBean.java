package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

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
		int re = -1;
		int num;
		Connection conn= null;
		PreparedStatement pstmt = null;
		String sql ="";
		ResultSet rs = null;		
		try {
			conn = getConnection();
//			sql = "SELECT MAX(B_ID)FROM BOARDT";			
//			pstmt = conn.prepareStatement(sql);
//			rs=pstmt.executeQuery();
//			
//			if (rs.next()) {
//				num = rs.getInt(1)+1;
//			} else {
//				num = 1;
//			}
			
			sql = "INSERT INTO boardt "
					+ "VALUES((select nvl(max(b_id),0)+1 from boardt),?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);			
//			pstmt.setInt(1, num);
			pstmt.setString(1, board.getB_name());
			pstmt.setString(2, board.getB_email());
			pstmt.setString(3, board.getB_title());
			pstmt.setString(4, board.getB_content());
			pstmt.setTimestamp(5, board.getB_date());
//			pstmt.setInt(6, board.getB_hit());
			pstmt.setInt(6, 0); // insert부분에서 초기값을 설정을 해주지않아서 null일경우 오류문제가 생길 수 있다.
			pstmt.setString(7, board.getB_pwd());
			
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
	public ArrayList<BoardBean> listBoard(){
		Connection conn= null;
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<BoardBean> boardList = new ArrayList<BoardBean>();
		
		try {
			conn = getConnection();
			String sql = "select * from boardt order by b_id";
			stmt = conn.prepareStatement(sql);
			rs= stmt.executeQuery(sql);
			
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
				board.setB_pwd(rs.getNString(8));
				//여기까지가 1행을 가져와서 저장
				
				//행의 데이터를 ArrayList에 저장
				boardList.add(board);
			}
			
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
				
				sql = "select b_id,b_name,b_email,b_title,b_content,b_date,b_hit,b_pwd "
						+ "from boardt where b_id=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, num);
				rs = pstmt.executeQuery();
			}else {
	//			글 내용 보기
				sql = "select b_id,b_name,b_email,b_title,b_content,b_date,b_hit,b_pwd "
						+ "from boardt where b_id=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, num);
				rs = pstmt.executeQuery();
			}
			if(rs.next()) {
				board.setB_id(num);
				board.setB_name(rs.getNString("b_name"));
				board.setB_email(rs.getNString("b_email"));
				board.setB_title(rs.getString("b_title"));
				board.setB_content(rs.getString("b_content"));
				board.setB_date(rs.getTimestamp("b_date"));
				board.setB_hit(rs.getInt("b_hit"));
				board.setB_pwd(rs.getString("b_pwd"));
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
