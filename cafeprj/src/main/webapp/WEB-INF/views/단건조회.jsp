<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="cafeprj.Goods" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>단 하나!</h2>
<% Goods g = (Goods)request.getAttribute("goods"); %>
id : <%=g.getId() %><br>
name : <%=g.getName() %><br>
price : <%=g.getPrice() %><br>
</body>
</html>