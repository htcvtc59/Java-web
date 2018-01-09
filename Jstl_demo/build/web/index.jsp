<%-- 
    Document   : index
    Created on : Sep 26, 2017, 11:30:16 AM
    Author     : MacOS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Book</h1>
        <jsp:useBean id="mrBean" class="app.Book" scope="session" />
        <c:forEach var="b" items="${mrBean.book}" >
            <h1>${b.name}</h1>
            <h1>${b.image}</h1>
            <h1>${b.link}</h1>
        </c:forEach>
        
    </body>
</html>
