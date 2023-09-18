<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	 
	 int currentPage = 1;   //현재페이지
	 if( request.getParameter("p") != null){
		 currentPage  = Integer.parseInt(request.getParameter("p"));			 
	 }
      
	 int totRecords = 513;        //  총 레코드 수  , 임의 값 
	 int pageSize = 7;            //페이지 사이즈  (데이터 건수 , 한 페이징 보이는 레코드 수, 목록 )
	 int grpSize= 6;             // 한 그룹에 5개씩 보겟다 
	 
	 int totalPage;             // 총 페이지수: 전체 페이수    =>	 6페이지 (현재의 경우)	
	 int currentGrp = 0;  	    // 현재그룹
	 
	 //총 페이지수 구하기
	 int reamin = totRecords  %  pageSize ;	 	
	 if( reamin == 0 )
		 totalPage = totRecords / pageSize;		  // 총레코드 / 페이지사이즈    31 /4 =>
	 else 
		 totalPage = totRecords / pageSize +1;	  // 7+1  =>총 8페이지   
  
		 
	 int remain2 = currentPage % grpSize;               // 나머지에 따라 현재그룹이 달라짐 
	 if( remain2 == 0 )
		 currentGrp  = currentPage  / grpSize ;        //  5/5 =>1  그룹 ,  10 /5 =>2   그룹  ,  15/5 =>3그룹 
		 
	 else 
		 currentGrp = currentPage  / grpSize  +1;      //  4 /5 => + 1 => 1번째 그룹 ,  7 /5 => 1 +1 => 2그룹   , 12/5 => 2+1  =>3그룹
	 
		 
	 int grpStartPage = ( currentGrp -1 ) * grpSize +1 ;  // 그룹의 시작번호     
	 int grpEndPage = currentGrp * grpSize;               // 그룹의 끝번호    
	 
	 if( grpEndPage > totalPage){
		 grpEndPage = totalPage;    // 그룹의 끝번호   10 -> 9로 변경 , 그룹의 끝번호가 마지막페이지번호 크다면
	 }
	 
	 int index = grpStartPage;
	 
	 if( currentGrp >1){	
	%> 
	     <a href="paging.jsp?p=<%=index-1%>">[이전 ]</a>  
	 <%}
	 
	 
	 while( index <= grpEndPage){		 
	 %>
		 <a href="/pagePrj0911/paging.jsp?p=<%=index%>">[  <%=index %> ]</a> 
        <%
		  index ++;
        
	 }
	 
	 if( grpEndPage < totalPage){%>	
		  <a href="/pagePrj0911/paging.jsp?p=<%=grpEndPage+1%>">[ 다음 ]</a>  
	<% }
	%>
	
</body>
</html>