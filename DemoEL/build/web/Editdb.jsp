<%-- 
    Document   : Editdb
    Created on : Oct 17, 2017, 8:02:43 PM
    Author     : kenso
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          <sql:setDataSource driver="com.microsoft.sqlserver.jdbc.SQLServerDriver"
                           url="jdbc:sqlserver://127.0.0.1:1433;database=DemoEL"
                           user="sa"
                           password="12345"
                           var="sqlSource"
                           scope="session"/>
           <sql:update dataSource="${sqlSource}" var="count">
            UPDATE product SET _name = ?, _price=?
            WHERE _id='${param.id}'
            <sql:param value="${param.txtName}" />
            <sql:param value="${param.txtPrice}" />
        </sql:update>
        <c:if test="${count>=1}">
            
            <c:redirect url="Home.jsp"/>      
        </c:if>
    </body>
</html>
