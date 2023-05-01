<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="board.BoardBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="board.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    request.setCharacterEncoding("utf-8");
 	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>게시판에 등록된 글 목록 보기</h1>
		<table width="600">
			<tr>
				<td align="right">
					<a href="write.jsp">글 쓰 기</a>
				</td>
			</tr>
		</table>
	</center>
		<center>
			<table border="1" align="center" cellspacing="0">
				<tr>
					<td align="center" width="80">번호</td>
					<td align="center" width="500">글제목</td>
					<td align="center" width="200">작성자</td>
					<td align="center" width="200">작성일</td>
					<td align="center" width="200">조회수</td>
				</tr>
				<%
					BoardDBBean db = BoardDBBean.getinstance();
				     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
					//호출된 메소드의 데이터 타입으로 받아주면 됨
					ArrayList<BoardBean> list =db.listBoard();
	// 				boardList 에 있는 오라클 데이터를 가져옴
					for(int i=0; i<list.size(); i++){
	// 					ArrayList데이터의 BoardBean 객체를 가져온다
						BoardBean board = list.get(i);
	// 					board 객체에 있는 컬럼의 데이터를 가져온다
						int b_id = board.getB_id();
						String b_name = board.getB_name();
						String b_email= board.getB_email();
						String b_title = board.getB_title();
						String b_content = board.getB_content();
						Timestamp b_date = board.getB_date();
						int b_hit = board.getB_hit();
				%>
				<tr bgcolor="#f7f7f7" 
				onmouseover="this.style.backgroundColor='#eeeeef'" 
				onmouseout="this.style.backgroundColor='#f7f7f7'">
					<td align="center"><%= b_id %></td>
					<td><a href="show.jsp?b_id=<%= b_id %>">
							<%= b_title %>
						</a>
					</td>
					<td align="center">
						<a href="mailto:<%= b_email %>">
							<%= b_name %>
						</a>
					</td>
					<td><%= sdf.format(b_date) %></td>
					<td><%= b_hit %></td>
				</tr>
				<% 
					}
				%>
			</table>
		</center>
	</form>
</body>
</html>