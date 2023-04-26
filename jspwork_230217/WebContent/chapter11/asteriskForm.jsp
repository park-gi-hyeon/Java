<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean class="question.Asterisk" id="put"></jsp:useBean>
    <jsp:setProperty property="num" name="put"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	입력된 정수가<%= put.getNum() %>는<br>
	<%= put.process(put.getNum()) %>
</body>
</html>