
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Signin</title>

        <meta name="google-signin-scope" content="profile email">
        <meta name="google-signin-client_id" content="559136337775-q7q16rtkmts1ul40lkre0glkf5otspbu.apps.googleusercontent.com">
        <script src="https://apis.google.com/js/platform.js" async defer></script>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

    </head>
    <body>
        <script>
            function statusChangeCallback(response) {
                console.log('statusChangeCallback');
                console.log(response);

                if (response.status === 'connected') {
                    testAPI();
                } else {

                    document.getElementById('status').innerHTML = 'Please log ' +
                            'into this app.';
                }
            }

            function checkLoginState() {
                FB.getLoginStatus(function (response) {
                    statusChangeCallback(response);
                });
            }

            window.fbAsyncInit = function () {
                FB.init({
                    appId: '1405560769493137',
                    cookie: true,
                    xfbml: true,
                    version: 'v2.8'
                });

                FB.getLoginStatus(function (response) {
                    statusChangeCallback(response);
                });

            };

            (function (d, s, id) {
                var js, fjs = d.getElementsByTagName(s)[0];
                if (d.getElementById(id))
                    return;
                js = d.createElement(s);
                js.id = id;
                js.src = "//connect.facebook.net/vi_VN/sdk.js#xfbml=1&version=v2.10&appId=1405560769493137";
                fjs.parentNode.insertBefore(js, fjs);
            }(document, 'script', 'facebook-jssdk'));

            function testAPI() {
                console.log('Welcome!  Fetching your information.... ');
                FB.api('/me?fields=id,name,email,picture', function (response) {
                    var jsonObj = JSON.stringify(response.picture);
                    var arr = JSON.parse(jsonObj);
                    var datas = {
                        idf: response.id,
                        namef: response.name,
                        emailf: response.email,
                        imagef: arr.data.url
                    }
                    $.ajax({
                        type: 'POST',
                        url: "Server",
                        contentType: 'application/json;charset=utf-8',
                        data: JSON.stringify(datas),
                        success: function (res) {
                            console.log(res);
                        },
                        timeout: 2000
                    });

                    console.log(response.id + response.name + response.email + arr.data.url);
                    document.getElementById("status").innerHTML =
                            '<a href="fa.jsp?id=' + response.id + '&name=' + response.name + '&email=' + response.email + '&picture=' + arr.data.url + '">Show</a>';
                });
            }

            function fbLogoutUser() {
                FB.getLoginStatus(function (response) {
                    if (response && response.status === 'connected') {
                        FB.logout(function (response) {
                            document.location.reload();
                        });
                    }
                });
            }

        </script>



    <fb:login-button scope="public_profile,email" onlogin="checkLoginState();"
                     class="fb-login-button" data-max-rows="1"
                     data-size="large"
                     data-button-type="login_with" 
                     data-show-faces="false" data-auto-logout-link="false" 
                     data-use-continue-as="true"
                     >
    </fb:login-button>
    <br/>

    <a href="#" onclick="fbLogoutUser();">Sign out Facebook</a>





    <div id="status">
    </div>


    <div class="g-signin2" data-onsuccess="onSignIn" data-theme="dark"></div>
    <script>
        function onSignIn(googleUser) {
            // Useful data for your client-side scripts:
            var profile = googleUser.getBasicProfile();
            var data = {
                id: profile.getId(),
                fullname: profile.getName(),
                givenname: profile.getGivenName(),
                fimalyname: profile.getFamilyName(),
                imageurl: profile.getImageUrl(),
                email: profile.getEmail()
            }

            $.ajax({
                type: 'POST',
                url: "Server",
                contentType: 'application/json;charset=utf-8',
                data: JSON.stringify(data),
                success: function (res) {
                    console.log(res);
                },
                timeout: 2000
            });
            console.log("ID: " + profile.getId());
            console.log('Full Name: ' + profile.getName());
            console.log('Given Name: ' + profile.getGivenName());
            console.log('Family Name: ' + profile.getFamilyName());
            console.log("Image URL: " + profile.getImageUrl());
            console.log("Email: " + profile.getEmail());


            var id_token = googleUser.getAuthResponse().id_token;
            console.log("ID Token: " + id_token);
        }
        ;
    </script>

    <a href="#" onclick="signOut();">Sign out</a>
    <script>
        function signOut() {
            var auth2 = gapi.auth2.getAuthInstance();
            auth2.signOut().then(function () {
                console.log('User signed out.');
            });
        }
    </script>

</body>
</html>
