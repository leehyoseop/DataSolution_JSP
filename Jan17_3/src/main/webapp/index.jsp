<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table id = sitetable border = "1" width = "800">
		<tr align = "center">
			<td>
				:::�ױ۷��� �����̾��:::
			</td>	
		</tr>
		
		<tr>
			<td align ="center" width = "300">
				<img src = "MU.jpg" width = "300">
				<a href = "https://www.manutd.com/ko">	
				��ü���� ������Ƽ��
				</a>
			</td>
			
			<td align ="center" width = "300">
				<img src = "CH.jpg" width = "300">
				<a href = "calC">
				����ϱ�
				</a>
			</td>
			
			<td align ="center" width = "300">
				<img src = "TOT.jpg" width = "300">
				<a href = "JSTLCController">
				JSTL-Core
				��Ʈ��
				</a>
			</td>
			
			<td align ="center" width = "300">
				<img src = "LVP.jpg" width = "300">
				<a href = "JSTLFController">
				JSTL-Formatting
				����Ǯ
				</a>
			</td>
		</tr>
		
		<tr>
			<td>
			<a href = "https://search.naver.com/search.naver?sm=tab_sug.top&where=nexearch&query
			=epl+%EC%88%9C%EC%9C%84&oquery=%EC%9E%89%EA%B8%80%EB%9E%9C%EB%93%9C+%ED%94%84%EB%A6%AC%EB%AF%B8%EC%96%B4%EB%A6%AC%EA%B7%B8&tqi
			=hPgtksp0J14ssPXYc0Gssssss6R-202829&acq=epl&acr=1&qdt=0">���� ���� ��������-[Ŭ��]></a>
			</td>
		</tr>
		<tr>
			<td>
			<jsp:include page = "${detail }"></jsp:include>
			</td>
		</tr>
	</table>
</body>
</html>