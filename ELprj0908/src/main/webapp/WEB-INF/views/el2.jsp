<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>저장소</h2>
		<ul>
			<li>pageContext -> pageScope</li>
			<li>request -> requestScope</li>
			<li>session - >sessionScope</li>
			<li>application -> applicationScope</li>
		</ul>
	
	 <h3>request</h3>
	 <p>하나의 요청이 공유해야할 데이터를 저장하는 공간</p>
	 
	 <h3>session</h3>
	 <p>사용자 한 명이 공유해야하는 데이터를 저장하는 공간</p>
	 
	 <h3>application</h3>
	 <p>모든 사용자가 공유해야하는 데이터(설정정보, db연결정보)를 저장하는 공간</p>
	 
	 <h3>pageContext</h3>
	 <p>jsp페이지 하나당 제공되는 저장소</p>
	 <p>jsp페이지 내에서 EL을 사용하여 변수를 처리하고 싶을 때 사용</p>
	 
	 <h3>pageContext 예시</h3>
	 
	 <%String test = "EL 내놔"; %>
	 <%=test %>
	 
	 <h3>test변수를 사용하고싶다 el로 꺼내고 싶다 EL표현식은 저장되어 있는 것만 사용 가능</h3>
	 
	 ${ test }
	 
	 <%pageContext.setAttribute("test1", test); %>
	 ${ test1 }
</body>
</html>