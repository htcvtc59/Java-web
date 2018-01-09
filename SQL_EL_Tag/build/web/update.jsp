<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : update
    Created on : Oct 9, 2017, 10:20:35 AM
    Author     : MacOS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:if test="${param.btnUpdate==null}">
            <sql:query var="result" dataSource="${sqlSource}">
                SELECT *  FROM tblcontact where id=?
                <sql:param value = "${param.id}" />
            </sql:query>
            <form action="#" method="post">
                <c:forEach var="item" items="${result.rows}">
                    <table>
                        <tr>
                            <td hidden="true" >Id</td>
                            <td><input type="text" value="${item.id}" name="txtidu" hidden="true" /></td>
                        </tr>
                        <tr>
                            <td>Name</td>
                            <td><input type="text" value="${item.name}" name="txtname" /></td>
                        </tr>
                        <tr>
                            <td>Age</td>
                            <td><input type="text" value="${item.age}" name="txtage" /></td>
                        </tr>
                        <tr>
                            <td>Address</td>
                            <td><input type="text"  value="${item.address}" name="txtaddress" /></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td><input type="submit" value="Update" name="btnUpdate"  /></td>
                        </tr>
                    </table>
                </c:forEach>
            </form>
        </c:if>
        <c:if test="${param.btnUpdate=='Update'}">
            <sql:update var="result" dataSource="${sqlSource}">
                UPDATE tblcontact
                SET name = '${param.txtname}',
                age = '${param.txtage}',
                address = '${param.txtaddress}'
                WHERE id = ${param.txtidu}
            </sql:update>
            <c:if test="${result==1}">
                <jsp:forward page="index.jsp" ></jsp:forward>
            </c:if>
        </c:if>

    </body>
</html>
