<%-- 
  6. Realiza un conversor de pesetas a euros.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Relación 12 - Ejercicio 6</title>
  </head>
  <body>
    <h2>Conversor de pesetas a euros</h2>
    <form method="post" action="pesetasaeuros.jsp">
      Pesetas: <input type="number" min="0" name="pesetas"></br></br>
      <input type="submit" value="Aceptar">
    </form>
  </body>
</html>
