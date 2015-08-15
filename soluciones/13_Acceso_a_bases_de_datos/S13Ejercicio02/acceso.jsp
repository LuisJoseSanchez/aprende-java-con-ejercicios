<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="css/materialize.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
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
      icono = "<i class=\"mdi-action-lock red-text large\"></i>"; // candado cerrado
      mensaje = "<p>Lo siento, acceso denegado.</p>";
      enlace = "index.jsp";
    } else if (request.getParameter("usuario").equals("admin")) {
      icono = "<i class=\"mdi-communication-vpn-key large\"></i>";
      mensaje = "<p>Tiene acceso al área de gestión de usuarios.</p>"; // candado abierto
      enlace = "gestionUsuarios.jsp";
    } else {
      icono = "<i class=\"mdi-action-lock-open teal-text large\"></i>";
      mensaje = "<p>Acceso permitido a la aplicación.</p>"; // candado abierto
      enlace = "indexp.jsp";
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
              <i class="mdi-action-check-circle"></i>
            </a>
          </p>
          <br>
        </div>
      </div>
    </div>
    <!--Import jQuery before materialize.js-->
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/materialize.min.js"></script>
  </body>
</html>
