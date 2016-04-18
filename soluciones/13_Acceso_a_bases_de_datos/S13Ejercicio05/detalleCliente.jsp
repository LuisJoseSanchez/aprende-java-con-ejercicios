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
    <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.6/css/materialize.min.css">

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">

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
              <i class="material-icons teal-text">label_outline</i> Código: 
              <b><%=listado.getString("clienteid") %></b>
            </p>
            <p>
              <i class="material-icons teal-text">perm_identity</i> Nombre: 
              <b><%=listado.getString("nombre") %></b>
            </p>
            <p>
              <i class="material-icons teal-text">location_on</i> Dirección: 
              <b><%=listado.getString("direccion") %></b>
            </p>
            <p>
              <i class="material-icons teal-text">call</i> Teléfono: 
              <b><%=listado.getString("telefono") %></b>
            </p>
            <p>
              <i class="fa fa-birthday-cake teal-text" style="color: #009688"> Fecha de nacimiento: </i>
              <b><%=listado.getString("nacimiento") %></b>
            </p>
            <br>
            <p class="center">
              <a href="index.jsp" class="btn waves-effect waves-light center">
                Aceptar
                <i class="material-icons">check_circle</i>
              </a>
            </p>
            <br>
          </form>
        </div>
      </div>
    </div>
    <% conexion.close(); %>

    <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
    <!-- Materialize -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.6/js/materialize.min.js"></script>

  </body>
</html>
