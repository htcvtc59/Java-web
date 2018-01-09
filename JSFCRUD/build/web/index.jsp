
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
                <h:dataTable binding="#{table}" value="#{productBean.items}" var="p" >
                    <h:column>
                        <f:facet name="header">#</f:facet>  
                        <h:outputText value="#{table.rowIndex+1}"></h:outputText>
                    </h:column>

                    <h:column>
                        <f:facet name="header">ID</f:facet>
                        <h:outputText value="#{p.id}"></h:outputText>
                    </h:column>

                    <h:column>
                        <f:facet name="header">Name</f:facet>
                        <h:outputText value="#{p.name}"></h:outputText>
                    </h:column>

                    <h:column>
                        <f:facet name="header">Price</f:facet>
                        <h:outputText value="#{p.price}"></h:outputText>
                    </h:column>

                    <h:column>
                        <f:facet name="header">Edit</f:facet>
                        <h:commandButton action="#{productBean.viewedit(p.id)}"  value="Edit"></h:commandButton>
                    </h:column>

                    <h:column>
                        <f:facet name="header">Delete</f:facet>
                        <h:commandButton action="#{productBean.delete(p.id)}" value="Delete"></h:commandButton>
                    </h:column>

                </h:dataTable>

            <center><h:commandButton value="Add" action="create.jsp"></h:commandButton></center>

        </h:form>  
    </body>
</html>
</f:view>
