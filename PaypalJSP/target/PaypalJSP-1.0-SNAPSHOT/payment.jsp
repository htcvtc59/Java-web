<%-- 
    Document   : payment
    Created on : Sep 12, 2017, 3:13:15 PM
    Author     : MacOS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>JSP Page</title>
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script src="https://www.paypalobjects.com/api/checkout.js"></script>


        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">

    </head>
    <body>
        <!--target="paypal"-->
        <form target="_top" action="${initParam['posturl']}" method="post">

            <input type="hidden" name="business" value="${initParam['business']}"/>
            <input type="hidden" name="cmd" value="_cart"/>
            <!--<input type="hidden" name="add" value="1"/>-->
            <input type="hidden" name="upload" value="1"/>
            <!--<input type="hidden" name="display" value="1"/>-->

            <input type="hidden" name="return" value="${initParam['returnurl']}"/>
             <input type="hidden" name="cancel_return" value="${initParam['cancelreturnurl']}"/>

            <!--<input type="hidden" name="paymentaction" value="${initParam['authtoken']}"/>-->
            <!--<input type="hidden" name="currency_code" value="USD"/>-->

            <table class="table">
                <tr>
                    <td><input type="hidden" name="item_name_1" value="name1"/></td>
                    <td><input type="hidden" name="item_number_1" value="p1"/></td>
                    <td><input type="hidden" name="amount_1" value="1"/></td>
                    <td><input type="hidden" name="quantity_1" value="1"/></td>
                </tr>
                <tr>
                    <td><input type="hidden" name="item_name_2" value="name2"/></td>
                    <td><input type="hidden" name="item_number_2" value="p2"/></td>
                    <td><input type="hidden" name="amount_2" value="1"/></td>
                    <td><input type="hidden" name="quantity_2" value="1"/></td>
                </tr>
                <tr>
                    <td><input type="hidden" name="item_name_3" value="name3"/></td>
                    <td><input type="hidden" name="item_number_3" value="p3"/></td>
                    <td><input type="hidden" name="amount_3" value="1"/></td>
                    <td><input type="hidden" name="quantity_3" value="1"/></td>
                </tr>
            </table>

            <input type="image" name="submit"
                   src="https://www.paypalobjects.com/en_US/i/btn/btn_xpressCheckout.gif"
                   alt="Payplay">

        </form>




        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
    </body>
</html>
