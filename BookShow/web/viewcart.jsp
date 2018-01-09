
<%@page import="DTO.CartChild"%>
<%@page import="java.util.Enumeration"%>
<%@page import="java.util.Hashtable"%>
<%@page import="DTO.Cart"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Cart</title>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons"
              rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">

        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>

    </head>
    <body>
        <%
            if (session.getAttribute("cart") == null) {
        %>
        <h3>Không có đơn hàng</h3>
        <%
        } else {
        %>
        <table class="table table-bordered" align="center">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Title</th>
                    <td>Quantity</td>
                    <th>Author</th>
                    <th>Price</th>
                    <th>Image</th>
                    <th>#</th>
                </tr>
            </thead>
            <tbody>


                <%
                    Cart cart = (Cart) session.getAttribute("cart");
                    Hashtable content = cart.getContent();
                    Enumeration enumeration = content.keys();
                    while (enumeration.hasMoreElements()) {
                        String id = enumeration.nextElement().toString();
                        CartChild cc = (CartChild) content.get(id);
                        String title = cc.getBook().getTitle();
                        String author = cc.getBook().getAuthor();
                        Float price = cc.getBook().getPrice();
                        String image = cc.getBook().getImage();
                        int quantity = cc.getQuantity();
                %>
                <tr id="cart_<%=id%>">
                    <th scope="row"><%=id%></th>
                    <td><%=title%></td>
                    <td>
                        <input type="text" class="form-control cartquantity col-3" data-id="<%=id%>" value="<%=quantity%>"/>
                        <button class="btn btn-success btnUpdate" ><i class="material-icons md-18">refresh</i></button>
                        <button class="btn btn-danger btnDelete"  data-id="<%=id%>" ><i class="material-icons">delete</i></button>
                    </td>
                    <td><%=author%></td>
                    <td><%=price%></td>
                    <td><%=image%></td>
                    <td><a class="btn btn-primary" href="CartControl?id=<%=id%>&ac=del">Delete</a></td>
                </tr>
                <%
                    }
                %>

                <%
                    }
                %>

            </tbody>

            <tfoot>
                <tr class="danger">
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td>Tổng cộng</td>
                    <td>M</td>
                </tr>
            </tfoot>
        </table>




        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

        <script>
            $(document).ready(function () {
                $('.btnDelete').off('click').on('click', function (e) {
                    e.preventDefault();
                    e.stopPropagation();

                    $.ajax({
                        url: 'CartControl',
                        data: {id: $(this).data('id'), ac: 'Delete'},
                        dataType: 'json',
                        type: 'POST',
                        success: function (res) {
                            var data = [];
                            $.each(res, function (key, value) {
                                data.push(key);
                                data.push(value);
                            });

                            console.log(data);
                            console.log(res);

                            if (res.status == true) {
                                console.log(res.status);
                                window.location.href = "http://localhost:8084/BookShow/viewcart.jsp";
                            }

                        },
                        timeout: 2000
                    });

                    $('#cart_' + $(this).data('id')).remove();
                });


                $('.btnUpdate').off('click').on('click', function (e) {
                    e.preventDefault();
                    e.stopPropagation();

                    var listpro = $('.cartquantity');
                    var cartlist = [];
                    $.each(listpro, function (i, item) {
                        cartlist.push({
                            id: $(item).data('id'),
                            quantity: $(this).val(),
                            ac: 'Update'

                        })
                    });

                    $.ajax({
                        url: 'CartControl',
                        data: JSON.stringify(cartlist),
                        dataType: 'json',
                        type: 'POST',
                        contentType: 'application/json; charset=utf-8',
                        success: function (res) {
                            if (res.status == true) {
                                window.location.href = "http://localhost:8084/BookShow/viewcart.jsp";
                            }

                        },
                        timeout: 2000
                    });

                });

            });

        </script>
    </body>
</html>
