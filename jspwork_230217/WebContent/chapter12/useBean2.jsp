<%@page import="area.Circle2"%>
<%@page import="area.Rectangle"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean class="area.Rectangle" id="area"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>사각형의 면적 출력하기</h4>
	<% area.setNum1(20); area.setNum2(30); %>
	가로 <%= area.getNum1() %>,세로 <%= area.getNum2() %>인 사각형의 면적은 <%= area.process(20, 30) %>
</body>
</html>