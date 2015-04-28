<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Relación 12 - Ejercicio 6</title>
  </head>
  <body>
    <p>
      <%
        int p = Integer.parseInt(request.getParameter("pesetas"));
        DecimalFormat formatoEuros = new DecimalFormat("0.00");
        out.print(p + " pesetas son " + formatoEuros.format(p / 166.386) + " euros.");
      %>
    </p>
  </body>
</html>
