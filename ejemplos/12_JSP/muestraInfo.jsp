<%-- muestraInfo.jsp --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  </head>
  <body>
    <h1>Información del entorno de trabajo</h1>
    <%
      out.print("Fabricante de Java: " + System.getProperty("java.vendor"));
      out.print("<br>Url del fabricante: " + System.getProperty("java.vendor.url"));
      out.print("<br>Versión: " + System.getProperty("java.version"));
      out.print("<br>Sistema operativo: " + System.getProperty("os.name"));
      out.print("<br>Usuario: " + System.getProperty("user.name"));	
    %>
  </body>
</html>
