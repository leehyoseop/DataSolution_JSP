<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 3���ٿ��� prefix = "c"�� �����̴�! -->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>${param.n }</h1>
	<c:if test = "${param.n % 2 == 0}">
		¦��
	</c:if>
	
	<c:choose>
		<c:when test = "${param.n > 10}">
		10���� ũ��
		</c:when>
		<c:when test = "${param.n > 5}">
		5���� 10����
		</c:when>
		<c:otherwise>
			������
		</c:otherwise>
	</c:choose>
	
	<%
			
	%>
	<c:forEach var = "v" begin = "1" end = "${param.n }" step="2">
		<marquee>${v }</marquee>
	</c:forEach>
	
	<c:forEach var = "i" items = "${arr }">
			<marquee>${arr }</marquee>
	</c:forEach>
	
	<c:forEach var = "hyoseop" items = "${al }">
	${Hyoseop.name } - ${Hyoseop.age }
	
	</c:forEach>
</body>
</html>