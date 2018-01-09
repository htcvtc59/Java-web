<%-- 
    Document   : home
    Created on : Aug 31, 2017, 9:37:22 AM
    Author     : MacOS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Home</h1>
        <h1>Xin chao <%= (String) request.getAttribute("hello")%></h1>
    </body>
</html>
