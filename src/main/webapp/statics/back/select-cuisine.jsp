<%@ page import="java.text.SimpleDateFormat" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/23
  Time: 9:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>菜品信息列表展示页面</title>
</head>
<body>
<h1>管理员查询菜品信息列表</h1>
<div>
<%--    <%--%>
<%--        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");--%>
<%--    %>--%>
    <table border="1">
        <tr>
            <th>菜品ID</th>
            <th>菜品名</th>
            <th><a href="${pageContext.request.contextPath}/cuisine/addCuisine?cuisineId=${cuisine.cuisineId}">添加</a></th>
        </tr>

        <c:forEach items="${cuisineList}" var="cuisine">
            <tr>
                <td>${cuisine.cuisineId}</td>
                <td>${cuisine.cuisineName}</td>
                <td><a href="${pageContext.request.contextPath}/cuisine/toUpdateCuisine?cuisineId=${cuisine.cuisineId}">修改</a>&nbsp;&nbsp;
                    <a href="${pageContext.request.contextPath}/cuisine/deleteCuisine?cuisineId=${cuisine.cuisineId}">删除</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
