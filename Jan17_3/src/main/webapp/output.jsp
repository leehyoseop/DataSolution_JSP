<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<% 
		int x = Integer.parseInt(request.getParameter("x"));
		int y = Integer.parseInt(request.getParameter("y"));
		int sum = x+y;
		int min = x-y;
		int mul = x*y;
		int div = x/y;
	%>
	�� : <%=sum %><p>
	�� : <%=min %><p>
	�� : <%=mul %><p>
	������ : <%=div %>
</body>
</html>