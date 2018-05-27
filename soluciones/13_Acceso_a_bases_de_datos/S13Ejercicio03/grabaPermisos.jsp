<%@page import="java.util.Vector"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
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
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/seguridad3","root", "root");
      Statement s = conexion.createStatement();

      request.setCharacterEncoding("UTF-8");
      
      s.execute("DELETE FROM permiso WHERE usuario='" + request.getParameter("usuario") + "'");
      
      for(int i = 1; i < 21; i++) {
        if(request.getParameter("ejer" + i) != null) {
          s.execute("INSERT INTO permiso VALUES ('" + request.getParameter("usuario") + "', " + i + ")");
        }
      }
      conexion.close();
      %>
      <script>document.location = "gestionUsuarios.jsp"</script>
    </body>
</html>

