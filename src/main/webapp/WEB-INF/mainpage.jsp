<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 28.01.2017
  Time: 18:09
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<html>
<head>
  <title>Main Page</title>
  <%@ include file="/WEB-INF/jspf/head.jspf"%>
  <c:set var="title" scope="request" value="Login"/>
</head>
<body>
<div><table align="center" width="600" bgcolor="#ffcc00"><tr><td><button align="left"><label>eng</label></button><button align="left"><label>ru</label></button></td></tr></table></div>
<div><table align="center" width="600" bgcolor="#ffcc00"><tr><td><label align="center"> INTERNATIONAL DIGITAL UNIVERSITY</label></td></tr></table> </div>
<div>
  <form action="controller" method="post">
  <table align="center" width="600"  bgcolor="#ffcc00">
    <tr></tr>
    <tr><td><label id="login">LOGIN</label></td><td><input type="text" class="form-control" name="login"></td></tr>
    <tr><td><label id="password">PASSWORD</label></td><td><input type="password" class="form-control" name="password"></td></tr>
    <tr><td><button id="btnlog" align="center" type="submit" value="submit"><label id="loginlb">login</label></button><button id="btnreg" align="center"><label id="registerlb">register</label></button></td></tr>
    <tr height="300"></tr>

  </table>
  </form>
</div>
<form action="controller" method="GET">
  <input type="hidden" name="command" value="showRegistrationPage" /> <input
        type="submit" class="btn btn-large btn-primary" value="Registrate">
</form>


<%@ include file="/WEB-INF/jspf/header.jspf"%>
<div>
  <table align="center" width="600" bgcolor="#ffcc00">
    <tr><td><marquee bgcolor="#c0c0c0" behavior="scroll" align="center">We need a lot of fresh blood ..... Where are you Studets:)?</marquee></td></tr>
  </table>
</div>

</body>
</html>
