<%-- 
    Document   : index.jsp
    Created on : Oct 12, 2017, 11:12:10 AM
    Author     : MacOS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="v" uri="/WEB-INF/tlds/newtag_library.tld" %>
<%@taglib prefix="i" uri="/WEB-INF/tlds/TagLibDescription.tld" %>
<%@taglib prefix="b" uri="/WEB-INF/tlds/TagWithBody.tld" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <v:ViewData db="BooksDB" countrow="4" namerow="1,2,3,4" table="tblbook" />

        <i:TagIteration count="10" />

        <h1>Custom tag Handler With JSP Codes</h1>
        <b:UpperCase>
            These following information are displayed
            <ol>
                <li>Current Time<%=new java.util.Date()%></li>
                <li>Host name<%=request.getRemoteHost()%></li>
                <li>Session Id <%=session.getId()%></li>
            </ol>
        </b:UpperCase>
    </body>
</html>
