<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Sesiones</title>
  </head>
  <body>
    <%
      session.setAttribute("palabra", "hola");
      session.setAttribute("aleatorio", (int) (Math.random() * 10) + 1);
      session.setAttribute("color", "verde");
    %>
    <p>Variables de sesión asignadas.</p>
    <p><a href="pagina1.jsp">Página 1</a></p>
    <p><a href="pagina2.jsp">Página 2</a></p>
  </body>
</html>
