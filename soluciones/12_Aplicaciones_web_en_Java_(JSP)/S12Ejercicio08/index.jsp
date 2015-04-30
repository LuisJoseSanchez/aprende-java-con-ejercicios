<%-- 
  8. Realiza una aplicación que pida un número y que luego muestre la tabla de
     multiplicar de ese número. El resultado se debe mostrar en una tabla
     (<table> en HTML).
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Relación 12 - Ejercicio 8</title>
    <link href="estilos.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
    <h1>Tabla de multiplicar</h1>
    <form class="tabla" method="post" action="tabla.jsp">
      Introduzca un número: <input type="number" name="numero">
      <input type="submit" value="Aceptar">
    </form>
  </body>
</html>

