<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean class="hello.HelloBean" id="myBean"></jsp:useBean>
<hr>
*. 빈 생성 후 저장된 값 출력하기<br>
<%-- 이름 : <%= myBean.getName() %> 와 동일 --%>
이름 : <jsp:getProperty property="name" name="myBean"/><br>
나이 : <jsp:getProperty property="age" name="myBean"/><br>
*, 빈 생성 후 저장된 값 출력하기<br>
<%-- <% myBean.setName("전수빈"); %> 와 동일 --%>
<jsp:setProperty property="name" name="myBean" value="전수빈"/>
<jsp:setProperty property="age" name="myBean" value="10"/>
이름 : <jsp:getProperty property="name" name="myBean"/><br>
나이 : <jsp:getProperty property="age" name="myBean"/><br>