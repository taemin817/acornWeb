<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>안녕하숑</h2>
서비스 출력부분<br>
<%
String result = (String)request.getAttribute("msg");
%>
<%=result %> <!-- = out.println(result); -->
</body>
</html>