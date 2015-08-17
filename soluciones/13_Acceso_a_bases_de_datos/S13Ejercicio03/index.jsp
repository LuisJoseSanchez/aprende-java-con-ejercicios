<%-- 
  3. Amplía el programa anterior para que se pueda asignar o quitar permiso para
     ejecutar las aplicaciones de la relación anterior a los distintos usuarios.
     Por ejemplo, que se pueda especificar que el usuario "jaimito" pueda
     ejecutar los ejercicios 2, 3 y 5. Para ello, en la base de datos deberá
     existir una tabla con las parejas (usuario, nº ejercicio). Por ejemplo, si
     el usuario “jaimito” tiene acceso a los ejercicios 2, 3 y 5; en la tabla
     correspondiente estarán las parejas (jaimito, 2), (jaimito, 3) y (jaimito, 5).
     Lo ideal es que la asignación de permisos se haga mediante el marcado de
     múltiples "checkbox".
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="css/materialize.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  </head>
  <body>
    <div class="container">
      <div class="row"></div>
      <div class="row">
        <div class="row col m3"></div>
        <div class="col m6 card-panel grey lighten-5">
          <h5 class="center">Control de acceso</h5>
          <form method="post" action="acceso.jsp">
            <div class="input-field">
              <i class="mdi-action-account-circle prefix"></i>
              <input type="text" name="usuario" id="usuario" required>
              <label for="usuario">Usuario</label>
            </div>
            <div class="input-field">
              <i class="mdi-action-lock prefix"></i>
              <input type="password" name="clave" id="clave" required>
              <label for="clave">Contraseña</label>
            </div>
            <p class="center"><button class="btn waves-effect waves-light center" type="submit" name="aceptar">
              Aceptar
              <i class="mdi-action-check-circle"></i>
            </button></p>
            <br>
          </form>
        </div>
      </div>
    </div>
  
    <!--Import jQuery before materialize.js-->
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/materialize.min.js"></script>
  </body>
</html>
