<%-- pruebaVariable1 --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  </head>
  <body>
    <%
      for (int i = 1; i < 7; i++)
        out.println("<h" + (7-i) + ">"+ i + "</h" + (7-i) + ">");
    %>
  </body>
</html>
