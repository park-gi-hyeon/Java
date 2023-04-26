<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean class="question.Airthmetic" id="math"></jsp:useBean>
    <jsp:setProperty property="*" name="math"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>당신이 입력한 정보입니다.</h4>
	<%= math.precess() %>
</body>
</html>