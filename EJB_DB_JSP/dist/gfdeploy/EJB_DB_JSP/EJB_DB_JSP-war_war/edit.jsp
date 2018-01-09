<%-- 
    Document   : edit
    Created on : Sep 22, 2017, 2:38:56 PM
    Author     : MacOS
--%>

<%@page import="entities.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Edit</h1>

        <form name="ac" action="ContactController?ac=edit" method="POST">
            <table style="margin: 60px 0px 0px 60px" >
                <tbody>
                    <%
                        if (request.getAttribute("editc") != null) {

                            TblContact c = (TblContact) request.getAttribute("editc");
                            int idd = c.getId();
                            String name = c.getName();
                            String phone = c.getPhone();
                            String gender = c.getGender();
                            String email = c.getEmail();
                            System.out.println(name+email);
                    %>

                    <tr>
                        <td></td>
                        <td><input type="text" name="txtId" value="<%=idd%>" readonly="true" hidden="true"/></td>
                    </tr>
                    <tr>
                        <td>Name</td>
                        <td><input type="text" name="txtName" value="<%=name%>"/></td>
                    </tr>
                    <tr>
                        <td>Phone</td>
                        <td><input type="text" name="txtPhone" value="<%=phone%>"/></td>
                    </tr>
                    <tr>
                        <td>Gender</td>
                        <td>
                            <select name="txtGender">
                                <option label="Male" value="Male" <% if(gender.equals("Male")){%> selected="true" <% }%> ></option>
                                <option label="Female" value="Female" <% if(gender.equals("Female")){%> selected="true" <% }%> ></option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>Email</td>
                        <td><input type="text" name="txtEmail" value="<%=email%>"/></td>
                    </tr>
                    <% 
                       } 
                    %>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Save" /></td>
                    </tr>
                </tbody>

            </table>



        </form>
    </body>
</html>
