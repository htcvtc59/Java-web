<%-- 
    Document   : create
    Created on : Sep 22, 2017, 2:38:49 PM
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
        <h1>Create</h1>

        <form name="ac" action="ContactController?ac=create" method="POST">
            <table style="margin: 60px 0px 0px 60px" >
                <tbody>
                    <tr>
                        <td>Name</td>
                        <td><input type="text" name="txtName"/></td>
                    </tr>
                    <tr>
                        <td>Phone</td>
                        <td><input type="text" name="txtPhone"/></td>
                    </tr>
                    <tr>
                        <td>Gender</td>
                        <td>
                            <select name="txtGender">
                                <option label="Male" value="Male" ></option>
                                <option label="Female" value="Female" ></option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>Email</td>
                        <td><input type="text" name="txtEmail"/></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Save" /></td>
                    </tr>
                </tbody>

            </table>



        </form>

    </body>
</html>
