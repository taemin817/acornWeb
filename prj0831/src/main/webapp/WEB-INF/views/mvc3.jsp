<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>my favorites</h3>

<%
String[] list = (String[])request.getAttribute("likey");

for(String item : list){
	out.println(item +"<br>");
}
%>
</body>
</html>