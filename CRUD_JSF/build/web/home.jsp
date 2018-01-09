
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html" %>
<!DOCTYPE html>
<f:view>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h:form>
            <h1><h:outputLabel value="#{sessionScope.user}" /></h1>
        <h:commandLink value="Logout" action="#{loginBean.logout()}"/>
        </h:form>
    </body>
</html>
</f:view>