<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
 <style>
      .whole {
        background-color: pink;
      }
     
</style>

<body>
	<table class = "whole" border = "1" width = "700" >
		<tr>
			<td colspan="3" align = "center"><h1>제목 ⎝㋡⎠</h1></td>
		</tr>
		<c:forEach var = "m" items = "${memos }">
			<tr>
			<td colspan="3" align = "center" height = "50">
				${m.m_no }&nbsp;&nbsp;${m.m_text }&nbsp;&nbsp;${m.m_date }  
				<button onclick = "location.href='UpdateController?m_no=${m.m_no}'">수정</button>
				<button onclick = "location.href='DeleteController?m_no=${m.m_no}'">삭제</button>
			</td>
		</tr>
		</c:forEach>	
		<form action = "MemoController" method = "GET">
			<tr>
				<td>
					내용 <textarea name = "content" placeholder="Content"></textarea>
				</td>
				<td>
					날짜 <input name = "date" placeholder="YYYYMMDD">
				</td>
				<td align = "center">
					&nbsp;<button><h1>등록</h1></button>
				</td>  
			</tr>
		</form>
	</table>
</body>
</html>