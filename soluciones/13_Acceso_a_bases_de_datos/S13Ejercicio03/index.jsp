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
    <!-- Materialize -->
    <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.6/css/materialize.min.css">
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
              <i class="material-icons prefix">account_circle</i>
              <input type="text" name="usuario" id="usuario" required>
              <label for="usuario">Usuario</label>
            </div>
            <div class="input-field">
              <i class="material-icons prefix">lock</i>
              <input type="password" name="clave" id="clave" required>
              <label for="clave">Contraseña</label>
            </div>
            <p class="center"><button class="btn waves-effect waves-light center" type="submit" name="aceptar">
              Aceptar
              <i class="material-icons">check_circle</i>
            </button></p>
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
