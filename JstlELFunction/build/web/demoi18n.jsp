<%-- 
    Document   : demoi18n
    Created on : Oct 3, 2017, 10:58:22 AM
    Author     : MacOS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<c:set var="current" value="${param.ddlLanguage}" scope="session" ></c:set>
<c:if test="${not empty current}">
    <fmt:setLocale value="${current}" scope="session" />
</c:if>
<fmt:setBundle basename="i18N.myResource" scope="session" />
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <fmt:message key="title" />
        <h1><fmt:message key="message" /></h1>
        <fmt:message key="language" />
        <form action="demoi18n.jsp" method="POST" >
            <select name="ddlLanguage" >
                <option value="vi_VN" >VietName</option>
                <option value="en_US" >English</option>
            </select>
            <input value="<fmt:message key="button" />" type="submit" />
        </form>
    </body>
</html>
