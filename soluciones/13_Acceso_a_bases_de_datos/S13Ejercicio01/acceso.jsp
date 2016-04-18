<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <!-- Materialize -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.6/css/materialize.min.css">
    <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  </head>
  
  <body>
  <%
    Class.forName("com.mysql.jdbc.Driver");
    Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/seguridad","root", "root");
    Statement s = conexion.createStatement();

    request.setCharacterEncoding("UTF-8");

    String consulta = "SELECT COUNT(*) FROM acceso WHERE usuario='"
                      + request.getParameter("usuario")
                      + "' AND clave='"
                      + request.getParameter("clave")
                      + "'";

    ResultSet coincidencias = s.executeQuery(consulta);
    coincidencias.next();
    
    String icono;
    String mensaje;
    String enlace;
    
    if (coincidencias.getInt(1) == 0) {
      icono = "<i class=\"material-icons red-text large\">lock</i>"; // candado cerrado
      mensaje = "<p>Lo siento, acceso denegado.</p>";
      enlace = "index.jsp";
      //out.print("<script type=\"text/javascript\">alert(\"Lo siento, acceso denegado\");</script>");
      //out.print("<script>document.location = \"index.jsp\"</script>");
    } else {
      icono = "<i class=\"material-icons teal-text large\">lock_open</i>";
      mensaje = "<p>Acceso permitido a la aplicación.</p>"; // candado abierto
      enlace = "indexp.jsp";
      //out.print("<script type=\"text/javascript\">alert(\"Acceso permitido a la aplicación\");</script>");
      //out.print("<script>document.location = \"indexp.jsp\"</script>");
    };
    %>
    <div class="container">
      <div class="row"></div>
      <div class="row">
        <div class="row col m3"></div>
        <div class="col m6 card-panel grey lighten-5 center">
          <h5 class="center">Control de acceso</h5>          
          <%=icono %>
          <%=mensaje %>
          <p class="center">
            <a href="<%=enlace %>" class="btn waves-effect waves-light center">
              Aceptar
              <i class="material-icons">check_circle</i>
            </a>
          </p>
          <br>
        </div>
      </div>
    </div>
              
    <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
    <!-- Materialize -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.6/js/materialize.min.js"></script>

  </body>
</html>
