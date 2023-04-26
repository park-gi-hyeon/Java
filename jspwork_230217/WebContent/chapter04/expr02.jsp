<%@page import="java.util.Calendar"%>
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
		public String calDate(){
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.MONTH, 1);
			
			int year = cal.get(Calendar.YEAR);
			int month = cal.get(Calendar.MONTH)+1;
			int day = cal.get(Calendar.DATE);
			
			return year+"-"+month+"-"+day;
		}
	%>
	
	<%= calDate() %>
</body>
</html>