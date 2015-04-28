<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Saludo</title>
  </head>
  <body>
    <% request.setCharacterEncoding("UTF-8"); %>
    Hola <% out.print(request.getParameter("nombre")); %>
  </body>
</html>
