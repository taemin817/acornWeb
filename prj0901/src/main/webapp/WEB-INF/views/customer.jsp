<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="prj0901.Customer" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>고객 나부랭이 정보</h2>
<% Customer c = (Customer)request.getAttribute("customer"); %>
id : <%=c.getId() %><br>
pw : <%=c.getPw() %><br>
name : <%=c.getName() %><br>
</body>
</html>