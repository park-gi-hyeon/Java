package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

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
					+ "VALUES((select nvl(max(b_id),0)+1 from boardt),?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);			
//			pstmt.setInt(1, num);
			pstmt.setString(1, board.getB_name());
			pstmt.setString(2, board.getB_email());
			pstmt.setString(3, board.getB_title());
			pstmt.setString(4, board.getB_content());
			pstmt.setTimestamp(5, board.getB_date());
			
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
				//여기까지가 1행을 가져와서 저장
				
				//행의 데이터를 ArrayList에 저장
				boardList.add(board);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return boardList;
	}
	
	public BoardBean getBoard(int num) {
		Connection conn= null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BoardBean board = new BoardBean();
		String sql = "select b_id,b_name,b_email,b_title,b_content,b_date "
				+ "from boardt where b_id=?";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				board.setB_id(num);
				board.setB_name(rs.getNString("b_name"));
				board.setB_email(rs.getNString("b_email"));
				board.setB_title(rs.getString("b_title"));
				board.setB_content(rs.getString("b_content"));
				board.setB_date(rs.getTimestamp("b_date"));
				rs.close();
				pstmt.close();
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return board;
	}
}
