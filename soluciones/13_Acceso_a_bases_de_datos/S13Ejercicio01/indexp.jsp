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
    <link rel="stylesheet" href="css/materialize.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
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
