<%-- 
    Document   : fa.jsp
    Created on : Sep 5, 2017, 9:07:12 PM
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
        <h1>Home</h1>
        <%
            String id = request.getParameter("id");
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String picture = request.getParameter("picture");
        %>
        <h3>Xin chao <%=id%></h3><br/>
        <p><%=name%></p>   <br/>   
        <p><%=email%></p><br/>
        <p><%=picture%></p><br/>
        <%
        %>
    </body>
</html>
