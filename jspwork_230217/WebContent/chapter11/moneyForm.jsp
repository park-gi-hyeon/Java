<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean class="question.Money" id="change"></jsp:useBean>
    <jsp:setProperty property="num" name="change"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	입력된 금액이 <%= change.getNum() %>는<br>
	<%= change.process(change.getNum()) %>
</body>
</html>