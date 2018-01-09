<%-- 
    Document   : login
    Created on : Nov 7, 2017, 1:52:52 PM
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
            <h:form>
                <h:panelGrid>
                    <h:outputLabel value="Username:" />
                    <h:inputText id="email" value="#{loginBean.user}">
                        <f:validator validatorId="validator.LoginValidator" />
                    </h:inputText>
                    <h:message for="email" style="color:red" />
                </h:panelGrid>
                <h:panelGrid>
                    <h:outputLabel value="Password:"/>
                    <h:inputSecret id="pass" required="true" value="#{loginBean.pass}" >
                        <f:validator validatorId="validator.LoginPassValidator" />
                    </h:inputSecret>
                    <h:message for="pass" style="color:red" />
                </h:panelGrid>

                <h:commandButton value="Login" action="#{loginBean.login()}" />
            </h:form>
        </body>
    </html>
</f:view>
