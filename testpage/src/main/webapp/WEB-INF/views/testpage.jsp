<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="test0911.PageHandler" %>
    <%@ page import="test0911.Member" %>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
PageHandler handler = (PageHandler)request.getAttribute("handler"); 
ArrayList<Member> list = (ArrayList<Member>)request.getAttribute("list");
%>

<table>
	<tr>
	<td>아이디</td>
	<td>비밀번호</td>
	<td>이름</td>
	</tr>
	
	<% for(Member m : list) {%>
<tr>
	<td><%=m.getId() %></td>
	<td><%=m.getPw() %></td>
	<td><%=m.getName() %></td>
</tr>
	<%} %>
</table>
<p>페이징</p>
<% 
int index = handler.getGrpStartPage();

if(handler.getCurrentGrp()>1){ %>
<a href="/testpage/pagetest?p=<%=index-1%>">[이전]</a>
	<%
}
while(index <= handler.getGrpEndPage()){
	%>
	<a href="/testpage/pagetest?p=<%=index %>">[<%=index %>]</a>
	<%index++;
 }
 if(handler.getGrpEndPage()<handler.getTotalPage()){
	 %>
	<a href="/testpage/pagetest?p=<%=handler.getGrpEndPage()+1 %>">[다음]</a>
 <%}
 %>
</body>
</html>