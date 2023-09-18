<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>원하는 단 출력하기</h3>

<%
String su1_ = request.getParameter("su1");

int su1 = Integer.parseInt(su1_);

for(int i=1; i<10; i++){
	out.println(su1*i);
}
%>
</body>
</html>