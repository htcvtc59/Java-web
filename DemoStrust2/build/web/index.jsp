<%-- 
    Document   : index
    Created on : Nov 2, 2017, 9:20:27 AM
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
        <s:form action="dang-nhap" method="POST" >
            <s:textfield label="USERNAME"  name="user"></s:textfield>
            <s:password label="PASSWORD"  name="pass"></s:password>
            <s:submit method="execute" value="Login" ></s:submit>
        </s:form>
        
    </body>
</html>
