<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
		<table border = "1" width = "400">
			<tr>
				<td align = "center">����</td>
				
				<td align = "center">����</td>
				
				<td align = "center"><a href = "appleRegister">[��� ���]</a></td>
			</tr>
			<tr>
				<c:forEach var = "apple" items = "${apples }">
				  <tr class = "dataTr">
				  		<td>${apple.a_location }</td>
				  		<td colspan = "2">${apple.a_color }</td>
				  </tr>
				</c:forEach>
			</tr>
				
		</table>
</body>
</html>