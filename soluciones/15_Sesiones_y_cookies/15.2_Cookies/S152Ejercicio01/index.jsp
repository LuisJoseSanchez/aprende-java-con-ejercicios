<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Página multi-idioma</title>
    <style>
      a {
        text-decoration: none;
      }
    </style>
  </head>
  <body>
    <%
      String idioma = "es";

      Cookie cookie = dameCookie(request, "idioma");

      if (cookie == null) {
        cookie = new Cookie("idioma", "ES");
        cookie.setPath("/");
        cookie.setMaxAge(365 * 60 * 60);
        response.addCookie(cookie);
      } else {
        idioma = cookie.getValue();
      }
    %>

    <h1>
      <%=idioma.equals("es") ? "Don Quijote de La Mancha"
              : idioma.equals("eo") ? "Don Quijote de la Mancha"
              : idioma.equals("en") ? "Don Quixote of La Mancha"
              : "Don Quichotte de la Manche"%>
    </h1>

    <object data="<%=idioma.equals("es") ? "txt/es.txt"
            : idioma.equals("eo") ? "txt/eo.txt"
            : idioma.equals("en") ? "txt/en.txt"
            : "fr.txt"%>"></object>

    <br>

    <a href="cambia-idioma.jsp?idioma=es">
      <img src="img/es.svg" width="30" height="15">
    </a>
    <a href="cambia-idioma.jsp?idioma=eo">
      <img src="img/eo.svg" width="30" height="15">
    </a>
    <a href="cambia-idioma.jsp?idioma=en">
      <img src="img/en.svg" width="30" height="15">
    </a>
    <a href="cambia-idioma.jsp?idioma=fr">
      <img src="img/fr.svg" width="30" height="15">
    </a>
  </body>
</html>

<%!
  public static Cookie dameCookie(HttpServletRequest request, String nombre) {
    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
      for (Cookie cookie : cookies) {
        if (cookie.getName().equals(nombre)) {
          return cookie;
        }
      }
    }
    return null;
  }
%>