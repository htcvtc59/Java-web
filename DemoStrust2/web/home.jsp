<%-- 
    Document   : home
    Created on : Nov 2, 2017, 9:38:59 AM
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
        
        <s:iterator var="p" value="items">
        <td><s:property value="#p.id" /></td>
           <td> <s:property value="#p.name" /></td></br>
        </s:iterator>
        
    </body>
</html>
