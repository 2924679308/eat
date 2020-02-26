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
    <title>菜品信息列表修改页面</title>
</head>
<body>
<div>
    <h1>管理员修改菜品信息列表</h1>
        <form method="get" action="/eat/cuisine/updateCuisine">
            <input type="hidden" name="cuisineID" value="${eatCuisine.cuisineId}"/><br/>
            菜品名：<input name="cuisineName" value="${eatCuisine.cuisineName}"> <br/>
            <input type="submit" value="提交">&nbsp;&nbsp;
            <input type="reset" value="重置">


        </form>
</div>
</body>
</html>
