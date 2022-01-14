<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

</head>
<body>

	<table border = "1">
	
		<tr>
			<td><a href = "C?userhand=1";><img name="s" id="s" src = "sissor.jpg" width = "300"></a></td>
			<td><a href = "C?userhand=2";><img name="r" id="r" src = "rock.jpg" width = "300"></a></td>
			<td><a href = "C?userhand=3";><img name="p" id="p" src = "paper.png" width = "300"></a></td>
		</tr>
		<tr>
			<td><%=(Integer)request.getAttribute("cnt") %></td>
			<td><img name="p" id="p" src = "<%=(String)request.getAttribute("usrhand") %>.png" width = "300"></td>
			<td></td>
		</tr>
	</table>  
</body>
</html>