<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
		double num = 3.14159;
		public double getDouble(){
			return num;
		}
	%>
	
	<%= getDouble()%>
</body>
</html>