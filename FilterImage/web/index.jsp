<%-- 
    Document   : index.jsp
    Created on : Oct 12, 2017, 7:38:11 AM
    Author     : MacOS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index</title>
    </head>
    <body>
        <div>
            <h3> Choose File to Upload in Server </h3>
            <form action="imgupload" method="post" enctype="multipart/form-data" >
                <input type="file" name="file" />
                <input type="submit" value="upload" />
            </form>         
        </div>

    </body>
</html>
