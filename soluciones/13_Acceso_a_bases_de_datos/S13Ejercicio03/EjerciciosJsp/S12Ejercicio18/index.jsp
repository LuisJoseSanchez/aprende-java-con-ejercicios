<%--
  18. Crea la aplicación "El Trile". Deben aparecer tres cubiletes por pantalla
      y el usuario deberá seleccionar uno de ellos. Para dicha selección se
      puede usar un formulario con radio-button, una lista desplegable, hacer
      clic en el cubilete o lo que resulte más fácil. Se levantarán los tres
      cubiletes y se verá si estaba o no la bolita dentro del que el usuario
      indicó, así mismo, se mostrará un mensaje diciendo "Lo siento, no has
      acertado" o "¡Enhorabuena!, has encontrado la bolita". La probabilidad de
      encontrar la bolita es de 1/3.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Relación 12 - Ejercicio 18</title>
    <link href="estilos.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
    <h1>El Trile</h1>
    <table>
      <tr>
        <td><a href="resultado.jsp?cubilete=0"><img src="cubilete_tapando_bolas.png"</a></td>
        <td><a href="resultado.jsp?cubilete=1"><img src="cubilete_tapando_bolas.png"</a></td>
        <td><a href="resultado.jsp?cubilete=2"><img src="cubilete_tapando_bolas.png"</a></td>
      </tr>
    </table>
    <p>Adivina dónde está la bolita.</p>
  </body>
</html>
