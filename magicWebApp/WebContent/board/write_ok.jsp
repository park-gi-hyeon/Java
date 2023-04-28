<%@page import="java.sql.Timestamp"%>
<%@page import="board.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    request.setCharacterEncoding("utf-8");
 	%>
    <jsp:useBean class="board.BoardBean" id="board"></jsp:useBean>
    <jsp:setProperty property="*" name="board"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		board.setB_date(new Timestamp(System.currentTimeMillis()));
		BoardDBBean db = BoardDBBean.getinstance();
		int re = db.insertBoard(board);
		if(re==1){//글 등록 성공
			%>
				<script>
					alert("글을 등록하셨습니다.");
				</script>
			<%
			response.sendRedirect("list.jsp");
		}else{// 글 등록 실패
			%>
			<script>
				alert("글 등록이 실패했습니다.");
			</script>
		<%
		response.sendRedirect("write.jsp");
		}
	%>
</body>
</html>