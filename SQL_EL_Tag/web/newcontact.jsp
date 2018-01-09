<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : newcontact
    Created on : Oct 9, 2017, 9:36:10 AM
    Author     : MacOS
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:if test="${param.txtname == null}"  >
            <form action="#" method="post">
                <table>
                    <tr>
                        <td>Name</td>
                        <td><input type="text" name="txtname" /></td>
                    </tr>
                    <tr>
                        <td>Age</td>
                        <td><input type="text" name="txtage" /></td>
                    </tr>
                    <tr>
                        <td>Address</td>
                        <td><input type="text" name="txtaddress" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" name="Add" /></td>
                    </tr>
                </table>


            </form>
        </c:if>
        <c:if test="${param.txtname != null}" >
            <sql:update var="result" dataSource="${sqlSource}">
                INSERT INTO tblcontact (name,age,address)
                VALUES ('${param.txtname}','${param.txtage}','${param.txtaddress}')
            </sql:update>
            <c:if test="${result==1}">
                <jsp:forward page="index.jsp" ></jsp:forward>
            </c:if>
        </c:if>

    </body>
</html>
