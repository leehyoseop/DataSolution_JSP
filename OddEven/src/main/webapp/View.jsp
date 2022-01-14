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
		String result = (String) request.getAttribute("result");
	%>
	<table border = "1">
		<tr>
			<td>Ȧ<a href = "Control?UserPick=odd";><img src = "odd.png" width = "300"></a></td>	
			
			<td>¦<a href = "Control?UserPick=even";><img src = "even.png" width = "300"></a></td>	
		</tr>
		
		<tr>
			<%=result %>
		</tr>
	</table>
</body>
</html>