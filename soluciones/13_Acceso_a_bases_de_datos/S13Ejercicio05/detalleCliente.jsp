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
    <title>Gestibank</title>
  </head>
  <body>
    <%
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco","root", "root");
      Statement s = conexion.createStatement();

      request.setCharacterEncoding("UTF-8");

      ResultSet listado = s.executeQuery ("SELECT * FROM cliente WHERE clienteid='" + request.getParameter("clienteid") +"'");

      listado.next();
    %>
             
    <div class="container">
      <div class="row"></div>
      <div class="row">
        <div class="row col m3"></div>
        <div class="col m6 card-panel grey lighten-5">
          <h5 class="center"><%=listado.getString("nombre") %></h5>
            <p>
              <i class="mdi-action-label-outline teal-text"> Código: </i>
              <b><%=listado.getString("clienteid") %></b>
            </p>
            <p>
              <i class="mdi-action-perm-identity teal-text"> Nombre: </i>
              <b><%=listado.getString("nombre") %></b>
            </p>
            <p>
              <i class="mdi-communication-location-on teal-text"> Dirección: </i>
              <b><%=listado.getString("direccion") %></b>
            </p>
            <p>
              <i class="mdi-communication-call teal-text"> Teléfono: </i>
              <b><%=listado.getString("telefono") %></b>
            </p>
            <p>
              <i class="fa fa-birthday-cake teal-text"> Fecha de nacimiento: </i>
              <b><%=listado.getString("nacimiento") %></b>
            </p>
            <br>
            <p class="center">
              <a href="index.jsp" class="btn waves-effect waves-light center">
                Aceptar
                <i class="mdi-action-check-circle"></i>
              </a>
            </p>
            <br>
          </form>
        </div>
      </div>
    </div>
    <% conexion.close(); %>

    <!--Import jQuery before materialize.js-->
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/materialize.min.js"></script>
  </body>
</html>
