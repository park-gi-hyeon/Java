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
		String value="";
		Cookie[] cookies = request.getCookies();
		for(int i=0; i<cookies.length; i++){
			if(cookies[i].getName().equals("userID")){
				 value = cookies[i].getValue();
			}
		}
	%>
	<h4><%= value %>님 반갑습니다.</h4>
	

	<p><a href="cookie_out.jsp">로그아웃</a></p>
</body>
</html>