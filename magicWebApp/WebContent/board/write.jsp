<%@page import="board.BoardBean"%>
<%@page import="board.BoardDBBean"%>
<%
    request.setCharacterEncoding("utf-8");

	//넘어 오는 페이지 번호를 변수에 저장
	String pageNum = request.getParameter("pageNum");
	 if(pageNum == null){
	    	pageNum = "1";
	    }

 	int b_id = 0,b_ref=1, b_step=0, b_level=0;
 	String b_title="";
	if(request.getParameter("b_id") != null){//답변글(show.jsp에서 글번호를 가지고 옴)
		b_id = Integer.parseInt(request.getParameter("b_id"));
	}
	
	BoardDBBean db = BoardDBBean.getinstance();
	BoardBean board = db.getBoard(b_id, false);
	
	if(board != null){//답변글
		// db에 insert 하기 위한 로직
		b_ref = board.getB_ref();
		b_step = board.getB_step();
		b_level = board.getB_level();
		b_title = board.getB_title();
	}
	
	System.out.println("@@@>b_step "+b_step);
	System.out.println("@@@>b_level "+b_level);
 %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
 
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script language="JavaScript" src="board.js" charset="utf-8"></script>
</head>
<body>
	<center>
		<h1>글 올 리 기</h1>
		<form name="reg_frm" method="post" action="write_ok.jsp" enctype="multipart/form-data">
			<input type="hidden" name="b_id" value="<%= b_id %>">
			<input type="hidden" name="b_ref" value="<%= b_ref %>">
			<input type="hidden" name="b_step value="<%= b_step %>">
			<input type="hidden" name="b_level" value="<%= b_level %>">
			<table align="center">
				<tr height="30">
					<td width="50">작성자</td>
					<td width="120">
						<input  type="text" name="b_name" maxlength="20">
					</td>
					<td width="50">이메일</td>
					<td width="240">
						<input  type="text" name="b_email" maxlength="50">
					</td>
				</tr>
				<tr height="30">
					<td width="80">글제목   </td>
					<td colspan="3"  width="450">
<!-- 						<input type="text" size="55" name="b_title" maxlength="80"> -->
						<%
// 							[답변]: 의 존재 여부
							if(b_id==0){//신규글
						%>
						<input type="text" size="55" name="b_title" maxlength="80">						
						<%
							}else{//답변글
						%>
						<input type="text" size="55" name="b_title" maxlength="80" value="[답변]:<%= b_title %>">
						<% 														
							}
						%>
					</td>
				</tr>
				<tr>
					<td width="80">파   일</td>
					<td colspan="3" width="140">
						<input type="file" name="b_fname" size="40" maxlength="80">
					</td>
				</tr>
				<tr>
					<td colspan="4" align="center">
						<textarea rows="30" cols="70"name="b_content"></textarea>
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
						<input type="button" value="글쓰기" onclick="check_ok()"> &nbsp
						<input type="reset" value="다시입력">
						<input type="button" value="글목록" onclick="javascript:window.location='list.jsp?pageNum=<%= pageNum %>'">
					</td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>