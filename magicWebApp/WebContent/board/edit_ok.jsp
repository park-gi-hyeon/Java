<%@page import="board.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="bd" class="board.BoardBean"></jsp:useBean>
<jsp:setProperty property="*" name="bd"/>
<%
	BoardDBBean manager = BoardDBBean.getinstance();
	int re = manager.editBoard(bd);
	
	if(re==1){//수정 성공
		%>
			<script>
				alert("수정 성공하셨습니다.");
				location.href="list.jsp";
			</script>
		<%
	}else if(re==0){// 비밀번호 틀림
		%>
		<script>
			alert("비밀번호가 틀렸습니다.");
			history.back();
		</script>
	<%
	}else{
		%>
		<script>
			alert("수정에 실패하였습니다.");
			history.back();
		</script>
	<%
	}
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>