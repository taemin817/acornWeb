<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="prj0831.constructor" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>f1의 대표적인 팀들이라구!</h2>

<%
ArrayList<constructor> list= (ArrayList<constructor>)request.getAttribute("Cons");

for(constructor team : list){
	out.println(team);
}
%>
</body>
</html>