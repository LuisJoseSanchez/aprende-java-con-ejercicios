<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="css/estilos.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
    <h1>Apuesta y gana</h1>
    <div id="principal">
      <%
        int dinero = Integer.parseInt(request.getParameter("dinero"));
      %>
      <h2>Ha conseguido <%= dinero %> euros</h2>
      <form method="post" action="index.jsp">
        <input type="submit" value="Volver a jugar">
      </form>
    </div>
  </body>
</html>
