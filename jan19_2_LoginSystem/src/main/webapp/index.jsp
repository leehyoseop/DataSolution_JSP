<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action = "LoginController" method = "post">
		ID <input name = "id" value = "${cookie.lastLoginId.value }"placeholder="id�Է�"><p>
		PW <input name = "pw" type = "password" placeholder="pw�Է�">
		<hr>
		<button>�α���</button>
	</form>
</body>
</html>