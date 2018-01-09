<%-- 
    Document   : Error
    Created on : Sep 5, 2017, 10:47:18 AM
    Author     : MacOS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error</title>
    </head>
    <body>
        <h1>Error</h1>
        <%
            String code = request.getParameter("code");
            switch (code) {
                case "1":
        %>
        <div class="mdl-card" style="color: cadetblue">
            Code 1
        </div>

        <%
                    break;
                default:

                    break;
            }

        %>
    </body>
</html>
