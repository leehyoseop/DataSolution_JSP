<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action = "appleDAO" method = "GET">
		<table border = "1">
			|새로운 사과 등록|
			<tr>
				<td>지역 : <input name = "location" type = "text"></td>		
			</tr>
			<tr>
				<td>색깔 : <input name = "color" type = "text"></td>
			</tr>
			<tr>
				<td>가격 : <input name = "price" type = "text"></td>
			</tr>
			<input type="submit" value="전송"/>
		</table>
		
	</form>
</body>
</html>