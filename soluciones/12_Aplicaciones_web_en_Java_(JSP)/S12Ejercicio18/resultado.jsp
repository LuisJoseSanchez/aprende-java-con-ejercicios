<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Relación 12 - Ejercicio 18</title>
    <link href="estilos.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
    <h1>El Trile</h1>
    <%
      int bolita = (int)(Math.random() * 3);
      int cubilete = Integer.parseInt(request.getParameter("cubilete"));
      
      String imagen[] = {"cubilete_sin_bola.png", "cubilete_sin_bola.png", "cubilete_sin_bola.png"};
      imagen[bolita] = "cubilete_con_1bola.png";
      
      String mensaje;
      if (bolita == cubilete) {
        mensaje = "¡Enhorabuena! ¡Has acertado!";
      } else {
        mensaje = "Lo siento, has perdido.";
      }
      
    %>  
    <table>
      <tr>
        <td><img src="<%= imagen[0] %>"></td>
        <td><img src="<%= imagen[1] %>"></td>
        <td><img src="<%= imagen[2] %>"></td>
      </tr>
    </table>
      <p><%= mensaje %></p>
      <p><a href="index.jsp"><button>Volver a jugar</button></a></p>
      
  </body>
</html>
