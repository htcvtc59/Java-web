<%-- 
    Document   : index
    Created on : Oct 3, 2017, 9:10:06 AM
    Author     : MacOS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="func" uri="/WEB-INF/tlds/newtag_library.tld" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:choose>
            <c:when test="${empty param.txtN}">
                <form action="#" method="POST" >
                    <input type="text" name="txtN" />
                    <input type="text" name="txtM" />
                    <input type="submit"  value="Adds" />
                </form>
            </c:when>
            <c:otherwise>
                <c:set var="n" value="${param.txtN}" ></c:set>
                <c:set var="m" value="${param.txtM}" ></c:set>
                ${func:add(n, m)}
            </c:otherwise>
        </c:choose>
        
        
        <c:forEach var="b" items='${func:listbook("name1")}' >
            <c:out value="${b.name}" ></c:out>
        </c:forEach>

    </body>
</html>
