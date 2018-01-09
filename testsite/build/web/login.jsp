<%-- 
    Document   : login
    Created on : Aug 29, 2017, 10:56:12 AM
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
        <h1>Hello World!</h1>
        <form action="ControllerServlet" method="POST" >
            Username :<input type="text" name="txtUser"><br/>     
            Password :<input type="text" name="txtPass"><br/>
            <input value="Login" type="submit">
        </form>
    </body>
</html>
