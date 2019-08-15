<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Contador de visitas</title>
  </head>
  <body>
    <%
      session.setAttribute("n", session.getAttribute("n") == null ?
          1 : (Integer)session.getAttribute("n") + 1);
    %>
    <h1><%= session.getAttribute("n") %></h1>
    <a href="reset.jsp">Reinicia la cuenta</a>
  </body>
</html>
