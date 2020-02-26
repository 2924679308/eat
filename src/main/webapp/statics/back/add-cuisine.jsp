<%--
  Created by IntelliJ IDEA.
  User: 29246
  Date: 2020/2/24
  Time: 12:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>菜品信息增加页面</title>
</head>
<body>
<div>
    <h2>管理员添加菜品信息</h2>
    <form method="get" action="/eat/cuisine/addCuisine`">
        菜品名：<input name="CuisineName"/><br/>

        <input type="submit" value="提交">&nbsp;&nbsp;
        <input type="reset" value="重置">
    </form>
</div>
</body>
</html>
