<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table>
		<c:forEach var = "fruit" items = "${fruits }">
			<tr>
				<td>${fruit.f_name }</td>
				<td>${fruit.f_price }</td>
			</tr>
		</c:forEach>	
	</table>
	
	<tr>
		<a href = "registerFruit">과일 등록</a> 
	</tr>
	<hr>
		<a href = "fruitController">홈화면</a>
</body>
</html>