<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>버킷리스트 없지만 만든다...후</h2>

<%
ArrayList<String> list = (ArrayList<String>)request.getAttribute("list");

for(String item : list){
	out.println(item+"<br>");
}
%>
</body>
</html>