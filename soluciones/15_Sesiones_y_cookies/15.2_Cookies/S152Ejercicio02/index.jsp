<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Colores en cookies</title>

    <%
      String texto = "#000000";

      Cookie cookieTexto = dameCookie(request, "texto");

      if (cookieTexto == null) {
        cookieTexto = new Cookie("texto", texto);
        cookieTexto.setPath("/");
        cookieTexto.setMaxAge(365 * 60 * 60);
        response.addCookie(cookieTexto);
      } else {
        texto = cookieTexto.getValue();
      }

      String fondo = "#ffffff";

      Cookie cookieFondo = dameCookie(request, "fondo");
      
      if (cookieFondo == null) {
        cookieFondo = new Cookie("fondo", fondo);
        cookieFondo.setPath("/");
        cookieFondo.setMaxAge(365 * 60 * 60);
        response.addCookie(cookieFondo);
      } else {
        fondo = cookieFondo.getValue();
      }
    %>

    <style>
      body {
        color: <%= texto %>;
        background-color: <%= fondo %>;
      }
    </style>
  </head>
  <body>
    <h1>Colores en cookies</h1>

    <p>
      Esta página permite guardar los colores del texto y del fondo.
    </p>

    <form action="cambia-colores.jsp" method="POST">
      Texto <input type="color" name="texto" value="<%= texto %>">
      Fondo <input type="color" name="fondo"  value="<%= fondo %>">
      <input type="submit" value="Aceptar">
    </form>
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