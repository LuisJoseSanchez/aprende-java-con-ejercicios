<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Objetos complejos en la sesión</title>
  </head>
  <body>
    <h1>Variables de sesión recuperadas</h1>
    <%
      for (int numero : (ArrayList<Integer>)session.getAttribute("n")) {
          out.print((Integer)numero + " ");
      }
    %>
    <hr>
    <%= session.getAttribute("alguien") %>
  </body>
</html>
