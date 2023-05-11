<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	Connection conn= null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String sql ="select * from item";
	
	try{
		Context ctx = new InitialContext();
		DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/oracle");
		conn = ds.getConnection();
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
%>		
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>입력 완료된 정보</h1>
	<table border="1"cellspacing="0">
		<tr>
			<td>상품제목</td>
			<td>가격</td>
			<td>상품설명</td>
		</tr>
		<% 	while(rs.next()){ %>
		<tr>
			<td><%= rs.getString("name") %></td>
			<td><%= rs.getString("price") %></td>
			<td><%= rs.getString("description") %></td>
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