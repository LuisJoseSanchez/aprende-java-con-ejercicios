<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Relación 12 - Ejercicio 10</title>
    <link href="estilos.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
    <h1>Cuestionario 1º DAW</h1>
    <p>
      Ha obtenido
      <%
        int puntos = 0;

        for (Integer i = 1; i < 11; i++) {
          puntos += Integer.parseInt(request.getParameter("p" + i.toString()));
        }

        out.print(puntos);
      %>
      puntos, haga clic <a href="index.jsp">aquí</a> para repetir el cuestionario.
    </p>
  </body>
</html>
