<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Capítulo 15 - Ejercicio 3</title>
  </head>
  <body>
    <%
      int n = 0;
      int sumaImpares = 0;
      int impares = 0;
      int maximoPar = Integer.MIN_VALUE;

      if (session.getAttribute("sumaImpares") == null) {
        sumaImpares = 0;
        impares = 0;
        maximoPar = Integer.MIN_VALUE;
        session.setAttribute("sumaImpares", sumaImpares);
        session.setAttribute("impares", impares);
        session.setAttribute("maximoPar", maximoPar);
      } else {
        sumaImpares = (Integer) session.getAttribute("sumaImpares");
        impares = (Integer) session.getAttribute("impares");
        maximoPar = (Integer) session.getAttribute("maximoPar");

        n = Integer.parseInt(request.getParameter("n"));

        if (n % 2 == 0) {
          if (n > maximoPar) {
            session.setAttribute("maximoPar", n);
          }
        } else {
          session.setAttribute("sumaImpares", sumaImpares + n);
          session.setAttribute("impares", ++impares);
        }

      }

      if (n >= 0) {
    %>
    <p>Vaya introduciendo números enteros.</p>
    <p>El programa calculará la media de los impares y el mayor de los pares.</p>
    <p>Para terminar, introduzca un número negativo.</p>
    <form action="#" method="post">
      <input type="number" name="n" autofocus>
      <input type="submit" value="Aceptar">
    </form>
    <%
    } else {
      // Hay que quitar el último número introducido si es impar
      if (n % 2 != 0) {
        session.setAttribute("sumaImpares", (Integer) session.getAttribute("sumaImpares") - n);
        session.setAttribute("impares", (Integer) session.getAttribute("impares") - 1);
      }

    %>
    <p>
      La media de los impares es
      <%= (Integer) session.getAttribute("sumaImpares")  * 1.0 / (Integer) session.getAttribute("impares") %>
      <br>
      El máximo de los pares es <%= (Integer) session.getAttribute("maximoPar")%>
    </p>
    <%
    }
    %>
  </body>
</html>
