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
    <title>商家食品安全档案展示页面</title>
</head>
<body>
<h1>管理员查询商家食品安全档案列表</h1>
<div>
    <%--    <%--%>
    <%--        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");--%>
    <%--    %>--%>
    <table border="1">
        <tr>
            <th>食品安全档案ID</th>
            <th>管理等级</th>
            <th>单位名称</th>
            <th>许可证号</th>
            <th>法定代表人</th>
            <th>经营地址</th>
            <th>经营范围</th>
            <th>有效期</th>
            <th>营业执照图片</th>
            <th>食品经营许可证图片</th>

            <th><a href="${pageContext.request.contextPath}/security/toAddSecurity">添加</a></th>
        </tr>

        <c:forEach items="${securityList}" var="security">
            <tr>
                <td>${security.securityId}</td>
                <td>${security.securityLv}</td>
                <td>${security.securityName}</td>
                <td>${security.securityCertNo}</td>
                <td>${security.securityLegal}</td>
                <td>${security.securityAddress}</td>
                <td>${security.securityScope}</td>
                <td>${security.securityPeriod}</td>
                <td>${security.securityLicensePic}</td>
                <td>${security.securityBusinessPic}</td>
                <td><a href="${pageContext.request.contextPath}/security/toUpdateSecurity?securityId=${security.securityId}">修改</a>&nbsp;&nbsp;
                    <a href="${pageContext.request.contextPath}/security/deleteSecurity?securityId=${security.securityId}">删除</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
