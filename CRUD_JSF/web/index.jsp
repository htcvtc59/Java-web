
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html" %>

<!DOCTYPE html>
<f:view>
    <html xmlns:h="http://xmlns.jcp.org/jsf/html" 
          xmlns:f="http://xmlns.jcp.org/jsf/core"
          xmlns:p="http://primefaces.org/ui"
          xmlns:ui="http://java.sun.com/jsf/facelets"
          >
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Index</title>
        </head>
        <body>
            <h:form>
                <h:commandButton value="Add" action="create.jsp"></h:commandButton>
                    <table>
                        <thead>
                            <tr>
                                <th><h:column><f:facet name="header">#</f:facet></h:column></th>
                            <th><h:column><f:facet name="header">ID</f:facet></h:column></th>
                            <th><h:column><f:facet name="header">Name</f:facet></h:column></th>
                            <th><h:column><f:facet name="header">Price</f:facet></h:column></th>
                            <th><h:column><f:facet name="header">Edit</f:facet></h:column></th>
                            <th><h:column><f:facet name="header">Delete</f:facet></h:column></th>
                                </tr>
                            </thead>
                            <tbody>
                               
                        <h:dataTable binding="#{table}" value="#{productBean.items}" var="p">
                            <tr>
                                <td><h:column><h:outputText value="#{table.rowIndex+1}"></h:outputText></h:column></td>
                                <td><h:column><h:outputText value="#{p.id}"></h:outputText></h:column></td>
                                <td><h:column><h:outputText value="#{p.name}"></h:outputText></h:column></td>
                                <td><h:column><h:outputText value="#{p.price}"></h:outputText></h:column></td>
                                <td><h:column><h:commandButton action="#{productBean.viewedit(p.id)}"  value="Edit"></h:commandButton></h:column></td>
                                <td><h:column><h:commandButton action="#{productBean.delete(p.id)}" value="Delete"></h:commandButton></h:column></td>
                                    </tr>
                        </h:dataTable>
                    </tbody>
                </table>
            </h:form>  
        </body>
    </html>
</f:view>
