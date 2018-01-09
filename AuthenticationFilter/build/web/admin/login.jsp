<%-- 
    Document   : login
    Created on : Sep 23, 2017, 11:40:42 PM
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
        <h1>Login</h1>
        ${message}

        <form method="POST" action="account">
            <table cellpadding="2" cellspacing="2">
                <tr>
                    <td>UserName</td>
                    <td><input type="text" name="username"/></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="password"/></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td><input type="submit" value="Login"/></td>
                </tr>
            </table>
        </form>

    </body>
</html>
