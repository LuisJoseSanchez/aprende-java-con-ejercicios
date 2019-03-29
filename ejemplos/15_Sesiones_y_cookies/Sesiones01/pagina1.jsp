<%@page import="java.util.Collections"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <style>
      table, th, td {
        border: 1px solid black;
        border-collapse: collapse;
      }
    </style>
    <title>Sesiones</title>
  </head>
  <body>
    <table>
      <tr><th>Nombre</th><th>Valor</th></tr>
      <%
        for (String nombre : Collections.list(session.getAttributeNames())) {
          out.print("<tr><td>" + nombre + "</td>");
          out.print("<td>" + session.getAttribute(nombre) + "</td></tr>");
        }
      %>
    </table>
  </body>
</html>
