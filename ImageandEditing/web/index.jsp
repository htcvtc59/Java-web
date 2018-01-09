<%-- 
    Document   : index
    Created on : Sep 24, 2017, 10:20:32 AM
    Author     : MacOS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="tinymce/js/tinymce/tinymce.min.js"></script>

        <!--Choose Multiple Editor class  . mytextarea <textarea class="mytextarea" name="tinymce"></textarea>-->
        <script>
            tinymce.init({
                selector: '#mytextarea',
                theme: 'modern',
                skin: 'lightgray',
                width: 700,
                height: 300,
                plugins: [
                    'advlist autolink link image lists charmap print preview hr anchor pagebreak spellchecker',
                    'searchreplace wordcount visualblocks visualchars code fullscreen insertdatetime media nonbreaking',
                    'save table contextmenu directionality emoticons template paste textcolor colorpicker'
                ],
                content_css: 'css/content.css',
                toolbar: 'insertfile undo redo | styleselect | bold italic | alignleft aligncenter alignright alignjustify | bullist numlist outdent indent | link image | print preview media fullpage | forecolor backcolor emoticons',


            });

        </script>
    </head>
    <body>
        <h1>TinyMCE Quick Start Guide</h1>
        <form method="post" action="Editing">
            <textarea id="mytextarea" name="tinymce"></textarea>
            <input type="submit" value="TinyMCE" />
        </form>
    </body>
</html>
