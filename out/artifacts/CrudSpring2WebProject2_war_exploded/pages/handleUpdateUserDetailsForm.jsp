<%--
  Created by IntelliJ IDEA.
  User: venkatakrishnachaita
  Date: 6/18/13
  Time: 2:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>update User details Form</title>
</head>
<body>
        <%--<c:out value="${user.id}"></c:out>--%>
        <form:form commandName="user" action="/user/update" method="POST">
           <form:label path="userName">user name</form:label>
           <form:input path="userName"/><br/>

           <form:label path="city">city</form:label>
           <form:input path="city"/><br/>
           <form:hidden path="id" />
           <input type="submit" value="update user details"/>
       </form:form>
</body>
</html>