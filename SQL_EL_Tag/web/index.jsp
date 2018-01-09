<%-- 
    Document   : index
    Created on : Oct 8, 2017, 10:48:41 PM
    Author     : MacOS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index</title>
    </head>
    <body>
        <sql:setDataSource driver="com.microsoft.sqlserver.jdbc.SQLServerDriver"
                           url="jdbc:sqlserver://127.0.0.1:1433;databaseName=Contactdb" 
                           user="sa" password="230697" 
                           var="sqlSource" scope="session" />

        <sql:query dataSource="${sqlSource}" var="result">
            select * from tblcontact
        </sql:query>
        <a href="newcontact.jsp">Add Contact</a>
        <table>
            <tr>
                <th>id</th>
                <th>name</th>
                <th>age</th>
                <th>address</th>
                <th colspan="2">Action</th>
            </tr>
            <c:forEach var="p" items="${result.rows}">
                <tr>
                    <td>${p.id}</td>
                    <td>${p.name}</td>
                    <td>${p.age}</td>
                    <td>${p.address}</td>
                    <td><a href="update.jsp?id=<c:out value="${p.id}"/>">Update</a></td>
                    <td>
                    <td><a href="index.jsp?txtidd=<c:out value="${p.id}"/>">Delete</a></td>
                    <c:if test="${param.txtidd !=null}">
                        <sql:update var="result" dataSource="${sqlSource}">
                            DELETE FROM tblcontact
                            WHERE id = ${param.txtidd}
                        </sql:update>
                        <c:if test="${result==1}">
                            <jsp:forward page="index.jsp" ></jsp:forward>
                        </c:if>
                    </c:if>
                    </td>
                </tr>
            </c:forEach>
        </table>


    </body>
</html>
