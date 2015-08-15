<%-- 
2. Mejora el programa anterior de tal forma que se puedan dar de alta nuevos
   usuarios para acceder a la aplicación. Si se introduce un nombre de usuario
   que no sea el administrador (admin) y una contraseña correcta, la aplicación
   funcionará exactamente igual que el ejercicio anterior. Si se introduce el
   usuario "admin" y la contraseña correcta, la aplicación entra en la gestión
   de usuarios donde se podrán dar de alta nuevos usuarios indicando nombre de
   usuario y contraseña. No puede haber dos nombres de usuario iguales aunque sí
   puede haber claves repetidas.
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
