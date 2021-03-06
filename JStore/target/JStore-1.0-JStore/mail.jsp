<%-- 
    Document   : mail
    Created on : Oct 18, 2017, 8:06:01 PM
    Author     : MacOS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="head.jsp" />
    </head>
    <body>
        <jsp:include page="bodyheader.jsp" />
        <!-- products-breadcrumb -->
        <div class="products-breadcrumb">
            <div class="container">
                <ul>
                    <li><i class="fa fa-home" aria-hidden="true"></i><a href="index.html">Home</a><span>|</span></li>
                    <li>Mail Us</li>
                </ul>
            </div>
        </div>
        <!-- //products-breadcrumb -->
        <jsp:include page="bannernavleft.jsp" />
        <div class="w3l_banner_nav_right">
            <!-- mail -->
            <div class="mail">
                <h3>Mail Us</h3>
                <div class="agileinfo_mail_grids">
                    <div class="col-md-4 agileinfo_mail_grid_left">
                        <ul>
                            <li><i class="fa fa-home" aria-hidden="true"></i></li>
                            <li>address<span>868 1st Avenue NYC.</span></li>
                        </ul>
                        <ul>
                            <li><i class="fa fa-envelope" aria-hidden="true"></i></li>
                            <li>email<span><a href="mailto:info@example.com">info@example.com</a></span></li>
                        </ul>
                        <ul>
                            <li><i class="fa fa-phone" aria-hidden="true"></i></li>
                            <li>call to us<span>(+123) 233 2362 826</span></li>
                        </ul>
                    </div>
                    <div class="col-md-8 agileinfo_mail_grid_right">
                        <form action="mailstore" method="post">
                            <div class="col-md-6 wthree_contact_left_grid">
                                <input type="text" name="Name" value="Name*" onfocus="this.value = '';" onblur="if (this.value == '') {
                                            this.value = 'Name*';
                                        }" required="">
                                <input type="email" name="Email" value="Email*" onfocus="this.value = '';" onblur="if (this.value == '') {
                                            this.value = 'Email*';}" required="">
                            </div>
                            <div class="col-md-6 wthree_contact_left_grid">
                                <input type="text" name="Telephone" value="Telephone*" onfocus="this.value = '';" onblur="if (this.value == '') {
                                            this.value = 'Telephone*';}" required="">
                                <input type="text" name="Subject" value="Subject*" onfocus="this.value = '';" onblur="if (this.value == '') {
                                            this.value = 'Subject*';}" required="">
                            </div>
                            <div class="clearfix"> </div>
                            <textarea  name="Message" onfocus="this.value = '';" onblur="if (this.value == '') {
                                        this.value = 'Message...';
                                    }" required="">Message...</textarea>
                            <input type="submit" value="Submit">
                            <input type="reset" value="Clear">
                        </form>
                    </div>
                    <div class="clearfix"> </div>
                </div>
            </div>
            <!-- //mail -->
        </div>
        <div class="clearfix"></div>
    </div>
    <!-- //banner -->
    <!-- map -->
    <div class="map">
        <iframe src="https://www.google.com/maps/embed/v1/place?q=place_id:Eko4IFTDtG4gVGjhuqV0IFRodXnhur90LCBN4bu5IMSQw6xuaCAyLCBD4bqndSBHaeG6pXksIEjDoCBO4buZaSwgVmnhu4d0IE5hbQ&key=AIzaSyD7L6Z-Ujd16iOQOlStiF0neq1zEJxeJOI" style="border:0"></iframe>
    </div>
    <!-- //map -->
    
    <jsp:include page="footer.jsp" />
    <jsp:include page="footerscript.jsp" />
</body>
</html>
