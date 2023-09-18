<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
    <%@ page import="page.Member" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% ArrayList<Member> list = (ArrayList<Member>) request.getAttribute("list"); %>

<table>
<tr>
<td>id</td>
<td>pw</td>
<td>name</td>
<td>tel</td>
<td>birthday</td>
<td>point</td>
<td>grade</td>
</tr>
<tr>
<% for(Member m : list) {%>
<td><%=m.getM_id() %></td>
<td><%=m.getM_pw() %></td>
<td><%=m.getM_name() %></td>
<td><%=m.getM_tel() %></td>
<td><%=m.getM_birthday() %></td>
<td><%=m.getM_point() %></td>
<td><%=m.getM_grade() %></td>
</tr>
<%} %>
</table>
<!-- paging에 관련된 코드 -->
<%
Integer totalCnt = (Integer)request.getAttribute("totalCnt");
Integer pageSize = (Integer)request.getAttribute("pageSize");
Integer p = (Integer)request.getAttribute("page");
Integer grpSize = (Integer)request.getAttribute("grpSize");

//out.println(totalCnt);
//out.println(pageSize);
//out.println(p);
//out.println(grpSize);

// 구해야하는 것
int totalPage = 0;
int currentGrp = 0;
int grpStartPage = 0;
int grpEndPage = 0;

// 전체 페이지수
int remain = totalCnt % pageSize;
if(remain == 0){
	totalPage = totalCnt/pageSize;
} else {
	totalPage = totalCnt/pageSize+1;
}

//  현재 페이지를 기준으로 현재 그룹 구하기
int remain2 = p%grpSize;
if(remain2 == 0){
	currentGrp = p/grpSize;
} else {
	currentGrp = p/grpSize+1;
}

// 현재 그룹 시작번호
grpStartPage = (currentGrp-1)*grpSize+1;
// 현재 그룹 마지막번호
grpEndPage = currentGrp * grpSize;

// 현재그룹 1 -> 시작:1 끝:5
// 현재그룹 2 -> 시작:6 끝:10

if (grpEndPage > totalPage){
	grpEndPage = totalPage;
}
int index = grpStartPage;
while(index <= grpEndPage){%>
	<a href="/pagePrj0911/list2.page?p=<%=index %>">[<%=index %>]</a>
<% 
	//out.println(index);
	index++;
}
%>

</body>
</html>