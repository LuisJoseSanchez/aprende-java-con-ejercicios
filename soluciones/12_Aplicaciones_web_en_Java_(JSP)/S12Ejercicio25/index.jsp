<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ejercicio 25</title>
  </head>
  <body>
    <%
      int dado1 = 0;
      int dado2 = 0;
      int dado3 = 0;
      
      do {
        dado1 = (int)(Math.random() * 6 + 1);
        dado2 = (int)(Math.random() * 6 + 1);
        dado3 = (int)(Math.random() * 6 + 1);
        %>
        <img src="img/<%= dado1 %>.png">
        <img src="img/<%= dado2 %>.png">
        <img src="img/<%= dado3 %>.png">
        <br>
        <%
      } while (!((dado1 == dado2) && (dado2 == dado3)));
    %>
  </body>
</html>
