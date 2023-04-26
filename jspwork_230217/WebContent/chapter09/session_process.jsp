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
		String userId = request.getParameter("id");
		String UserPw = request.getParameter("pw");
		
		
		if(userId.equals("admin")&&UserPw.equals("admin1234")){
		session.setAttribute("userId",userId);
		response.sendRedirect("welcome.jsp");
		
		}else{
			out.print("아이디와 비밀번호를 확인해주세요");
		}
		
	%>
</body>
</html>