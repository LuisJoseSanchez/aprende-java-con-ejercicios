<%-- 
16. Realiza una aplicación que muestre la tirada aleatoria de tres dados de
    póker. Utiliza imágenes de dados reales.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Relación 12 - Ejercicio 16</title>
    <link href="estilos.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
    <div id="principal">
      <h1>Esta aplicación muestra la tirada aleatoria de tres dados de póker.</h1>
      <p>
        <%
          String[] cara = {"as.png", "j.png", "q.png", "k.png", "siete.png", "ocho.png"};

          for (int i = 0; i < 3; i++) {
            out.print("<img src=\"" + cara[(int)(Math.random()*6)] +"\">");
          }
        %>
      </p>
      <h1>Pulsa la tecla <b>F5</b> para ejecutar de nuevo la aplicación.</h1>
    </div>
  </body>
</html>
