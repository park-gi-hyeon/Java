<!-- 데이터 update 처리하는 jsp -->
<%@page import="magic.member.MemberDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="member" class="magic.member.MemberBean" ></jsp:useBean>
<!-- name="mem_pwd" -->
<!-- name="mem_pwd_check" -->
<!-- name="mem_email" -->
<!-- name="mem_addr" -->
<!-- 넘어온값을 세팅 -->
<!--    private String mem_uid; -->
<!-- 	private String mem_pwd; -->
<!-- 	private String mem_name; -->
<!-- 	private String mem_email; -->
<!-- 	private String mem_address; -->
<jsp:setProperty property="*" name="member"/>
<%
	MemberDBBean manager = MemberDBBean.getInstance();
	String id = (String)session.getAttribute("id");
	member.setMem_uid(id);
	int re = manager.updateMember(member);
	
	if(re==1){
		%>
			<script>
				alert("입력하신 대로 회원정보가 수정되었습니다.");
				document.location.href="main.jsp";
			</script>
		<% 
	}else{
		%>
		<script>
			alert("수정이 실패했습니다.");
			history.go(-1);
		</script>
	<% 
	}
%> 
