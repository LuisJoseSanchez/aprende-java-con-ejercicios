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
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
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
    <!--Import jQuery before materialize.js-->
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/materialize.min.js"></script>
  </body>
</html>