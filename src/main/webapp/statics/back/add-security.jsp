<%--
  Created by IntelliJ IDEA.
  User: 29246
  Date: 2020/2/26
  Time: 16:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加商家食品安全档案</title>
</head>
<body>

<h2>管理员添加商家食品安全档案</h2>
<form method="get" action="/eat/security/addSecurity">
    食品安全档案ID：<input name="securityId"/><br/>
    管理等级:<input type="text" name="securityLv"/><br/>
    单位名称：<input name="securityName"/><br/>
    许可证号：<input name="securityCertNo"/><br/>
    法定代表人：<input name="securityLegat"/><br/>
    经营地址：<input type="text" name="securityAddress"/><br/>
    经营范围：<input name="securityScope"/><br/>
    有效期：<input type="date" value="securityPeriod"/><br/>
    营业执照图片：<input name="securityLicencePic"/><br/>
    食品经营许可证图片：<input name="securityBusingessPic"/><br/>
   <input type="submit" value="提交">&nbsp;&nbsp;
    <input type="reset" value="重置">
</form>
</div>
</body>
</html>
