<%@page import="com.fasterxml.jackson.databind.ObjectMapper"%>
<%@page import="clases.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Objeto en una cookie</title>
  </head>
  <body>
    <%
      Cookie cookie = dameCookie(request, "alguien");
      ObjectMapper objectMapper = new ObjectMapper();
      Persona p = objectMapper.readValue(cookie.getValue(), Persona.class);
      out.println("Contenido de la cookie <b>alguien</b>:<br>");
      out.println(p);
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