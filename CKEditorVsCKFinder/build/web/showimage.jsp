<%-- 
    Document   : showimage
    Created on : Sep 25, 2017, 1:02:37 PM
    Author     : MacOS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript" src="<%=request.getContextPath()%>/ckplugin/ckfinder/ckfinder.js"></script>

    </head>
    <body>
        <input type="text" size="48" name="url" id="urlimage" /> 
        <button id="txtImg" >Select file</button>
        <br></br>
        <div id="showid" >

        </div>


        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script>
            $(document).ready(function () {
                var i = 1;
                $('#txtImg').on('click', function () {
                    i++;
                    var finder = new CKFinder();
                    finder.basePath = '/CKEditorVsCKFinder/Upload/';
                    finder.selectActionFunction = function (url) {
                        $('#urlimage').val(url);
                        $('#showid').append("<img height='300' width='300' src='" + url + "' /> </br> <input type='text' size='48' value='" + url + "' id='urlimage" + i + "' /> </br> ");

                    };
                    finder.popup();
                });

            });

        </script>
    </body>
</html>
