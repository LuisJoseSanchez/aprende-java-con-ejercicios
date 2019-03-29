<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Sesiones</title>
  </head>
  <body>
    <%
      String miColor = (String) session.getAttribute("color");
      int n = (Integer) session.getAttribute("aleatorio");
      out.println("<p>El color es <b>" + miColor + "</b>");
      out.print("y el número es <b>" + n + "</b></p>");
    %>
    <p>Otra variable vale <b><%= session.getAttribute("otra")%></b></p>
    <p>
      <%
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(session.getCreationTime());
        out.println("Incio de sesión: <b>" + formato.format(calendar.getTime()) + "</b>");
      %>
    </p>
    <p>Id de la sesión: <b><%= session.getId() %></b></p>
  </body>
</html>
