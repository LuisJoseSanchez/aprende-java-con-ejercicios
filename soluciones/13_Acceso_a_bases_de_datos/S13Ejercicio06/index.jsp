<%--
  6. Crea una versión web del programa GESTISIMAL (GESTIón SIMplifcada de
     Almacén) para llevar el control de los artículos de un almacén. De cada
     artículo se debe saber el código, la descripción, el precio de compra, el
     precio de venta y el stock (número de unidades). La entrada y salida de
     mercancía supone respectivamente el incremento y decremento de stock de un
     determinado artículo. Hay que controlar que no se pueda sacar más mercancía
     de la que hay en el almacén. Aprovecha las opciones que puede ofrecer una
     interfaz web, por ejemplo para eliminar un artículo ya no será necesario
     pedir el código sino que se puede mostrar un listado de todos los artículos
     de tal forma que se puedan borrar un artículo directamente pulsando un
     botón.
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
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
    <title>Gestisimal</title>
  </head>
  <body>
    <%
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestisimal","root", "root");
      Statement s = conexion.createStatement();

      request.setCharacterEncoding("UTF-8");

      ResultSet listado = s.executeQuery ("SELECT * FROM articulo");
    %>

    
    <div class="container">
      <div class="row"></div>
      <div class="row s12 m12 l12">
        <div class="card grey lighten-5">
          <h3 class="center">G e s t i s i m a l</h3>
          <table class="bordered centered responsive-table">
            <thead><th>Código</th><th>Descripción</th><th>Precio de compra</th><th>Precio de venta</th><th>Stock</th><th></th><th></th><th></th></thead>
            <%
              while (listado.next()) {
            %>
                <tr>
                  <td><%=listado.getString("codigo") %></td>
                  <td><%=listado.getString("descripcion") %></td>
                  <td><%=listado.getString("precio_compra") %></td>
                  <td><%=listado.getString("precio_venta") %></td>
                  <td><%=listado.getString("stock") %></td>
                  <form method="post" action="modificaArticulo.jsp">
                    <input type="hidden" name="codigo" value="<%=listado.getString("codigo") %>">
                    <input type="hidden" name="descripcion" value="<%=listado.getString("descripcion") %>">
                    <input type="hidden" name="preciocompra" value="<%=listado.getString("precio_compra") %>">
                    <input type="hidden" name="precioventa" value="<%=listado.getString("precio_venta") %>">
                    <input type="hidden" name="stock" value="<%=listado.getString("stock") %>">
                    <td>
                    <button class="btn waves-effect waves-light center blue" type="submit" name="editar" title="Modificar artículo">
                      <i class="fa fa-pencil"></i>
                    </button>
                    </td>
                  </form>
                  <form method="post" action="borraArticulo.jsp">
                    <input type="hidden" name="codigo" value="<%=listado.getString("codigo") %>">
                    <td>
                    <button class="btn waves-effect waves-light center red" type="submit" name="borrar" title="Borrar artículo">
                      <i class="fa fa-times"></i>
                    </button>
                    </td>
                  </form>
                  <form method="post" action="modificaStock.jsp">
                    <input type="hidden" name="codigo" value="<%=listado.getString("codigo") %>">
                    <input type="hidden" name="descripcion" value="<%=listado.getString("descripcion") %>">
                    <input type="hidden" name="preciocompra" value="<%=listado.getString("precio_compra") %>">
                    <input type="hidden" name="precioventa" value="<%=listado.getString("precio_venta") %>">
                    <input type="hidden" name="stock" value="<%=listado.getString("stock") %>">
                    <td>
                    <button class="btn waves-effect waves-light center green" type="submit" name="editar" title="Entrada/Salida de stock">
                      <i class="fa fa-database"></i>
                    </button>
                    </td>
                  </form>
                </tr>
            <%
              }
            %>
            <form method="post" action="altaArticulo.jsp">
              <tr>
                <td>
                  <div class="input-field">
                    <input type="number" name="codigo" id="codigo" required>
                    <label for="codigo">código</label>
                  </div>
                </td>
                <td>
                  <div class="input-field">
                    <input type="text" name="descripcion" id="descripcion">
                    <label for="descripcion">descripción</label>
                  </div>
                </td>
                <td>
                  <div class="input-field">
                    <input type="number" min="0" step="0.01" name="preciocompra" id="preciocompra">
                    <label for="preciocompra">precio de compra</label>
                  </div>
                </td>
                <td>
                  <div class="input-field">
                    <input type="number" min="0" step="0.01" name="precioventa" id="precioventa">
                    <label for="precioventa">precio de venta</label>
                  </div>
                </td>
                <td>
                  <div class="input-field">
                    <input type="number" min="0" name="stock" id="stock">
                    <label for="stock">stock</label>
                  </div>
                </td>
                <td>
                  <button class="btn waves-effect waves-light center" type="submit" name="aceptar" title="Añadir artículo">
                    <i class="fa fa-plus"></i>
                  </button>
                </td>
              </tr>
            </form>
          </table>  
        </div>
      </div>
    </div>

    <%
      conexion.close();
    %>
    <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
    <!-- Materialize -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.6/js/materialize.min.js"></script>

  </body>
</html>
