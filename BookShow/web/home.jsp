<%-- 
    Document   : home
    Created on : Sep 7, 2017, 8:33:56 AM
    Author     : MacOS
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="DTO.Book"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width,initial-scale=1">
        <title>Home</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.indigo-pink.min.css">
        <script defer src="https://code.getmdl.io/1.3.0/material.min.js"></script>

        <script>
            $(document).ready(function () {
                $("#btnedit").click(function () {
                    $.ajax({
                        type: 'GET',
                        url: "bookadd.jsp?code=" + 2,
                        contentType: 'application/json;charset=utf-8',
                        success: function (response) {
                            console.log(response);
                        }
                    });
                });
                $("#btndelete").click(function () {
                    $.ajax({
                        type: 'GET',
                        url: "bookadd.jsp?code=" + 1,
                        contentType: 'application/json;charset=utf-8',
                        success: function (response) {
                            console.log(response);
                        }
                    });
                });
            });
        </script>

    </head>
    <body id="container">
        <a class="mdl-button mdl-js-button mdl-button--raised" href="bookadd.jsp?code=1">
            Add Book
        </a>
        <%
            if (request.getAttribute("data") == null) {
                response.sendRedirect("BookServlet?action=GetData");
            } else {

        %>
        <table class="mdl-data-table mdl-js-data-table mdl-data-table--selectable mdl-shadow--2dp"
               align="center">
            <thead>
                <tr>
                    <th>Title</th>
                    <th>Description</th>           
                    <th>Author</th>
                    <th>Price</th>
                    <th>Image</th>
                    <th>Edit</th>
                    <th>Delete</th>
                    <th>Cart</th>
                </tr>
            </thead>
            <tbody>
                <%                  
                    ArrayList<Book> list = (ArrayList<Book>) request.getAttribute("data");
                    for (Book b : list) {
                        String title = b.getTitle();
                        String description = b.getDescription();
                        String author = b.getAuthor();
                        Float price = b.getPrice();
                        String image = b.getImage();
                        int id = b.getId();
                %>
                <tr>
                    <td><%=title%></td>
                    <td><%=description%></td>
                    <td><%=author%></td>
                    <td><%=price%></td>
                    <td><img src="image/<%=image%>" height="20" width="20"/></td>
                    <td><a href="BookServlet?action=Edit&id=<%=id%>" id="btnedit" class="mdl-button mdl-js-button mdl-button--raised" >Edit</a></td>
                    <td><a href="BookServlet?action=Delete&id=<%=id%>" id="btndelete" class="mdl-button mdl-js-button mdl-button--raised" >Delete</a></td>
                    <td><a href="CartControl?id=<%=id%>&ac=add" class="mdl-button mdl-js-button mdl-button--raised" >AddCart</a></td>
                </tr>
                <%
                    }
                %>

            </tbody>
        </table>


        <%
            }
        %>

        <script src="https://unpkg.com/material-components-web@latest/dist/material-components-web.min.js"></script>
        <script>window.mdc.autoInit();</script>
    </body>
</html>
