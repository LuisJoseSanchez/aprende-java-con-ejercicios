<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="css/materialize.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Gestión de usuarios</title>
  </head>
  <body>
    <%
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/seguridad","root", "root");
      Statement s = conexion.createStatement();

      request.setCharacterEncoding("UTF-8");
      
      // Comprueba si el usuario ya existe
      String consulta = "SELECT COUNT(*) FROM acceso WHERE usuario='"
                        + request.getParameter("usuario")
                        + "'";
      
      ResultSet coincidencias = s.executeQuery(consulta);
      coincidencias.next();
      
      if (coincidencias.getInt(1) != 0) {
        out.print("<script type=\"text/javascript\">alert(\"Lo siento, el usuario " + request.getParameter("usuario") + " ya existe\");</script>");
        //out.print("<script>document.gestion_usuarios.jsp = \"index.jsp\"</script>");
      } else {
        // Inserta los datos en la base de datos
        String insercion = "INSERT INTO acceso VALUES ('"
                            + request.getParameter("usuario")
                            + "', '" + request.getParameter("clave") + "')";
        out.print(insercion);
        s.execute(insercion);         
        conexion.close();
      }
    %>
    <!--Import jQuery before materialize.js-->
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/materialize.min.js"></script>
    
    <!--Vuelve a la gestión de usuarios-->
    <script>document.location = "gestionUsuarios.jsp"</script>
  </body>
</html>
