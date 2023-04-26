<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		response.setIntHeader("refresh", 5);
// 		Date currentDate = new Date();
//     	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss a");
//     	String formattedDate = sdf.format(currentDate);

		Calendar calendar = Calendar.getInstance();
		String am_pm;
// 		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		
		if(calendar.get(Calendar.AM_PM)==0){//0일떄 오전
			am_pm="AM";
		}else{
			am_pm="PM";
		}
		String CT = hour+":"+minute+":"+second+am_pm; 
	%>
	
	<b>현재시간은 <%= CT %></b><br>
	<a href="response_data.jsp">Google 홈페이지로 이동하기</a>
</body>
</html>