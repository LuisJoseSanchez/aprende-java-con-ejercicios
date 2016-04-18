<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.6/css/materialize.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
  </head>
  <body>
    <% request.setCharacterEncoding("UTF-8"); %>
    <div class="container">
      <div class="row"></div>
      <div class="row">
        <div class="row col m3"></div>
        <div class="col m6 card-panel grey lighten-5">
          <h5 class="center">Datos del artículo</h5>
          <form method="post" action="grabaArticulo.jsp">
            <div class="input-field blue-text">
              <i class="fa fa-tag prefix"></i>
              <input type="number" name="codigo" id="clienteid" value="<%=request.getParameter("codigo") %>" readonly>
              <label for="codigo">código</label>
            </div>
            <div class="input-field">
              <i class="fa fa-file-text-o prefix"></i>
              <input type="text" name="descripcion" id="descripcion" value="<%=request.getParameter("descripcion") %>" required>
              <label for="descripcion">descripción</label>
            </div>
            <div class="input-field">
              <i class="fa fa-eur prefix"></i>
              <input type="number" min="0" step="0.01" name="preciocompra" id="preciocompra" value="<%=request.getParameter("preciocompra") %>" required>
              <label for="preciocompra">precio de compra</label>
            </div>
            <div class="input-field">
              <i class="fa fa-eur prefix"></i>
              <input type="number" min="0" step="0.01" name="precioventa" id="precioventa" value="<%=request.getParameter("precioventa") %>" required>
              <label for="precioventa">precio de venta</label>
            </div>
            <div class="input-field">
              <i class="fa fa-database prefix"></i>
              <input type="number" min="0" name="stock" id="stock" value="<%=request.getParameter("stock") %>" required>
              <label for="stock">stock</label>
            </div>
            <p class="center">
              <button class="btn waves-effect waves-light center" type="submit" name="aceptar">
              Aceptar
              <i class="material-icons">check_circle</i>
              </button>
              <a href="index.jsp" class="btn waves-effect waves-light center red">
              Cancelar
              <i class="fa fa-times"></i>
              </a>
            </p>
            <br>
          </form>
        </div>
      </div>
    </div>

    <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
    <!-- Materialize -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.6/js/materialize.min.js"></script>

  </body>
</html>
