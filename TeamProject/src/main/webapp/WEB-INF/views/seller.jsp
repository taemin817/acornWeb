<%@page import="sellerDAO.Goods"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
</head>
<body>
    
    <%
    ArrayList<Goods> list = (ArrayList<Goods>)request.getAttribute("list");
    %>
    <form action="/TeamProject/goodsRegister"><button>등록</button></form>
    <form action="/TeamProject/goodsAlter"><button>수정</button></form>
    <table border="1">
        <tr>
            <th>상품 코드</th>
            <th>브랜드</th>
            <th>상품명</th>
            <th>가격</th>
            <th>재고</th>
            <th>관리</th>
        </tr>
        
        <% for (Goods g : list) { %>
            <tr>
                <td><%= g.getGoodsCode() %></td>
                <td><%= g.getGoodsBrand() %></td>
                <td><%= g.getGoodsName() %></td>
                <td><%= g.getGoodsPrice() %></td>
                <td><%= g.getGoodsStock() %></td>
                <td>
                <a href="/TeamProject/goodsDelete?goodsCode=<%= g.getGoodsCode()%>"><button>삭제</button></a>
                </td>
            </tr>
        <% } %>
    </table>
</body>
</html>