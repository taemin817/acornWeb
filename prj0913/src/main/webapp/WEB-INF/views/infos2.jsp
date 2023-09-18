<%@page import="java.util.ArrayList"%>
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
<h3>과일정보</h3>
<c:set var="list"	value="${infos['fruits'] }" />
<c:forEach var="item" items="${list}">
${item}
</c:forEach>

<h3>음료정보</h3>
<c:set var="list2"	value="${infos['beverage'] }" />
<c:forEach var="item" items="${list2}">
${item}
</c:forEach>
</body>
</html>