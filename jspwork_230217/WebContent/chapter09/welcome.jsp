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
		String str = (String)session.getAttribute("userId");
		
		if(str==null){
			response.sendRedirect("session_out.jsp");
		}else{
			out.print(str+"님 반갑습니다.");
		}
	%>
	<p><a href="session_out.jsp">로그아웃</a></p>
</body>
</html>