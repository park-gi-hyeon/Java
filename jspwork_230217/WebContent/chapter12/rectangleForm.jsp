<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean class="area.Rectangle2" id="area"></jsp:useBean>
    <jsp:setProperty property="*" name="area"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>당신이 입력한 정보입니다.</h4>
	가로길이가 <%= area.getNum1() %>이고, 세로길이가 <%= area.getNum2() %>인
	사각형의 면적은 <%= area.process(area.getNum1(), area.getNum2()) %>
</body>
</html>