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
<%-- 	<jsp:include page="h01.jsp"></jsp:include> --%>
	<%@ include file="h01.jsp" %>
	<%! 
	public String calDate(){
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DATE)+1;
		
		return year+"-"+month+"-"+day;
	}
	%>
	<%= calDate() %>
	
</body>
</html>