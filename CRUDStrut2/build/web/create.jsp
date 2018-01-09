<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    <s:form action="createContact" method="POST">
        <s:textfield label="username" name="username" ></s:textfield>
        <s:radio label="gender" name="gender" list="listgender" value="2" />
        <s:select label="Select a month"
                  headerKey="-1" headerValue="Select Month"
                  list="listcountry"
                  name="country"
                  value="2" />
        <s:textarea label="about" name="about"></s:textarea>       
        <s:checkbox label="likes"  name="likes" ></s:checkbox>
        <s:submit label="create" value="create" method="action3" ></s:submit>
    </s:form>

</html>
