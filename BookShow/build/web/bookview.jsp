<%-- 
    Document   : bookview
    Created on : Sep 5, 2017, 9:17:29 AM
    Author     : MacOS
--%>

<%@page import="java.util.function.Consumer"%>
<%@page import="java.util.ArrayList"%>
<%@page import="DTO.Book"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Book</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.indigo-pink.min.css">
        <script defer src="https://code.getmdl.io/1.3.0/material.min.js"></script>
    </head>
    <body>
        <h1>View</h1>
        <a style="margin-left: 400px;" href="bookadd.jsp" class="mdl-button mdl-js-button mdl-button--raised mdl-button--colored">
            Add Book
        </a>
        <%
            ArrayList<Book> list = (ArrayList<Book>) request.getAttribute("data");

            for (Book t : list) {
                String title = t.getTitle();
                String description = t.getDescription();
                String author = t.getAuthor();
                Float price = t.getPrice();
                String image = t.getImage();
        %>
        <table class="mdl-data-table mdl-js-data-table mdl-data-table--selectable mdl-shadow--2dp"
               style="margin-left: 400px; margin-bottom: 200px">
            <thead>
                <tr>
            <t class="mdl-data-table__cell--non-numeric">Title</th>
                <th><%=title%></th>
                </tr>
                </thead>

                <tbody>
                    <tr>
                        <td class="mdl-data-table__cell--non-numeric">Description</td>
                        <td><%=description%></td>
                    </tr>
                    <tr>
                        <td class="mdl-data-table__cell--non-numeric">Author</td>
                        <td><%=author%></td>
                    </tr>
                    <tr>
                        <td class="mdl-data-table__cell--non-numeric">Price</td>
                        <td><%=price%></td>
                    </tr>
                    <tr>
                        <td class="mdl-data-table__cell--non-numeric">Image</td>
                        <td><img src="image/<%=image%>" height="20" width="20"/></td>
                    </tr>
                </tbody>
        </table>
        <%
            }
        %>



    </body>
</html>
