
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <s:form action = "login" method = "post">
            <s:textfield name = "user" label = "user" size = "20" />
            <s:textfield name = "pass" label = "pass" size = "20" />
            <s:submit name = "submit" label = "Submit" align="center" />
        </s:form>
    </body>
</html>
