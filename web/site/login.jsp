<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/4/5
  Time: 20:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<form id="form" action="/j_spring_security_check" method="post">
  UserName:<input type="text" name="j_username"><br>
  PassWord:<input type="password" name="j_password"><br>
  <input type="submit" value="Login">
</form>
</body>
</html>
