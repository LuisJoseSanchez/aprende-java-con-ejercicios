<%-- 
  9. Realiza una aplicación que pinte una pirámide. La altura se pedirá en un
  formulario. La pirámide estará hecha de bolitas, ladrillos o cualquier otra
  imagen.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Relación 12 - Ejercicio 9</title>
    <link href="estilos.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
    <h1>Pinta una pirámide</h1>
    <form method="get" action="piramide.jsp">
      Introduzca la altura de la pirámide: </br><input type="number" min="1" max="10" name="altura"></br></br>
      <input type="submit" value="Aceptar">
    </form>
  </body>
</html>
