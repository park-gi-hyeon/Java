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
		//넘어 오는 페이지 번호를 변수에 저장
		String pageNum = request.getParameter("pageNum");
	
		int num = Integer.parseInt(request.getParameter("b_id"));
		String pwd = request.getParameter("b_pwd");
		BoardDBBean db = new BoardDBBean();
// 		글 삭제를 위해서 글 번호와 비밀번호를 가지고 메소드 호출
		int re = db.deleteBoard(num,pwd);
		
		if(re == 1){
			%>
				<script>
				//비밀번호 일치로 글목록 이동
					alert("삭제 성공하였습니다.");
					location.href="list.jsp?pageNum"+<%=pageNum%>;
				</script>
			<% 
		}else if(re == -2){//비밀 번호 틀림
			%>
			<script>
				alert("비밀번호가 틀렸습니다.");
				history.back();
			</script>
		<%
		}else{//삭제 실패
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