<%@page import="clases.Persona"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Objetos complejos en la sesión</title>
  </head>
  <body>
    <h1>Variables de sesión establecidas</h1>
    <% 
      ArrayList<Integer> n = new ArrayList<Integer>();

      for (int i = 0; i < 10; i++) {
        n.add((int) (Math.random() * 10) + 1);
      }
      
      session.setAttribute("n", n);
      
      Persona alguien = new Persona("Susana Torio", "Programadora junior");
      session.setAttribute("alguien", alguien);
    %>
    <p>
      <a href="pagina1.jsp">Página 1</a>
    </p>
  </body>
</html>
