<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>1~10 출력</h3>
<%
int sum = 0;
for(int i = 0; i<=10; i++){
	sum+=i;
	out.println(i+"<br>");
}
%>
1~10의 합 = 
<%=sum %>
</body>
</html>