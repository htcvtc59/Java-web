<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html" %>
<!DOCTYPE html>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Create</title>
        </head>
        <body>
            <h2>Create Pro</h2>
            <h:form>
                <h:outputLabel>name</h:outputLabel>
                <h:inputText value="#{productBean.name}"></h:inputText>
                <h:outputLabel>price</h:outputLabel>
                <h:inputText value="#{productBean.price}"></h:inputText>
                <h:commandButton value="Save" action="#{productBean.save()}"></h:commandButton>
            </h:form>

        </body>
    </html>
</f:view>