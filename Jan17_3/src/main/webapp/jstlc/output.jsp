<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 3번줄에서 prefix = "c"는 국룰이다! -->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>${param.n }</h1>
	<c:if test = "${param.n % 2 == 0}">
		짝수
	</c:if>
	
	<c:choose>
		<c:when test = "${param.n > 10}">
		10보다 크다
		</c:when>
		<c:when test = "${param.n > 5}">
		5에서 10사이
		</c:when>
		<c:otherwise>
			나머지
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