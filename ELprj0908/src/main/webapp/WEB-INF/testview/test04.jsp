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

<h3>좋아하는것 배열만들고 배열요소 출력하기</h3>
<c:forEach var="list" items="${ list }">${ list }<br></c:forEach>

</body>
</html>