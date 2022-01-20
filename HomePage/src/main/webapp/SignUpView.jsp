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
	<form action = "SignupController" method = "post">
		<table border = "2" align = "center" width ="300" height = "600">
			<tr>
				<td align = "center">
				이름 : <input name = "name"><hr>
				ID : <input name = "id" value = "${cookie.LastloginId.value }" placeholder="Enter ID"><hr>
				PW : <input name = "pw" type = "password" placeholder="Enter PW"><hr>
				<button><h3>회원가입완료^^</h3></button>
				</td>
			</tr>	
		</table>	
	</form>
</body>
</html>