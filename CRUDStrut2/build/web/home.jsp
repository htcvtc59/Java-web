<%-- 
    Document   : home
    Created on : Nov 4, 2017, 2:13:57 PM
    Author     : MacOS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <center>
        <h3>Welcome <i>${sessionScope.userName}</i>, you have logged in successfully!</h3>
        <h3><s:a action="logout">Logout</s:a></h3>
    </center>
    </body>
</html>
