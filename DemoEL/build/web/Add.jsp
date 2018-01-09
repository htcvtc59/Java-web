<%-- 
    Document   : Add
    Created on : Oct 17, 2017, 5:38:04 PM
    Author     : kenso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add</title>
    </head>
    <body>
      
        <h1>Add a new Product</h1>
        <a href="Home.jsp">Back</a>
        <form action="Adddb.jsp" method="POST">
            <table border="1">
                <thead>
                    <tr>Basic Form</tr>
                </thead>
                <tr>
                    <td><label>Product_Name</label></td>
                    <td><input type="text" name="txtName" required="true"/></td>
                </tr>
                <tr>
                    <td><label>Product_Price</label></td>
                    <td><input type="text" name="txtPrice" required="true"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="submit"/></td>
                    <td><input type="reset" value="reset"/></td>


                </tr>
            </table>
        </form>
        
    </body>
</html>
