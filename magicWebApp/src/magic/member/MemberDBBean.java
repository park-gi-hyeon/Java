package magic.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

//회원정보 처리 빈  객체
public class MemberDBBean {
// jsp 소스에서 빈 객체를 생성을 위한 참조변수
	private static MemberDBBean instance = new MemberDBBean();
	
	//1메소드) MemberDBBean 객체 래퍼런스를 리턴하는 메소드
	public static MemberDBBean getInstance() {
		return instance;
	}
	// 2)쿼리작업에 사용할 커넥션 객체를 리턴하는 메소드(dbcp 기법)
	public Connection getConnection()throws Exception {
		Context ctx = new InitialContext();
		DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/oracle");
		return ds.getConnection();
	}
	
	// 3) 전달인다로 받은 member를  member T테이블에 삽입하는 메소드
	public int insertMember(MemberBean member) {
		Connection conn= null;
		PreparedStatement pstmt = null;
//		매개 변수로 받은 member 객체를 ?인 쿼리 파라미터에 매핑
		String sql = "INSERT INTO MEMBERT VALUES(?,?,?,?,?)";
		int re = -1;//초기 값 -1, insert 정상적으로 실행되면 1로 됨
		
		try {
//			dbcp 기법의 연결 객체	
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMem_uid());
			pstmt.setString(2, member.getMem_pwd());
			pstmt.setString(3, member.getMem_name());
			pstmt.setString(4, member.getMem_email());
			pstmt.setString(5, member.getMem_address());
			
//			INSERT 문은 excuteUpdate 메소드 호출
			pstmt.executeUpdate();
			re = 1;
			pstmt.close();
			conn.close();
			System.out.println("추가성공");
		} catch (Exception e) {
			System.out.println("추가 실패");
			e.printStackTrace();
		}
		return re;
	}
	
	//4) 회원가입시 아이디 중복 확인할떄 사용하는 메소드
	public int confirmID(String id) {
		Connection conn= null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
//		매개변수로 받은id를? 인 쿼리 파라미터에 매핑
		String sql = "SELECT mem_uid FROM MEMBERT WHERE mem_uid=?";
		int re = -1; //초기값 -1, 아이디가 중복되면 1
		
		 try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setNString(1, id);//confirm의 매개변수 id와 select문의 ?의 id를 받기위해
//			Select 문은 excuteQuery 메소드로 호출
			rs = pstmt.executeQuery();
			
			if (rs.next()) {//아이디가 일치하는 로우 존재
				re = 1;
			} else {//해당 아이디가 존재하지 않음
				re = -1;
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		 return re;
	}
	//5) 사용자 인증시 사용하는 메소드
	public int userCheck(String id, String pwd) {
		Connection conn= null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
//		매개변수로 받은id를? 인 쿼리 파라미터에 매핑
		String sql = "SELECT mem_pwd FROM MEMBERT WHERE mem_uid=?";
		int re = -1; //초기값 -1, 비밀번호가 일치하면 1,불일치 하면 0
		String db_mem_pw="";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setNString(1, id);//confirm의 매개변수 id와 select문의 ?의 id를 받기위해
			rs = pstmt.executeQuery();
			
			if (rs.next()) {//아이디가 일치하는 로우 존재
				db_mem_pw = rs.getString("mem_pwd");
				if (db_mem_pw.equals(pwd)) {//패스워드도 일치
					re = 1;
				}else {//패스워드가 불일치
					re = 0;
				}
			} else {//해당 아이디가 존재하지 않음
				re = -1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return re;
	}
	//6) 아이디가 일치하는 것으로 멤버의 정보를 얻어오는 메소드
	public MemberBean getMember(String id) {
		Connection conn= null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT mem_uid,mem_pwd,mem_name,mem_email,mem_address "
				+ "FROM MEMBERT WHERE mem_uid=?";//공백 조심
//		member : 쿼리결과에 해당하는 회원정보르 담는 객체
		MemberBean member= null;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setNString(1, id);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				member = new MemberBean();
				member.setMem_uid(rs.getString("mem_uid"));
				member.setMem_pwd(rs.getString("mem_pwd"));
				member.setMem_name(rs.getString("mem_name"));
				member.setMem_email(rs.getString("mem_email"));
				member.setMem_address(rs.getString("mem_address"));
			} 
			rs.close();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return member;
	}
	//7) 회원정보를 업데이트 하는 메소드
	public int updateMember(MemberBean member) {
		Connection conn= null;
		PreparedStatement pstmt = null;
		String sql = "update MEMBERT set mem_pwd=?,mem_email=?,mem_address=? where mem_uid=?";
		int re = -1; //초기값 -1, 변경된 행 갯수 1
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setNString(1, member.getMem_pwd());
			pstmt.setNString(2, member.getMem_email());
			pstmt.setNString(3, member.getMem_address());
			pstmt.setNString(4, member.getMem_uid());
			re = pstmt.executeUpdate();
			
			//오류가 나도 출력됨
//			System.out.println("변경성공");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("변경실패");
		}
		return re;
	}
}