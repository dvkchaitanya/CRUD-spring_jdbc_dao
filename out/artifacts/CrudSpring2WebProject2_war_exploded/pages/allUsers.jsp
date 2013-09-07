<%@ page import="java.util.Map" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>--%>
<%--
  Created by IntelliJ IDEA.
  User: venkatakrishnachaita
  Date: 6/16/13
  Time: 10:26 PM
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>all users jsp page</title>
</head>
<body>
        <c:forEach var="user" items="${usersList}">
            <table>
                <tr>
                    <td>${user.userName}</td>
                    <td>${user.city}</td>
                    <td><a href="${pageContext.request.contextPath}/user/delete?id=${user.id}">delete</a></td>
                    <td><a href="${pageContext.request.contextPath}/user/updateInit?id=${user.id}">update</a></td>
                </tr>
            </table>
        </c:forEach>
        <a href="${pageContext.request.contextPath}/user/add">add</a>
</body>
</html>