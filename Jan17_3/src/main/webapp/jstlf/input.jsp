<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<fmt:formatNumber value = "${a }" type = "number"/>
	
	<fmt:formatNumber value = "${a }" type = "currency"></fmt:formatNumber>
	
	<fmt:formatNumber value = "${b }" type = "percent"></fmt:formatNumber>
	
	<fmt:formatNumber value = "${c }" pattern = "#.00"></fmt:formatNumber>
	
	<fmt:formatNumber value = "${d }" type = "date" dateStyle = "long"></fmt:formatNumber>
	<fmt:formatNumber value = "${d }" type = "date" dateStyle = "short"></fmt:formatNumber>
	
	<fmt:formatNumber value = "${d }" type = "time" dateStyle = "short"></fmt:formatNumber>
	<fmt:formatNumber value = "${d }" type = "time" dateStyle = "long"></fmt:formatNumber>
	
	<fmt:formatNumber value = "${d }" type = "both" dateStyle = "long" timeStyle ="short"></fmt:formatNumber>

</body>
</html>