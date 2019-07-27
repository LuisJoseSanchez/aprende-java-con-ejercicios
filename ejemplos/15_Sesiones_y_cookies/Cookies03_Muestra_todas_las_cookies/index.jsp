<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Cookies</title>
  </head>
  <body>
    <%
      Cookie[] cookies = request.getCookies();

      if (cookies != null) {
        for (Cookie cookie : cookies) {
          out.println(cookie.getName() + ": " + cookie.getValue() + "<br>");
        }
      }
    %>
  </body>
</html>
