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
    <form method="get" action="/security/updateSecurity">
        <input type="hidden" name="securityId" value="${eatSecurity.securityId}"/><br/>

        管理等级:<input name="securityLv" value="${eatSecurity.securityLv}"/><br/>
        单位名称：<input name="securityName" value="${eatSecurity.securityName}"/><br/>
        许可证号：<input name="securityCertNo" value="${eatSecurity.securityCertNo}"/><br/>
        法定代表人：<input name="securityLegat" value="${eatSecurity.securityLegal}"/><br/>
        经营地址：<input type="text" name="securityAddress" value="${eatSecurity.securityAddress}"/><br/>
        经营范围：<input name="securityScope" value="${eatSecurity.securityScope}"/><br/>
        有效期：<input name="securityPeriod" value="${eatSecurity.securityPeriod}"/><br/>
        营业执照图片：<input name="securityLicencePic" value="${eatSecurity.securityLicensePic}"/><br/>
        食品经营许可证图片：<input name="securityBusingessPic" value="${eatSecurity.securityBusinessPic}"/><br/>
        <input type="submit" value="提交">&nbsp;&nbsp;
        <input type="reset" value="重置">


    </form>
</div>
</body>
</html>
