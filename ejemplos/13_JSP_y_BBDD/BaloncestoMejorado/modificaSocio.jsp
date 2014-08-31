<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <!-- Bootstrap -->
      <link href="css/bootstrap.min.css" rel="stylesheet">
      <title>Gestisimal - Luis José Sánchez</title>
  </head>
  <body>
    <% request.setCharacterEncoding("UTF-8"); %>
    <div class="container">
      <br><br>
      <div class="panel panel-info">
        <div class="panel-heading text-center">Modificación de socio</div>
          <form method="get" action="grabaSocioModificado.jsp">
            <div class="form-group"> 
              <label>&nbsp;&nbsp;Nº de socio:&nbsp;</label><input type="text" size="5" name="socioID" value="<%= request.getParameter("socioID") %>" readonly>
            </div>
            <div class="form-group">
            <label>&nbsp;&nbsp;Nombre:&nbsp;</label><input type="text" size="35" name="nombre" value="<%= request.getParameter("nombre") %>">
            </div>
            <div class="form-group">
             <label>&nbsp;&nbsp;Estatura (en cm):&nbsp;</label><input type="text" size="5" name="estatura" value="<%= request.getParameter("estatura") %>">
             <label>&nbsp;&nbsp;Edad:&nbsp;</label><input type="text" size="5" name="edad" value="<%= request.getParameter("edad") %>">
            </div>
            <div class="form-group">
             <label>&nbsp;&nbsp;Localidad:&nbsp;</label><input type="text" name="localidad" size="20" value="<%= request.getParameter("localidad") %>">
            </div>
            <hr>
            &nbsp;&nbsp;<a href="index.jsp" class="btn btn-danger"><span class="glyphicon glyphicon-remove"></span>Cancelar</a>
            <button type="submit" class="btn btn-success"><span class="glyphicon glyphicon-ok"></span>Aceptar</button><br><br>
          </form>

      </div>
      <div class="text-center">&copy; Luis José Sánchez González</div>
    </div>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>
