<%-- 
    Document   : home
    Created on : Aug 29, 2017, 10:48:49 AM
    Author     : MacOS
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            Date d = new Date();
            out.print("Hello Woild" + d.getTime());
        %>
    </body>
</html>
