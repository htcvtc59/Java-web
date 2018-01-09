<%-- 
    Document   : update
    Created on : Nov 4, 2017, 12:10:45 AM
    Author     : MacOS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <s:form action="updateContact" method="POST">
            <s:push value="c">
            <s:hidden name="id" value='%{id}' ></s:hidden>
            <s:textfield label="username" name="username" value='%{username}' ></s:textfield>
            <s:radio label="gender" name="gender" list="listgender" value="%{gender}"  />
            <s:select label="Select a month"
                      headerKey="-1" headerValue="Select Month"
                      list="listcountry"
                      name="country" value="%{country}" />
            <s:textarea label="about" name="about" value='%{about}' ></s:textarea>   
            <s:if test="likes==true"><s:checkbox label="likes"  name="likes" checked="checked"  value="true"  ></s:checkbox></s:if><s:else><s:checkbox label="likes"  name="likes" ></s:checkbox> </s:else> 
            </s:push>
            <s:submit label="update" value="update" ></s:submit>
        </s:form>
    </body>
</html>
