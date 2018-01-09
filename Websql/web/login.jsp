<%-- 
    Document   : login
    Created on : Aug 31, 2017, 9:36:35 AM
    Author     : MacOS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="mdc-typography">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link
            rel="stylesheet"
            href="https://unpkg.com/material-components-web@latest/dist/material-components-web.min.css">
        <link rel="stylesheet" href="CSS/material-components-web.min.css">
    </head>
    <body>
        <h1>Login</h1>
        <form action="Login" method="POST">
            <div class="mdc-textfield">
                <input type="text" id="username" class="mdc-textfield__input" name="txtUser" >
                <label for="username" class="mdc-textfield__label">Username</label>
            </div>

            <div class="mdc-textfield">
                <input type="password" id="username" class="mdc-textfield__input" name="txtPass" >
                <label for="username" class="mdc-textfield__label">Password</label>
            </div>
            <br/> 
            <br/>
            <input type="submit" value="Login" name="btnaction" class="mdc-button mdc-button--raised mdc-button--primary">    
            <input type="submit" value="Register" name="btnaction" class="mdc-button mdc-button--raised mdc-button--primary">
        </form>

        <script src="https://unpkg.com/material-components-web@latest/dist/material-components-web.min.js"></script>
        <script>window.mdc.autoInit();</script>
    </body>
</html>
