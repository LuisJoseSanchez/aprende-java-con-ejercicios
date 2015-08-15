<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Relación 12 - Ejercicio 9</title>
  </head>
  <body>
    <%
      int alturaTotal = Integer.parseInt(request.getParameter("altura"));
      int altura = 1;
      int i = 0;
      int espacios = alturaTotal - 1;

      while (altura <= alturaTotal) {

        // inserta espacios (imagenes en blanco)
        for (i = 1; i <= espacios; i++) {
          out.print("<img src=\"blanco.jpg\">");
        }

        // pinta la línea
        for (i = 1; i < altura * 2; i++) {
          out.print("<img src=\"gatoloco.jpg\">");
        }

        out.println("</br>");

        altura++;
        espacios--;
      } // while
     %>
  </body>
</html>
