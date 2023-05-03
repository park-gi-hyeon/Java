<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	li{
		list-style: none;
	}
	.line{
		display: inline;

	}
	.border1{
		margin-left:30px; 
		padding-left:30px;
	}
</style>
<script>
	window.onload = function() {
		const noticeLink = document.getElementById("notice-link");
		const boardLink = document.getElementById("board-link");
		const faqLink = document.getElementById("faq-link");
		const qnaLink = document.getElementById("qna-link");
		const javaLink = document.getElementById("java-link");
		const jspLink = document.getElementById("jsp-link");
		const oracleLink = document.getElementById("oracle-link");
		const htmlLink = document.getElementById("html-link");
		const cssLink = document.getElementById("css-link");
		const content = document.getElementById("content");
	
		noticeLink.addEventListener("click", function() {
			content.textContent = "공지사항입니다.";
		});
	
		boardLink.addEventListener("click", function() {
			content.textContent = "게시판입니다.";
		});
	
		faqLink.addEventListener("click", function() {
			content.textContent = "FAQ입니다.";
		});
	
		qnaLink.addEventListener("click", function() {
			content.textContent = "QnA입니다.";
		});
		javaLink.addEventListener("click", function() {
			content.textContent = "JAVA입니다.";
		});
		jspLink.addEventListener("click", function() {
			content.textContent = "JSP입니다.";
		});
		oracleLink.addEventListener("click", function() {
			content.textContent = "Oracle입니다.";
		});
		htmlLink.addEventListener("click", function() {
			content.textContent = "HTML입니다.";
		});
		cssLink.addEventListener("click", function() {
			content.textContent = "CSS입니다.";
		});
	};
</script>
<body>
	<table class="table1" border="1">
        <tr height="70">
            <td colspan="2" width="800" class="border1">
                <li class="line" ><a href="#" id="notice-link">공지사항</a></li>&nbsp<b>|</b>
                <li class="line"><a href="#" id="board-link">게시판</a></li> &nbsp<b>|</b>
                <li class="line"><a href="#" id="faq-link">FAQ</a></li> &nbsp<b>|</b>
                <li class="line"><a href="#" id="qna-link">QnA</a></li>
            </td>
        </tr>
        <tr height="400">
            <td width="100">
                <li><a href="#" id="java-link">Java</a></li>
                <li><a href="#" id="jsp-link">Jsp</a></li>
                <li><a href="#" id="oracle-link">Oracle</a></li>
                <li><a href="#" id="html-link">HTML</a></li>
                <li><a href="#" id="css-link">CSS</a></li>
            </td>
            <td width="700" id="content">
            	공지사항입니다.
            </td>
        </tr>
        <tr height="70">
            <td colspan="2" width="800">Since 2021</td>
        </tr>
    </table>
</body>
</html>