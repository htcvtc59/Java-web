<%-- 
    Document   : index
    Created on : Sep 22, 2017, 2:38:15 PM
    Author     : MacOS
--%>

<%@page import="entities.*"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3><a href="create.jsp">create</a></h3>
 
        <form action="ContactController?ac=list" method="POST">
            <input name="txtName" />
            <input type="submit" value="Search" />
        </form>

        <table border="1" >
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Phone</th>
                    <th>Gender</th>
                    <th>Email</th>
                    <th>Option</th>
                </tr>
            </thead>
            <tbody>

                <%
                    if (request.getAttribute("listC") == null) {
                        response.sendRedirect("ContactController?ac=list");
                    } else {

                        List<TblContact> listContact = (List<TblContact>) request.getAttribute("listC");
                        for (TblContact c : listContact) {
                            int idd = c.getId();
                            String name = c.getName();
                            String phone = c.getPhone();
                            String gender = c.getGender();
                            String email = c.getEmail();


                %>
                <tr>
                    <td><%=idd%></td>
                    <td><%=name%></td>
                    <td><%=phone%></td>
                    <td><%=gender%></td>
                    <td><%=email%></td>
                    <td>
                        <a href="ContactController?ac=delete&id=<%=idd%>" >Delete</a> |
                        <a href="ContactController?ac=viewedit&id=<%=idd%>">Edit</a>
                    </td>
                </tr>

                <%
                        }
                    }
                %>

            </tbody>
        </table>


    </body>
</html>
