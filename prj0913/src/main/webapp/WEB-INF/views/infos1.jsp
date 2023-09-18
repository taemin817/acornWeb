<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% HashMap<String, ArrayList<String>> map = (HashMap<String, ArrayList<String>>)request.getAttribute("infos"); 
ArrayList<String> list = map.get("fruits");
ArrayList<String> list2 = map.get("beverage");
for(String item : list){
	out.println(item);
}
%>


<h3>음료정보</h3>

<ul>
<% for(String item : list2) {%>
	<li><%=item %></li>
	<%} %>
</ul>
</body>
</html>