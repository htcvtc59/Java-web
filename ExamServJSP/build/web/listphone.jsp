
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
                           url="jdbc:sqlserver://127.0.0.1:1433;databaseName=Phones" 
                           user="sa" password="230697" 
                           var="sqlSource" scope="session" />

        <sql:query dataSource="${sqlSource}" var="result">
            select * from phone
        </sql:query>
        <a href="addphones.jsp">Add</a>
        <table>
            <tr>
                <th>id</th>
                <th>name</th>
                <th>brand</th>
                <th>price</th>
                <th>description</th>
            </tr>
            <c:forEach var="p" items="${result.rows}">
                <tr>
                    <td>${p.id}</td>
                    <td>${p.name}</td>
                    <td>${p.brand}</td>
                    <td>${p.price}</td>
                    <td>${p.description}</td>
                </tr>
            </c:forEach>
        </table>

    </body>
</html>
