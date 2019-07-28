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
      Persona alguien = new Persona("Susana Torio", "Programadora junior");
      ObjectMapper mapper = new ObjectMapper();
      String json = mapper.writeValueAsString(alguien);
      Cookie cookie = new Cookie("alguien", json);
      cookie.setPath("/");
      response.addCookie(cookie);
      out.println("Se ha grabado <b>" + json + "</b> en la cookie <b>alguien</b>");
    %>
    <p>
      <a href="cookie.jsp">Recuperar la cookie desde otra página</a>
    </p>
  </body>
</html>
