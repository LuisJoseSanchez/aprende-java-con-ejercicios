<%-- resultado.jsp (proyecto Suma) --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Suma</title>
  </head>
  <body>
    La suma es
    <%
      int primerNumero = Integer.valueOf(request.getParameter("x"));
      int segundoNumero = Integer.valueOf(request.getParameter("y"));
      out.println(primerNumero + segundoNumero);
    %>
  </body>
</html>
