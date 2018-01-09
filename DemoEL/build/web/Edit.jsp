<%-- 
    Document   : Edit
    Created on : Oct 17, 2017, 5:38:22 PM
    Author     : kenso
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Product Infomation</title>
    </head>
    <body>
        <sql:setDataSource driver="com.microsoft.sqlserver.jdbc.SQLServerDriver"
                           url="jdbc:sqlserver://127.0.0.1:1433;database=DemoEL"
                           user="sa"
                           password="12345"
                           var="sqlSource"
                           scope="session"/>
        <sql:query dataSource="${sqlSource}" var="result">
            SELECT * from product where _id=?;
            <sql:param value="${param.id}" />
        </sql:query>
            <form action="Editdb.jsp" method="post">
            <table border="1" width="30%">
                <caption>Update Product</caption>
                <tr>
                    <td><label>Product_ID</label></td>
                    <td><input type="text" value="${param.id}" name="id" readonly </td>
                </tr>
                <c:forEach var="p" items="${result.rows}">
                     <tr>
                    <td><label>Product_name</label></td>
                    <td><input type="text" value="${p._name}" name="txtName" </td>
                </tr>
                 <tr>
                    <td><label>Product_price</label></td>
                    <td><input type="text" value="${p._price}" name="txtPrice"</td>
                </tr>
                <td><input type="submit" value="Update"/></td>
                </c:forEach>
            </table>
            <a href="Home.jsp">Go Home</a>
        </form>

    </body>
</html>
