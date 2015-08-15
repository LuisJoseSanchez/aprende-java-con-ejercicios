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
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/seguridad3","root", "root");
      Statement s = conexion.createStatement();

      request.setCharacterEncoding("UTF-8");

      String consulta = "SELECT ejercicio FROM permiso WHERE usuario='"
                        + request.getParameter("usuario") + "'";
      ResultSet listado = s.executeQuery(consulta);
    %>
    <div class="container">
      <div class="row"></div>
      <div class="row">
        <div class="col l2">&nbsp;</div>
        <div class="col l8">
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
        </div>
      </div>
    </div>
    <!--Import jQuery before materialize.js-->
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/materialize.min.js"></script>
  </body>
</html>