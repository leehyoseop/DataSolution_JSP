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
		//����ڰ� ��� �׼��� ���� �� �̵� : ��û
		//		-<a>�±׸� �Ἥ : Get������� ��û
		//		-JS�� �Ἥ : ??? ���� �� Get���
		//			(JS�� HTML����°� ���� -> JS�� <form>�� ����� POST�� ���� O)
		//		-<form> + <button> : ��ư Ŭ������ �� GET/POST���
		
	%>
	
	d : ${sessionScope.d }<p>
	e : ${cookie.e.value }
	<hr>
	<a href = "SecondC?a=10&b=100">SecondC��</a>
	<hr>
	<div onclick ="gogo();">SecondC��</div>
	<hr>
	<form action = "SecondC">
		<input name = "a">
		<input name = "b">
	</form>
</body>
</html>