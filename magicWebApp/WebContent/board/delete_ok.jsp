<%@page import="board.BoardDBBean"%>
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
		int num = Integer.parseInt(request.getParameter("b_id"));
		String pwd = request.getParameter("b_pwd");
		BoardDBBean db = new BoardDBBean();
		int re = db.deleteBoard(num,pwd);
		
		if(re == 1){
			%>
				<script>
					alert("삭제 성공하였습니다.");
					location.href="list.jsp";
				</script>
			<% 
		}else if(re == -2){
			%>
			<script>
				alert("비밀번호가 틀렸습니다.");
				history.back();
			</script>
		<%
		}else{
			%>
			<script>
				alert("삭제에 실패하였습니다.");
				history.back();
			</script>
		<%
		}
	%>
</body>
</html>