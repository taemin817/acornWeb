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

<% String str="EL joa"; 
	out.println(str);
%>
<%if(str.equals("EL joa")) { %>
	<div>yes el joa</div>
	<%} %>

<h3>저장소에 담긴 것들만 EL표현식을 사용할 수 있기 때문에 str변수의 값은 EL표현식으로 사용할 수 없다</h3>
${ str }

<h3>--------------JSTL과 EL을 사용하는 코드--------------</h3>
<!-- c:set으로 변수를 선언하면  pageContext 저장소에 담긴다 그래서 EL표현식을 사용할 수 있다 -->
<c:set var="str2" value="EL Joa"/>
<c:if test="${str2 eq 'EL Joa'}">
		<div>ok man...stop</div>
		</c:if>
	
</body>
</html>