<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="prj0825.test04_bookclass" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>책 정보</h3>
<%
test04_bookclass book = new test04_bookclass("재미있는서블릿", "lee", 25000);
out.println(book);
%>
</body>
</html>