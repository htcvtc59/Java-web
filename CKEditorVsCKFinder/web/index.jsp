<%-- 
    Document   : index
    Created on : Sep 25, 2017, 12:37:23 PM
    Author     : MacOS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript" src="<%=request.getContextPath()%>/ckplugin/ckeditor/ckeditor.js"></script>
        <script type="text/javascript" src="<%=request.getContextPath()%>/ckplugin/ckfinder/ckfinder.js"></script>


    </head>
    <body>
        <form action="controller" method="POST">
            <textarea id="ckeditor"  name="edit1" ></textarea>
            <textarea id="ckeditor1"  name="edit2" ></textarea>

            <br></br> <input type="submit" value="Send" />
        </form>
        
        <br></br>
        <div>
             ${edit1}
              ${edit2}
        </div>

        <script>
            var editor = CKEDITOR.replace('ckeditor');
            CKFinder.setupCKEditor(editor, '<%=request.getContextPath()%>/ckplugin/ckfinder/');
            var editor1 = CKEDITOR.replace('ckeditor1');
            CKFinder.setupCKEditor(editor1, '<%=request.getContextPath()%>/ckplugin/ckfinder');

        </script>
    </body>
</html>
