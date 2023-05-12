<%@page import="com.jspsmart.upload.File"%>
<%@page import="com.jspsmart.upload.SmartUpload"%>
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
	
		//파일 업로드 처리
		SmartUpload upload= new SmartUpload();
		upload.initialize(pageContext);
		upload.upload();
		
		String fName="";
		int fileSize= 0;
		
		File file =  upload.getFiles().getFile(0);
		
		if(!file.isMissing()){
			fName = file.getFileName();
			file.saveAs("/upload/"+file.getFileName());
			fileSize = file.getSize();
		}
		
		
		// 자바 클래스 이용해서 ip추가
		InetAddress address = InetAddress.getLocalHost();
		//getHostAddress() :ip주소 가져오는 메소드
		String ip = address.getHostAddress();
		//ip 추가 (0:0:0:0:0:0:0:1)
// 		board.setB_ip(request.getRemoteAddr());
		board.setB_ip(ip);
		
 		//오늘 날짜 추가
		board.setB_date(new Timestamp(System.currentTimeMillis()));
 		
 		//파일 업로드 처리
 		board.setB_fname(fName);
 		board.setB_fsize(fileSize);
 		
 		board.setB_name(upload.getRequest().getParameter("b_name"));
 		board.setB_email(upload.getRequest().getParameter("b_email"));
 		board.setB_title(upload.getRequest().getParameter("b_title"));
 		board.setB_content(upload.getRequest().getParameter("b_content"));
 		board.setB_pwd(upload.getRequest().getParameter("b_pwd"));
//  		board.setB_id(Integer.parseInt(upload.getRequest().getParameter("b_id")));
//  		board.setB_ref(Integer.parseInt(upload.getRequest().getParameter("b_ref")));
//  		board.setB_step(Integer.parseInt(upload.getRequest().getParameter("b_step")));
//  		board.setB_level(Integer.parseInt(upload.getRequest().getParameter("b_level")));
 		
 		
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