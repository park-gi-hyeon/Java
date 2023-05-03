<%@page import="board.BoardBean"%>
<%@page import="board.BoardDBBean"%>
<%
    request.setCharacterEncoding("utf-8");
 	%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	int b_id = Integer.parseInt(request.getParameter("b_id"));
	BoardDBBean db = BoardDBBean.getinstance();
	BoardBean bb = db.getBoard(b_id, false);
%>
 
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script language="JavaScript" src="board.js" charset="utf-8"></script>
</head>
<body>
	<center>
		<h1>글 수 정 하 기</h1>
		<form name="reg_frm" method="post" action="edit_ok.jsp?b_id=<%=b_id%>">
			<table align="center">
				<tr height="30">
					<td width="50">작성자</td>
					<td width="120">
						<input  type="text" name="b_name" maxlength="20" value="<%= bb.getB_name() %>">
					</td>
					<td width="50">이메일</td>
					<td width="240">
						<input  type="text" name="b_email" maxlength="50" value="<%= bb.getB_email() %>">
					</td>
				</tr>
				<tr height="30">
					<td width="80">글제목   </td>
					<td colspan="3"  width="450">
						<input type="text" size="55" name="b_title" maxlength="80" value="<%= bb.getB_title() %>">
					</td>
				</tr>
				<tr>
					<td colspan="4" align="center">
						<textarea rows="30" cols="70"name="b_content"><%= bb.getB_content() %></textarea>
					</td>
				</tr>
				<tr height="30">
					<td width="80">암&nbsp;&nbsp;호</td>
					<td colspan="3" width="460">
						<input name="b_pwd" maxlength="12" size="12" type="password">
					</td>
				</tr>
				<tr align="center" height="50">
					<td colspan="4">
						<input type="button" value="글수정" onclick="check_ok()"> &nbsp
						<input type="reset" value="다시입력">
						<input type="button" value="글목록" onclick="javascript:window.location='list.jsp'">
					</td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>