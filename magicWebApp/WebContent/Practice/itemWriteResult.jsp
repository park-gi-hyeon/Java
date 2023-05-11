<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%	
	request.setCharacterEncoding("utf-8");	


	String name = request.getParameter("name");
	int price = Integer.parseInt(request.getParameter("price"));
	String description = request.getParameter("description");

	Connection conn= null;
	PreparedStatement pstmt = null;
	String sql ="insert into item(name,price,description) " 
			+"values(?,?,?)";
	
	try{
	Context ctx = new InitialContext();
	DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/oracle");
	conn = ds.getConnection();
	pstmt = conn.prepareStatement(sql);
	
	pstmt.setString(1, name);
	pstmt.setInt(2, price);
	pstmt.setString(3,description);
	pstmt.executeUpdate();
	
	System.out.println("추가성공");
	
	}catch(Exception e){
		e.printStackTrace();
		System.out.println("추가실패");
	}

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><a href="itemWrite.jsp">결과보기</a></h1>
</body>
</html>