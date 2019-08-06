<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Capítulo 15 - Ejercicio 2</title>
  </head>
  <body>
    <%
      double n = 0;
      double total = 0;
      int numeros = 0;

      if (session.getAttribute("total") == null) {
        session.setAttribute("total", 0.0);
        session.setAttribute("numeros", 0);
        total = 0;
        numeros = 0;
      } else {
        total = (Double) session.getAttribute("total");
        numeros = (Integer) session.getAttribute("numeros");
        n = Double.parseDouble(request.getParameter("n"));
        session.setAttribute("total", total + n);
        session.setAttribute("numeros", ++numeros);
      }

      if (n >= 0) {
    %>
    <p>Vaya introduciendo números para calcular la media.</p>
    <p>Para terminar, introduzca un número negativo.</p>
    <form action="#" method="post">
      <input type="number" name="n" step="any" autofocus>
      <input type="submit" value="Aceptar">
    </form>
    <%
      } else {
        // Hay que quitar el último número introducido que es negativo
        session.setAttribute("total", (Double) session.getAttribute("total") - n);
        session.setAttribute("numeros", (Integer) session.getAttribute("numeros") - 1);
    %>
    <p>
      La media es
      <%= (Double) session.getAttribute("total") / (Integer) session.getAttribute("numeros")%>
    </p>
    <%
      }
    %>
  </body>
</html>
