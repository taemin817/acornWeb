<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>카페 상품</h2>
	<%
	ArrayList<String> list = (ArrayList<String>)request.getAttribute("list");
	for(int i =0;i<list.size();i++){
		out.println(list.get(i));
	}
	%>

</body>
</html>