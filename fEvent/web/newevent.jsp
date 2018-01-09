
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create</title>
    </head>
    <body>
        <s:form action="createEvent" method="POST">
            <s:textfield label="When?" name="dateevent" ></s:textfield>
            <s:select headerKey="-1" 
                      list="listTime"
                      name="timeevent"
                      value="2" />
            <s:textfield label="What are you planning?" name="planning" ></s:textfield>
            <s:textfield label="Where?" name="whereevent" ></s:textfield>
            <s:textarea label="More info?" name="moreinfo"></s:textarea>       
            <s:submit label="create" value="Create Event" method="action3" ></s:submit>
        </s:form>
    </body>
</html>
