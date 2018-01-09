
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                        <td>Brand</td>
                        <td>
                            <select name="txtbrand" >
                                <option value="Apple" >Apple</option>
                                <option value="Samsung" >Samsung</option>
                                <option value="Nokia" >Nokia</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>Price</td>
                        <td><input type="text" name="txtprice" /></td>
                    </tr>
                    <tr>
                        <td>Description</td>
                        <td><input type="text" name="txtdescription" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" name="Add" /></td>
                        <td></td>
                        <td><input type="reset" value="Reset"/></td>
                    </tr>
                </table>


            </form>
        </c:if>
        <c:if test="${param.txtname != null}" >
            <sql:update var="result" dataSource="${sqlSource}">
                INSERT INTO phone (name,brand,price,description)
                VALUES ('${param.txtname}','${param.txtbrand}','${param.txtprice}','${param.txtdescription}')
            </sql:update>
            <c:if test="${result==1}">
                <jsp:forward page="listphone.jsp" ></jsp:forward>
            </c:if>
        </c:if>
    </body>
</html>
