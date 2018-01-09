package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Signin</title>\n");
      out.write("\n");
      out.write("        <meta name=\"google-signin-scope\" content=\"profile email\">\n");
      out.write("        <meta name=\"google-signin-client_id\" content=\"559136337775-q7q16rtkmts1ul40lkre0glkf5otspbu.apps.googleusercontent.com\">\n");
      out.write("        <script src=\"https://apis.google.com/js/platform.js\" async defer></script>\n");
      out.write("\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <script>\n");
      out.write("            function statusChangeCallback(response) {\n");
      out.write("                console.log('statusChangeCallback');\n");
      out.write("                console.log(response);\n");
      out.write("\n");
      out.write("                if (response.status === 'connected') {\n");
      out.write("                    testAPI();\n");
      out.write("                } else {\n");
      out.write("\n");
      out.write("                    document.getElementById('status').innerHTML = 'Please log ' +\n");
      out.write("                            'into this app.';\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function checkLoginState() {\n");
      out.write("                FB.getLoginStatus(function (response) {\n");
      out.write("                    statusChangeCallback(response);\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            window.fbAsyncInit = function () {\n");
      out.write("                FB.init({\n");
      out.write("                    appId: '1405560769493137',\n");
      out.write("                    cookie: true,\n");
      out.write("                    xfbml: true,\n");
      out.write("                    version: 'v2.8'\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                FB.getLoginStatus(function (response) {\n");
      out.write("                    statusChangeCallback(response);\n");
      out.write("                });\n");
      out.write("\n");
      out.write("            };\n");
      out.write("\n");
      out.write("            (function (d, s, id) {\n");
      out.write("                var js, fjs = d.getElementsByTagName(s)[0];\n");
      out.write("                if (d.getElementById(id))\n");
      out.write("                    return;\n");
      out.write("                js = d.createElement(s);\n");
      out.write("                js.id = id;\n");
      out.write("                js.src = \"//connect.facebook.net/vi_VN/sdk.js#xfbml=1&version=v2.10&appId=1405560769493137\";\n");
      out.write("                fjs.parentNode.insertBefore(js, fjs);\n");
      out.write("            }(document, 'script', 'facebook-jssdk'));\n");
      out.write("\n");
      out.write("            function testAPI() {\n");
      out.write("                console.log('Welcome!  Fetching your information.... ');\n");
      out.write("                FB.api('/me?fields=id,name,email,picture', function (response) {\n");
      out.write("                    var jsonObj = JSON.stringify(response.picture);\n");
      out.write("                    var arr = JSON.parse(jsonObj);\n");
      out.write("                    var datas = {\n");
      out.write("                        idf: response.id,\n");
      out.write("                        namef: response.name,\n");
      out.write("                        emailf: response.email,\n");
      out.write("                        imagef: arr.data.url\n");
      out.write("                    }\n");
      out.write("                    $.ajax({\n");
      out.write("                        type: 'POST',\n");
      out.write("                        url: \"Server\",\n");
      out.write("                        contentType: 'application/json;charset=utf-8',\n");
      out.write("                        data: JSON.stringify(datas),\n");
      out.write("                        success: function (res) {\n");
      out.write("                            console.log(res);\n");
      out.write("                        },\n");
      out.write("                        timeout: 2000\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("                    console.log(response.id + response.name + response.email + arr.data.url);\n");
      out.write("                    document.getElementById(\"status\").innerHTML =\n");
      out.write("                            '<a href=\"fa.jsp?id=' + response.id + '&name=' + response.name + '&email=' + response.email + '&picture=' + arr.data.url + '\">Show</a>';\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function fbLogoutUser() {\n");
      out.write("                FB.getLoginStatus(function (response) {\n");
      out.write("                    if (response && response.status === 'connected') {\n");
      out.write("                        FB.logout(function (response) {\n");
      out.write("                            document.location.reload();\n");
      out.write("                        });\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <fb:login-button scope=\"public_profile,email\" onlogin=\"checkLoginState();\"\n");
      out.write("                     class=\"fb-login-button\" data-max-rows=\"1\"\n");
      out.write("                     data-size=\"large\"\n");
      out.write("                     data-button-type=\"login_with\" \n");
      out.write("                     data-show-faces=\"false\" data-auto-logout-link=\"false\" \n");
      out.write("                     data-use-continue-as=\"true\"\n");
      out.write("                     >\n");
      out.write("    </fb:login-button>\n");
      out.write("    <br/>\n");
      out.write("\n");
      out.write("    <a href=\"#\" onclick=\"fbLogoutUser();\">Sign out Facebook</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div id=\"status\">\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"g-signin2\" data-onsuccess=\"onSignIn\" data-theme=\"dark\"></div>\n");
      out.write("    <script>\n");
      out.write("        function onSignIn(googleUser) {\n");
      out.write("            // Useful data for your client-side scripts:\n");
      out.write("            var profile = googleUser.getBasicProfile();\n");
      out.write("            var data = {\n");
      out.write("                id: profile.getId(),\n");
      out.write("                fullname: profile.getName(),\n");
      out.write("                givenname: profile.getGivenName(),\n");
      out.write("                fimalyname: profile.getFamilyName(),\n");
      out.write("                imageurl: profile.getImageUrl(),\n");
      out.write("                email: profile.getEmail()\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            $.ajax({\n");
      out.write("                type: 'POST',\n");
      out.write("                url: \"Server\",\n");
      out.write("                contentType: 'application/json;charset=utf-8',\n");
      out.write("                data: JSON.stringify(data),\n");
      out.write("                success: function (res) {\n");
      out.write("                    console.log(res);\n");
      out.write("                },\n");
      out.write("                timeout: 2000\n");
      out.write("            });\n");
      out.write("            console.log(\"ID: \" + profile.getId());\n");
      out.write("            console.log('Full Name: ' + profile.getName());\n");
      out.write("            console.log('Given Name: ' + profile.getGivenName());\n");
      out.write("            console.log('Family Name: ' + profile.getFamilyName());\n");
      out.write("            console.log(\"Image URL: \" + profile.getImageUrl());\n");
      out.write("            console.log(\"Email: \" + profile.getEmail());\n");
      out.write("\n");
      out.write("\n");
      out.write("            var id_token = googleUser.getAuthResponse().id_token;\n");
      out.write("            console.log(\"ID Token: \" + id_token);\n");
      out.write("        }\n");
      out.write("        ;\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("    <a href=\"#\" onclick=\"signOut();\">Sign out</a>\n");
      out.write("    <script>\n");
      out.write("        function signOut() {\n");
      out.write("            var auth2 = gapi.auth2.getAuthInstance();\n");
      out.write("            auth2.signOut().then(function () {\n");
      out.write("                console.log('User signed out.');\n");
      out.write("            });\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
