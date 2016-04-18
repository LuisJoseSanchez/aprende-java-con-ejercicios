<%-- 
9. Realiza una aplicación que pinte una pirámide. La altura se pedirá en un
formulario. La pirámide estará hecha de bolitas, ladrillos o cualquier otra
imagen.
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
        <div class="row col m4"></div>
        <div class="col m4 card-panel grey lighten-5">
          <h5 class="center">Pinta una pirámide</h5>
          <form method="post" action="piramide.jsp">
            <div class="input-field">
              <input type="number" min="1" max="10" name="altura" id="altura" required>
              <label for="altura">Altura</label>
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

  </body><!--
    <body>
        
        <form  class="form-4"method="get" action="piramide.jsp">
      <h1>Pinta una pirámide</h1>
      <p>
        <input type="text" name="altura" placeholder="Altura" required></br></br>
            </p>
      <p>
        <input type="submit" value="Aceptar">
      </p>
        </form>
    </body>-->
</html>
