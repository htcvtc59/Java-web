<%-- 
    Document   : index
    Created on : Oct 10, 2017, 10:13:35 PM
    Author     : MacOS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="https://www.google.com/recaptcha/api.js" async defer></script>
    </head>
    <body>
        <h1>Hello World!</h1>

        <form method="POST" action="GoogleCaptcha">
            <input type="text" name="txtName" />
            <div class="g-recaptcha" data-sitekey="6Lds6jMUAAAAABrHcq9B2lgBPb9mTGsFzF52RGqO"></div>
            
            <input type="submit" value="Google" />
        </form>


    </body>
</html>
