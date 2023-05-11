<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="itemWriteResult.jsp" method="post">
		<h2>정보 입력 폼</h2>
			<table>
				<tr>
					<td>상품명 </td>
					<td><input type="text" name="name" maxlength="20"></td>
				</tr>
				<tr>
					<td>가격</td>
					<td><input type="text" name="price" maxlength="8"></td>
				</tr>
				<tr>
					<td>설명</td>
					<td><textarea rows="20" cols="40"name="description" maxlength="100"></textarea></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="전송">
						<input type="reset" value="취소">  
					</tr>
				<tr>
			</table>
	</form>
</body>
</html>