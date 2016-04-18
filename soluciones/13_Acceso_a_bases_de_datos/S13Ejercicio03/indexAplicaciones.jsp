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
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
  </head>
  
  <body>
    <%
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/seguridad3","root", "root");
      Statement s = conexion.createStatement();

      request.setCharacterEncoding("UTF-8");

      String consulta = "SELECT ejercicio FROM permiso WHERE usuario='"
                        + request.getParameter("usuario") + "'";
      ResultSet listado = s.executeQuery(consulta);
    %>
    <div class="container center">
      <div class="row"></div>
      <div class="row">
        <div class="col s2">&nbsp;</div>
        <div class="col s8">
          <span>Como usuario <b><%=request.getParameter("usuario") %></b> puede ejecutar los siguientes ejercicios:</span>
          <div class="collection">
            <%
              while (listado.next()) {
            %>
            <a href="EjerciciosJsp/S12Ejercicio<%=listado.getInt("ejercicio") %>/index.jsp" class="collection-item">Ejercicio <%=listado.getInt("ejercicio") %></a>
            <%
              }
            %>
          </div>
          <p class="center">
            <a href="index.jsp" class="btn waves-effect waves-light center">
              <i class="fa fa-home"></i>
              Página principal
            </a>
          </p>
        </div>
      </div>
    </div>
    <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
    <!-- Materialize -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.6/js/materialize.min.js"></script>
  </body>
</html>