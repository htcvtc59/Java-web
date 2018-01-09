<%-- 
    Document   : Home
    Created on : Oct 17, 2017, 5:37:24 PM
    Author     : kenso
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HomePage</title>
         <script>
            function confirmGo(m,u) {
                if ( confirm(m) ) {
                    window.location = u;
                }
            }
        </script>
    </head>
    <body>
        <sql:setDataSource driver="com.microsoft.sqlserver.jdbc.SQLServerDriver"
                           url="jdbc:sqlserver://127.0.0.1:1433;database=DemoEL"
                           user="sa"
                           password="12345"
                           var="sqlSource"
                           scope="session"/>
        <sql:query dataSource="${sqlSource}" var="result">
            SELECT * FROM product
        </sql:query>
        <h1>Homepage</h1>
        <a href="Add.jsp">Add a new Product</a>
        <p>Product List</p>
        <table border="1">
            <tr>
                <th>Product_id</th>
                <th>Product_name</th>
                <th>Product_price</th>
                <th>Delete</th>
                <th>Edit</th>
            </tr>

            <c:forEach var="p" items ="${result.rows}">
                <tr>
                    <td>${p._id}</td>
                    <td>${p._name}</td>
                    <td>${p._price}</td>
                    <td><a href="javascript:confirmGo('Sure to delete this record?','Deletedb.jsp?id=<c:out value="${p._id}"/>')">Delete</a></td>
                    <td><a href="Edit.jsp?id=<c:out value="${p._id}"/>">Edit</a></td>
                </tr>
            </c:forEach>

        </table>
    </body>
</html>
