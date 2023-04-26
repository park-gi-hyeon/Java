<%@page import="magic.member.MemberBean"%>
<%@page import="magic.member.MemberDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="mb" class="magic.member.MemberBean"></jsp:useBean>
    <jsp:setProperty property="*" name="mb"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		String id = request.getParameter("mem_uid");
		String pwd = request.getParameter("mem_pwd");
		
	 	MemberDBBean manager = MemberDBBean.getInstance();
	 	int check = manager.userCheck(id, pwd);
	 	mb = manager.getMember(id);
		
		if(mb== null){
			%>
			<script>
				alert("존재하지 않는 회원");
				history.back();
			</script>
			<% 
		}else{
			String name=mb.getMem_name();
			if(check==1){
				session.setAttribute("id", id);
				session.setAttribute("name", name);
				session.setAttribute("Member", "yes");
				response.sendRedirect("main.jsp");
			}else if(check==0){
				%>
				<script>
					alert("비밀번호가 맞지 않습니다.");
					history.back();
				</script>
				<% 
			}else{
				%>
				<script>
					alert("아이디가 맞지않습니다..");
					history.back();
				</script>
				<% 
			}
		}
	%>
</body>
</html>