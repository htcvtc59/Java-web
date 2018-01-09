<%-- 
    Document   : edit
    Created on : Sep 14, 2017, 12:51:27 PM
    Author     : MacOS
--%>

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
            <h2>Edit</h2>
            
            <h:form>
                <h:inputHidden value="#{editPro.id}"></h:inputHidden>
                <h:outputLabel>name</h:outputLabel>
                <h:inputText value="#{editPro.name}"></h:inputText>
                <h:outputLabel>price</h:outputLabel>
                <h:inputText value="#{editPro.price}"></h:inputText>
                <h:commandButton value="Save" action="#{productBean.updatepro(editPro)}"></h:commandButton>
            </h:form>

        </body>
    </html>
</f:view>
