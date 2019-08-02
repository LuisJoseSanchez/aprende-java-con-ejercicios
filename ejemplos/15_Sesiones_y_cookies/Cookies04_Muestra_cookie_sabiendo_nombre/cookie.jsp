<%@page import="org.jboss.weld.context.http.HttpRequestContext"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Obtiene el valor de una cookie</title>
  </head>
  <body>
    <%
      String nombre = request.getParameter("nombre");

      Cookie cookie = dameCookie(request, nombre);

      if (cookie == null) {
        out.println("No se ha encontrado ninguna cookie con ese nombre.");
      } else {
        out.println("El valor de la cookie " + nombre + " es " + cookie.getValue());
      }
    %>
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
