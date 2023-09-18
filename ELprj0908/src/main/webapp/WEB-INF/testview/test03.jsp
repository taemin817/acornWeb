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

<c:set var="kor" value="${score}" />

<h3>성적에 따라 A, B, C, D, F(70미만) 출력</h3>
kor 변수에 점수를 임의로 정하고 구하기<br>
kor이 "${kor}"<!-- 이거 왜 안나와 -->일 때 : 
<c:choose>
<c:when test="${ kor == 100 }">A</c:when>
<c:when test="${ kor >= 90 }">B</c:when>
<c:when test="${ kor >= 80 }">C</c:when>
<c:when test="${ kor >= 70 }">D</c:when>
<c:otherwise>F</c:otherwise>
</c:choose>
</body>
</html>