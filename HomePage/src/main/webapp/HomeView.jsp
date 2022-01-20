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
<script type="text/javascript">
	function SignUp() {
		location.href = "UserController";
	}
</script>
<body>
	<table width = "800" height = "1000" border = "2" align ="center">
		<tr>
			<td colspan = "2" valign = "top" align = "center" height = "50">
				<h1>싸이월드</h1>
				<img alt="" src=cyworld.jpg height = "150">
			</td>
		</tr>
		<hr>
		<tr>
			<td valign = "middle" align = "center" height = "100">
				<a href = "MessageBoard"><h2>도토리게시판-></h2></a>				
			</td>
			<td align = "right" valign="top" width = "50">
				<table>
					<form action = "UserController" method = "post">
						ID : <input name = "id"><p>
						PW : <input name = "pw" type = "password"><p>
						<button><h3>로그인</h3></button>&nbsp;&nbsp;&nbsp;
					</form>
						<button onclick="SignUp();"><h3>회원가입</h3></button>&nbsp;
				</table>
				<jsp:include page = "${detail }"></jsp:include>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				게시판 내용 출력시 jsp include 따오기		
			</td>
		</tr>	
		
		
		
	</table>
</body>
</html>