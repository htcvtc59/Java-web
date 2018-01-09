<%-- 
    Document   : index
    Created on : Sep 18, 2017, 8:48:03 PM
    Author     : MacOS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form action="payment" method="POST">
            <script
                src="https://checkout.stripe.com/checkout.js" class="stripe-button"
                data-key="pk_test_dMOrASP37wKPhaCQaxegqxaf"
                data-amount="100"
                data-name="Order"
                data-description="AppStore"
                data-image="https://stripe.com/img/documentation/checkout/marketplace.png"
                data-locale="auto">
            </script>
            
        </form>
        
    </body>
</html>
