<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<style>
#topval{
	color:red;
	background-color: pink;
}

#bottomval {
  position: static;
  left = 100px;
  right = 150px;
  color:blue;
  background-color: pink;
}

</style>
<body>
	<table border = "1" width = "1200" height = "800">
		<tr> 
			<td id = "topval" align ="center" colspan="4" height = "100">제목</td> 
		</tr>
		<tr>
			<td align ="center" colspan="4">
			<img alt="No picture" src="simpson.gif">
			<p>
			<jsp:include page = "${content }"></jsp:include>
			</td>
		</tr>
		<tr id = "bottomval" align ="center" valign="bottom" >
			<td><a href = "appleController">Apple</a></td>
			<td><a href = "second">second</a></td>
			<td><a href = "third">third</a></td>
			<td><a href = "">DB 연결</a></td>
		</tr>
	
	
	</table>
</body>
</html>