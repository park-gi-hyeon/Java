<%@page import="java.net.InetAddress"%>
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
		// 자바 클래스 이용해서 ip추가
		InetAddress address = InetAddress.getLocalHost();
		//getHostAddress() :ip주소 가져오는 메소드
		String ip = address.getHostAddress();
		//ip 추가 (0:0:0:0:0:0:0:1)
// 		board.setB_ip(request.getRemoteAddr());
		board.setB_ip(ip);
		
 		//오늘 날짜 추가
		board.setB_date(new Timestamp(System.currentTimeMillis()));
		BoardDBBean db = BoardDBBean.getinstance();
		int re = db.insertBoard(board);
		if(re==1){//글 등록 성공
			%>
				<script>
					alert("글을 등록하셨습니다.");
					location.href="list.jsp";
				</script>
			<%
		}else{// 글 등록 실패
			%>
			<script>
				alert("글 등록이 실패했습니다.");
				location.href="write.jsp";
			</script>
		<%
		}
	%>
</body>
</html>