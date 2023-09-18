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

	<%
	Integer kor = (Integer)request.getAttribute("score");
	if(kor >= 90){
		out.println("A");
	} else if(kor >= 80){
		out.println("B");
	} else if(kor >= 70){
		out.println("C");
	} else {
		out.println("F");
	}
	%>

<h2>EL 사용</h2>
<c:if test="${ score >=90 }">장학금 지급 대상</c:if><br>
<c:choose>
<c:when test="${ score >= 90 }">A</c:when>
<c:when test="${ score >= 80 }">B</c:when>
<c:when test="${ score >= 70 }">C</c:when>
<c:otherwise>F</c:otherwise>
</c:choose>
</body>
</html>