<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
	function gogo(){
		location.href = "SecondC?a=20&b=20";
	}
</script>
</head>
<body>
	<%
		//사용자가 어떠한 액션을 했을 때 이동 : 요청
		//		-<a>태그를 써서 : Get방식으로 요청
		//		-JS를 써서 : ??? 했을 때 Get방식
		//			(JS로 HTML만드는게 가능 -> JS로 <form>을 만들면 POST도 가능 O)
		//		-<form> + <button> : 버튼 클릭했을 때 GET/POST방식
		
	%>
	
	d : ${sessionScope.d }<p>
	e : ${cookie.e.value }
	<hr>
	<a href = "SecondC?a=10&b=100">SecondC로</a>
	<hr>
	<div onclick ="gogo();">SecondC로</div>
	<hr>
	<form action = "SecondC">
		<input name = "a">
		<input name = "b">
	</form>
</body>
</html>