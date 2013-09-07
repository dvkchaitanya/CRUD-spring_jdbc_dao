<%--
  Created by IntelliJ IDEA.
  User: venkatakrishnachaita
  Date: 6/17/13
  Time: 3:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>User details form</title>
</head>
<body>
<%--method="GET" action="user/handle"--%>
    <form:form commandName="user" >
        <table>
            <tr>
                <td>User name:</td>
                <td><form:input path="userName"  /></td>
            </tr>
            <tr>
                <td>User city:</td>
                <td><form:input path="city"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="Add User"></td>
            </tr>
        </table>
    </form:form>
</body>
</html>