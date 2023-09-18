<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>수를 입력받아 별 찍기</h3>

<%

String su1_ = request.getParameter("su1");
		
		int su1 = Integer.parseInt(su1_);
		
		for(int i = 1; i<=su1; i++) {
			out.println("*");
		}
		%>
</body>
</html>