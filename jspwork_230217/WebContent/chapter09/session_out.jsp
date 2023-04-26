<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		session.invalidate();
		String s_name;
		Enumeration enum_app = session.getAttributeNames(); 
		int i =0;
		while(enum_app.hasMoreElements()){
			i++;
			s_name = enum_app.nextElement().toString();
			session.removeAttribute(s_name);
		}
		response.sendRedirect("session.jsp");
	%>
</body>
</html>