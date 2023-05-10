<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String search = request.getParameter("search");
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	String sql = "select column_name,data_type,data_length,nullable "
				+"from USER_TAB_COLUMNS where table_name = ?";
%>		
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" align="center" cellspacing="0">
		<tr>
			<td>컬럼명</td>
			<td>컬럼형식</td>
			<td>컬럼길이</td>
			<td>널값여부</td>
		</tr>
		<%
			try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url, user, password);
				pstmt = conn.prepareStatement(sql);
				pstmt.setNString(1, search);
				rs = pstmt.executeQuery();
			while(rs.next()){
					%>
					<tr>
						<td><%= rs.getString("column_name") %></td>
						<td><%= rs.getString("data_type") %></td>
						<td><%= rs.getString("data_length") %></td>
						<td><%= rs.getString("nullable") %></td>
					</tr>
					<% 
				}
			}catch(Exception e)	{
				e.printStackTrace();
			}finally{
				try{
					if(rs != null) rs.close();
					if(pstmt != null) pstmt.close();
					if(conn != null) conn.close();
				}catch(Exception e){
				e.printStackTrace();					
				}
			}
		%>
	</table>
</body>
</html>