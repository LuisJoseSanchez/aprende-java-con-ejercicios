<%-- 
14. Escribe un programa que muestre los n primeros términos de la serie de
    Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1
    y el resto se calcula sumando los dos anteriores, por lo que tendríamos que
    los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n
    se debe introducir por teclado.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Relación 12 - Ejercicio 14</title>
    <link href="estilos.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
    <h1>Serie de Fibonacci</h1>
    <div id="principal">
    <form method="post" action="fibonacci.jsp">
      Esta aplicación muestra los <b>n</b> primeros números de la serie de Fibonacci.<br><br>
      Por favor, introduzca <b>n</b>:
      <input type="number" min="1" name="n">
      <input type="submit" value="Aceptar">
    </form>
    </div>
  </body>
</html>
