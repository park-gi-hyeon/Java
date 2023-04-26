<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	if(session.getAttribute("Member")==null){
		%>
			<jsp:forward page="login.jsp"/>
		<% 
	}
%>
<%
	String uid = (String)session.getAttribute("id");
	String name = (String)session.getAttribute("name");
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table align="center" border="1">
		<form method="post" action="logOut.jsp">
			<tr>
				<td>안녕하세요.<%= name %> (<%= uid %>)님</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="로그아웃">
					&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					<input type="button" value="회원정보변경" onclick="javascript:window.location='memberUpdate.jsp'">
				</td>
			</tr>
		</form>
	</table>
</body>
</html>