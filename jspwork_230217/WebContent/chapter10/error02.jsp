<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<%
// 	응답이 정상적으로 된 상태로 결정
	response.setStatus(HttpServletResponse.SC_OK);
%>
에러 발생
<br>
<!-- 오류에 대한 기본 메시지 -->
<!-- is ErrorPage="true"가 있어야 사용가능 -->
<%= exception.getMessage() %>