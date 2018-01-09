<%-- 
    Document   : bookadd
    Created on : Sep 5, 2017, 9:17:10 AM
    Author     : MacOS
--%>

<%@page import="DTO.Book"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Index</title>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.indigo-pink.min.css">
        <script defer src="https://code.getmdl.io/1.3.0/material.min.js"></script>

    </head>
    <body>
        <div class="mdl-layout">
            <h3>Add Book</h3>

            <form method="POST" action="BookServlet" class="mdl-card" style="margin-left: 400px">
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input class="mdl-textfield__input"  type="text" id="title" name="txttitle">
                    <label class="mdl-textfield__label" for="title">Title...</label>
                </div>
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input class="mdl-textfield__input" type="text" id="description" name="txtdescription">
                    <label class="mdl-textfield__label" for="description">Description...</label>
                </div>
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input class="mdl-textfield__input"  type="text" id="author" name="txtauthor">
                    <label class="mdl-textfield__label" for="author">Author...</label>
                </div>
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input class="mdl-textfield__input"  type="text" id="author" name="txtprice">
                    <label class="mdl-textfield__label" for="price">Price...</label>
                </div>
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input class="mdl-textfield__input"  type="text" id="image" name="txtimage">
                    <label class="mdl-textfield__label" for="image">Image...</label>
                </div>

                <input type="submit" value="AddBook" name="action"
                       class="mdl-button mdl-js-button mdl-button--raised mdl-button--colored">

            </form>
        </div>

        <%--<jsp:include page = "bookview.jsp" ></jsp:include >--%>

    </body>
</html>
