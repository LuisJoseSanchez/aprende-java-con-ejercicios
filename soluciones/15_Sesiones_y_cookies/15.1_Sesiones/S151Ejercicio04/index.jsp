<%@page import="clases.Carrito"%>
<%@page import="clases.ElementoDeCarrito"%>
<%@page import="java.util.ArrayList"%>
<%@page import="clases.Producto"%>
<%@page import="clases.Catalogo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Tienda de Estilográficas</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/css?family=Great+Vibes&display=swap" rel="stylesheet">
    <style>
      h1 {
        font-family: 'Great Vibes', cursive;
        font-size: 6em;
      }
      .carrito {
        border: #ffc107 solid 2px;
        border-radius: 6px;
        padding: 4px;
      }
    </style>
  </head>
  <body>
    <%
      if (session.getAttribute("catalogo") == null) {
        Catalogo catalogo = new Catalogo();
        catalogo.cargaDatos();
        session.setAttribute("catalogo", catalogo);
      }
      
      if (session.getAttribute("carrito") == null) {
        Carrito carrito = new Carrito();
        session.setAttribute("carrito", carrito);
      }
    %>
    <br>
    <h1 class="text-center">Tienda de Estilográficas</h1>

    <div class="container">
      <div class="row">
        
        <!-- Catálogo de productos -->
        
        <div class="col">
          <div class="row">
            <%
              for (Producto p : ((Catalogo) session.getAttribute("catalogo")).getProductos()) {
            %>

            <div class="col-sm-4">
              <div class="card">
                <img src="img/<%= p.getImagen()%>" class="card-img-top img-fluid">
                <div class="card-body">
                  <h4 class="card-title"><%= p.getNombre()%></h4>
                  <h5><%= String.format("%.2f", p.getPrecio()) %> €</h5>
                  <a href="compra.jsp?codigo=<%= p.getCodigo()%>" class="btn btn-primary">
                    Añadir al carrito
                  </a>
                </div>
              </div>
            </div>
            <%
              }
            %>
          </div>
        </div>
          
          
        <!-- Catálogo de productos -->
        
        <div class="col-3">
          <div class="carrito">
            <img src="img/cart.svg" width="36px">   
          <%
            for (ElementoDeCarrito e : ((Carrito) session.getAttribute("carrito")).getElementos()) {
          %>
              <div class="card">
                <img src="img/<%= e.getProducto().getImagen()%>" class="card-img-top img-fluid">
                <div class="card-body">
                  <%= e.getProducto().getNombre() %><br>
                  <%= String.format("%.2f", e.getProducto().getPrecio()) %> €<br>
                  <%= e.getCantidad() %> unidades<br>
                  <a href="elimina.jsp?codigo=<%= e.getProducto().getCodigo() %>" class="btn btn-warning text-white">
                    Eliminar
                  </a>
                </div>
              </div>
          <%
            }
          %>
          </div>
        </div>
      </div>
    </div>
          
         
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  </body>
</html>
