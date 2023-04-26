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
		public String getday(){
			Calendar cal = Calendar.getInstance();
// 			int year = cal.get(Calendar.YEAR)-1;
// 			int month = cal.get(Calendar.MONTH)-1;
// 			int day = cal.get(Calendar.DATE)-3;
			
// 			***강사님 풀이***
			cal.add(Calendar.YEAR, -1);
			cal.add(Calendar.MONTH, -2);
			cal.add(Calendar.DATE, -3);
			
			int year = cal.get(Calendar.YEAR);
			int month = cal.get(Calendar.MONTH)+1;
			int day = cal.get(Calendar.DATE);
			
		return year+"-"+month+"-"+day;	
	}
	%>
	1년 2달 3일전 = <%= getday() %>
</body>
</html>