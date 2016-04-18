<%-- 
  1. Establece un control de acceso mediante nombre de usuario y contraseña para cualquiera
  de los programas de la relación anterior. No se nos dejará ejecutar la aplicación hasta que
  iniciemos sesión con un nombre de usuario y contraseña correctos. Los nombres de usuario
  y contraseñas deben estar almacenados en una base de datos.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    <!-- Materialize -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.6/css/materialize.min.css">
    <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
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
