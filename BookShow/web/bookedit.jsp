
<%@page import="DTO.Book"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>Book Edit</title>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.indigo-pink.min.css">
        <script defer src="https://code.getmdl.io/1.3.0/material.min.js"></script>
    </head>
    <body>
        <div class="mdl-layout">
            <h3>Edit Book</h3>
            <%
                if (request.getAttribute("book") != null) {
                    Book bb = (Book) request.getAttribute("book");
                    int id = bb.getId();
                    String title = bb.getTitle();
                    String des = bb.getDescription();
                    String author = bb.getAuthor();
                    Float price = bb.getPrice();
                    String image = bb.getImage();

            %>
            <form method="POST" action="BookServlet" class="mdl-card" style="margin-left: 400px">
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label hidden">
                    <input class="mdl-textfield__input" value="<%=id%>" type="text" id="id1" name="ide">
                    <label class="mdl-textfield__label" for="id1">Id...</label>
                </div>
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input class="mdl-textfield__input" value="<%=title%>" type="text" id="title" name="txttitlee">
                    <label class="mdl-textfield__label" for="title">Title...</label>
                </div>
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input class="mdl-textfield__input" value="<%=des%>" type="text" id="description" name="txtdescriptione">
                    <label class="mdl-textfield__label" for="description">Description...</label>
                </div>
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input class="mdl-textfield__input" value="<%=author%>" type="text" id="author" name="txtauthore">
                    <label class="mdl-textfield__label" for="author">Author...</label>
                </div>
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input class="mdl-textfield__input" value="<%=price%>" type="text" id="author" name="txtpricee">
                    <label class="mdl-textfield__label" for="price">Price...</label>
                </div>
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                    <input class="mdl-textfield__input" value="<%=image%>" type="text" id="image" name="txtimagee">
                    <label class="mdl-textfield__label" for="image">Image...</label>
                </div>

                <%
                    }
                %>
                <input type="submit" value="EditB" name="action"
                       class="mdl-button mdl-js-button mdl-button--raised mdl-button--colored">

            </form>
        </div>

    </body>
</html>
