<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean class="question.Array3" id="test"></jsp:useBean>
    <jsp:setProperty property="num" name="test"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	입력된 정수의 갯수는 <%= test.getNum() %>는<br>
	<%= test.process(test.getNum()) %>
</body>
</html>