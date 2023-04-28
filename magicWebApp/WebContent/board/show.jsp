<%@page import="java.text.SimpleDateFormat"%>
<%@page import="board.BoardBean"%>
<%@page import="board.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%
    request.setCharacterEncoding("utf-8");
 	%>
<!DOCTYPE html>
<%
	int b_id = Integer.parseInt(request.getParameter("b_id"));
	BoardDBBean db = new BoardDBBean();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
	//board 객체에 게시글의 정보가 저장되어 있음
	BoardBean bb=db.getBoard(b_id);
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>글 내 용 보 기</h1>
	</center>
	<center>
		<table border="1" cellspacing="0" width="600">
			<tr align="center" height="30">
				<td width="100">글 번호</td>
				<td width="200"><%=bb.getB_id() %></td>
			</tr>
			<tr height="30" align="center">
				<td width="100">작성자</td>
				<td width="200"><%= bb.getB_name() %></td>
				<td width="100">작성일</td>
				<td><%= sdf.format(bb.getB_date()) %></td>
			</tr>
			<tr height="30" align="center">
				<td width="100">글제목</td>
				<td width="200" align="left" colspan="4"><%= bb.getB_title() %></td>
			</tr>
			<tr height="30" align="center">
				<td width="100">글내용</td>
				<td width="200" align="left" colspan="4" ><%= bb.getB_content() %></td>
			</tr>
		</table>
	</center>
</body>
</html>