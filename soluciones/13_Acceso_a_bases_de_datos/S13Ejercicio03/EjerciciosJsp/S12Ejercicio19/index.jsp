<%-- 
  19. Crea el juego “Apuesta y gana”. El usuario debe introducir inicialmente una cantidad de
      dinero. A continuación aparecerá por pantalla una imagen de forma aleatoria. Si sale una
      calavera, el usuario pierde todo su dinero y termina el juego. Si sale medio limón, el usuario
      pierde la mitad del dinero y puede seguir jugando con esa cantidad o puede dejar de jugar.
      Si sale el gato chino de la suerte, el usuario multiplica por dos su dinero y puede seguir
      jugando con esa cantidad o puede dejar de jugar.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Relación 12 - Ejercicio 19</title>
    <link href="css/estilos.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
    <h1>Apuesta y gana</h1>
    <div id="principal">
    <form method="post" action="juego.jsp">
      <p>Por favor, introduzca la cantidad que quiere apostar:</p>
      <input type="number" min="1" name="dinero">€<br>
      <input type="submit" value="Aceptar">
    </form>
    </div>
  </body>
</html>
