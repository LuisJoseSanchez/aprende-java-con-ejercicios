<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  </head>
  <body>
    <%
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/baloncesto","root", "root");
      Statement s = conexion.createStatement();

      request.setCharacterEncoding("UTF-8");
      String insercion = "INSERT INTO socio VALUES (" + Integer.valueOf(request.getParameter("numero"))
                         + ", '" + request.getParameter("nombre")
                         + "', " + Integer.valueOf(request.getParameter("estatura"))
                         + ", " + Integer.valueOf(request.getParameter("edad"))
                         + ", '" + request.getParameter("localidad") + "')";
      s.execute(insercion);         
      conexion.close();
    %>
    Socio dado de alta.
  </body>
</html>