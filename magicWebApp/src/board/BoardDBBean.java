package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
			sql = "SELECT MAX(B_ID)FROM BOARDT";			
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			if (rs.next()) {
				num = rs.getInt(1)+1;
			} else {
				num = 1;
			}
			
			sql = "INSERT INTO BOARDT VALUES(?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);			
			pstmt.setInt(1, num);
			pstmt.setString(2, board.getB_name());
			pstmt.setString(3, board.getB_email());
			pstmt.setString(4, board.getB_title());
			pstmt.setString(5, board.getB_content());
			
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
}
