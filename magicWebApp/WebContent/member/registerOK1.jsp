<%@page import="magic.member.MemberDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="mb" class="magic.member.MemberBean"></jsp:useBean>
<!--      폼 양식에서 전달되는 파라미터 값 얻어와서 mb 객체의 프로퍼티 값으로 저장 -->
<!-- 	MemberBean 에서의 uid,pwd...,addr까지의 값을 전부다 *로 다 받아와서 setProperty가 된다 -->
    <jsp:setProperty property="*" name="mb"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		MemberDBBean manager=MemberDBBean.getInstance(); 
	
	
		if(manager.confirmID(mb.getMem_uid())==1){
			%>
				<script>
					alert("중복되는 아이디가 존재합니다.");
					history.back();
				</script>
			<% 
		}else{//아이디 중복이 아님
			int re = manager.insertMember(mb);
			if(re==1){
				%>
					<script>
						alert('회원가입을 축하드립니다.\n회원으로 로그인 해주세요');
						document.location.href="login.jsp";
					</script>
				<% 
			}else{//insert 정상적으로 실행이 안됨
				%>	
					<script>
						alert("회원가입에 실패했습니다.");
						document.location.href="login.jsp";
					</script>
				<% 
			}
			
		}
	%>
</body>
</html>