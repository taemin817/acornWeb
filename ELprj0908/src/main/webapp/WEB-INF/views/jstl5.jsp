<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% String path = request.getContextPath(); %>
	<img src="<%=path%>/img/bookA.jfif">
	<img src="<%=path%>/img/bookB.jpg">
	<img src="<%=path%>/img/bookC.webp">
	<table>
		<tr>
			<td>코드</td>
			<td>이름</td>
			<td>가격</td>
		</tr>
		<c:forEach var="book" items="${ books }">
		<tr>
			<td>${ book.code }</td>
			<td>${ book.name }</td>
			<td>${ book.price }</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>