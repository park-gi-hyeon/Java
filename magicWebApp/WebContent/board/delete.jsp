<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
  request.setCharacterEncoding("utf-8");
%>
<%
	String b_id = request.getParameter("b_id");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script language="JavaScript" src="board.js"></script>
</head>
<body>
	<center>
		<h1>글 삭 제 하 기</h1>
		<p><h4>>> 암호를 입력하세요. << </h4></p>
		<form action="delete_ok.jsp?b_id=<%= b_id %>" method="post" name="reg_frm">
			<table>
				<tr>
					<td> 
						암  호<input type="password" name="b_pwd">
					</td>
				</tr>
				<tr>
					<td>
						<input type="button" value="글삭제" onclick="delete_ok()">
						<input type="reset" value="다시작성">
						<input type="button" value="글목록" onclick="javascript:window.location='list.jsp'">  
					</td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>