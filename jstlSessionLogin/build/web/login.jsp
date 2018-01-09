<%-- 
    Document   : login
    Created on : Oct 10, 2017, 8:55:53 AM
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
        <form method="POST" action="login"> 
            User <input type="text" name="txtUser" />
            Pass  <input type="text" name="txtPass" />
            <input type="submit" value="Login" />
        </form>
    </body>
</html>
