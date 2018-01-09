
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index</title>
    </head>
    <body>
        <s:a action="pagecreate" >create</s:a>
            </br>

        <s:if test="arrcontact.size()>0" >
            <table border="1">
                <thead>
                    <tr>
                        <th>id</th>
                        <th>username</th>
                        <th>gender</th>
                        <th>country</th>
                        <th>about</th>
                        <th>like</th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <s:iterator value="arrcontact" var="c"> 
                        <tr>
                            <td><s:property value="id"/></td>
                            <td><s:property value="username"/></td>
                            <td><s:property value="gender"/></td>
                            <td><s:property value="country"/></td>
                            <td><s:property value="about"/></td>
                            <td><s:property value="likes"/></td>
                            <td>
                                <s:url id="editURL" action="editContact">
                                    <s:param name="id" value="%{id}" />
                                </s:url>
                                <s:a href="%{editURL}">Edit</s:a>

                                <s:url id="deleteURL" action="deleteContact">
                                    <s:param name="id" value="%{id}" />
                                </s:url>
                                <s:a href="%{deleteURL}">Delete</s:a>

                                </td>
                            </tr>
                    </s:iterator>
                </tbody>
            </table>
        </s:if><s:else>
            <s:action name="listview" executeResult="true" ></s:action>
        </s:else>
    </body>
</html>
