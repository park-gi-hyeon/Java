<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id = (String)session.getAttribute("id");
    	String name = (String)session.getAttribute("name");
    	String addr = (String)session.getAttribute("address");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script language="JavaScript" src="script.js"></script>
</head>
<body>
	<table border="1" align="center">
		<form name="update_form" method="post" action="memberUpdateOk.jsp">
			<tr height="50">
				<td colspan="2" align="center">
					<h1>회원 정보 수정</h1>
					'*' 표시 항목은 필수 입력 항목입니다.
				</td>
			</tr>
			<tr height="30">
				<td width="80">User ID</td>
				<td>
					<%= id %>
				</td>
			</tr>
			<tr height="30">
				<td width="80">암호</td>
				<td>
					<input type="password" size="20" name="mem_pwd">*
				</td>
			</tr>
			<tr height="30">
				<td width="80">암호 확인</td>
				<td>
					<input type="password" size="20" name="pwd_check">*
				</td>
			</tr>
			<tr height="30">
				<td width="80">이  름</td>
				<td>
					<%= name %>
				</td>
			</tr>
			<tr height="30">
				<td width="80">E-mail</td>
				<td>
					<input type="text" size="20" name="mem_email">*
				</td>
			</tr>
			<tr height="30">
				<td width="80">주  소</td>
				<td>
					<input type="text" size="20" name="mem_address">
				</td>
			</tr>
			<tr height="30">
				<td colspan="2" align="center">
					<input type="button" value="수정" onclick="update_check_ok()">
					<input type="reset" value="다시입력">
					<a href="login.jsp"><input type="button" value="수정안함"></a> 
				</td>
			</tr>
		</form>
	</table>
</body>
</html>