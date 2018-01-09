

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Events</title>
    </head>
    <body>
        <s:a action="pagecreate" >create</s:a>
            </br>

        <s:if test="arrEvent.size()>0" >
            <table border="1">
                <thead>
                    <tr>
                        <th>id</th>
                        <th>dateevent</th>
                        <th>timeevent</th>
                        <th>planning</th>
                        <th>whereevent</th>
                        <th>moreinfo</th>
                    </tr>
                </thead>
                <tbody>
                    <s:iterator value="arrEvent" var="c"> 
                        <tr>
                            <td><s:property value="id"/></td>
                            <td><s:property value="dateevent"/></td>
                            <td><s:property value="timeevent"/></td>
                            <td><s:property value="planning"/></td>
                            <td><s:property value="whereevent"/></td>
                            <td><s:property value="moreinfo"/></td>
                        </tr>
                    </s:iterator>
                </tbody>
            </table>
        </s:if><s:else>
            <s:action name="listview" executeResult="true" ></s:action>
        </s:else>
    </body>
</html>
