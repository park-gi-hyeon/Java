<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean class="area.Circle" id="myBean"></jsp:useBean>
<h4>원의 면적 출력하기</h4>
반지름이10인 원의 면적은
<%=myBean.process(10)%>
