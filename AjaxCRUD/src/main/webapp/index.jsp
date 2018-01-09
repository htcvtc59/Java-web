
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Index</title>

        <!--        <link rel="stylesheet" type="text/css" href="css/base.css"/>
        
                <link rel="stylesheet" type="text/css" media="only screen and (min-width:320px) and
                      (max-device-height: 575px) and (orientation : portrait) and (-webkit-device-pixel-ratio: 3)"
                      href="css/screen-max-575.css"/>
        
                <link rel="stylesheet" type="text/css" media="only screen and (min-width:320px) and
                      (max-device-height: 575px) and (orientation : landscape) and (-webkit-device-pixel-ratio: 3)"
                      href="css/screen-max-575.css"/>
        
                <link rel="stylesheet" type="text/css" media="only screen and (min-width:576px)"
                      href="css/screen-min-576-max-767.css"/>
        
                <link rel="stylesheet" type="text/css" media="only screen and (min-width:768px)"
                      href="css/screen-min-768-max-991.css"/>
        
                <link rel="stylesheet" type="text/css" media="only screen and (min-width:992px)"
                      href="css/screen-min-992-max-1199.css"/>
        
                <link rel="stylesheet" type="text/css" media="only screen and (min-width:1200px)"
                      href="css/screen-min-1200.css"/>-->

        <link rel="stylesheet" 
              href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" 
              integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" 
              crossorigin="anonymous">

        <!--        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
                <link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.indigo-pink.min.css">
                <script defer src="https://code.getmdl.io/1.3.0/material.min.js"></script>-->


        <link href="js/pagination.css" type="text/css" rel="stylesheet"/>      
        <link href="js/pagination.less" type="text/plain" rel="stylesheet"/>

    </head>
    <body>
        <div class="container-fluid">
            <div class="row" style="margin-top: 100px">
                <div class="col-2"></div>

                <div class="col-8 card" style="width: 20rem;">
                    <div class="card-body">

                        <div class="row">
                            <div class="col-3">
                                <button type="button" class="btn btn-primary card-title" data-toggle="modal"
                                        data-target="#exampleModal" >Add Contact</button>
                                <jsp:include page="create.jsp" flush="true"></jsp:include>

                                <jsp:include page="update.jsp" flush="true"></jsp:include>

                            </div>

                            <div class="col-6">
                                <div class="input-group">
                                    <input type="text" class="form-control" placeholder="Search for..." aria-label="Search for..." id="idsContact">
                                    <span class="input-group-btn">
                                        <button class="btn btn-secondary" id="btnSearch" type="button">Go!</button>
                                    </span>
                                </div>
                            </div>
                        </div>

                        <table class="table table-bordered table-responsive">

                            <thead>
                                <tr>
                                    <th>#</th>
                                    <th>ID</th>
                                    <th>Name</th>
                                    <th>Age</th>
                                    <th>Address</th>
                                    <th>#</th>
                                </tr>
                            </thead>
                            <tbody id="tbodyContact">

                            </tbody>

                        </table>

                        <div id="pagination-container" class="custom-paginationjs"></div>
                    </div>
                </div>


                <div class="col-2"></div>
            </div>

        </div>


        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" 
                integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" 
        crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"
                integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" 
        crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" 
                integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" 
        crossorigin="anonymous"></script>
        <!--<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>-->


        <script src="js/pagination.js" type="text/javascript" ></script>
        <script src="js/contact.js" type="text/javascript"></script>

    </body>
</html>
