<%-- 
    Document   : index.jsp
    Created on : Oct 10, 2017, 8:55:44 AM
    Author     : MacOS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello ${sessionScope.user}</h1>
        <h1>${cookie.user.value}</h1>
        <h1>${cookie.pass.value}</h1>
    </body>
</html>
