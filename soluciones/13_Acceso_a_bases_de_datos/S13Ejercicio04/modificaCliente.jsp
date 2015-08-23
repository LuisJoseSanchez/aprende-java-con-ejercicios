<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="css/materialize.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  </head>
  <body>
    <% request.setCharacterEncoding("UTF-8"); %>
    <div class="container">
      <div class="row"></div>
      <div class="row">
        <div class="row col m3"></div>
        <div class="col m6 card-panel grey lighten-5">
          <h5 class="center">Datos del cliente</h5>
          <form method="post" action="grabaCliente.jsp">
            <div class="input-field blue-text">
              <i class="mdi-action-label-outline prefix"></i>
              <input type="number" name="clienteid" id="clienteid" value="<%=request.getParameter("clienteid") %>" readonly>
              <label for="clienteid">código</label>
            </div>
            <div class="input-field">
              <i class="mdi-action-perm-identity prefix"></i>
              <input type="text" name="nombre" id="nombre" value="<%=request.getParameter("nombre") %>" required>
              <label for="nombre">nombre</label>
            </div>
            <div class="input-field">
              <i class="mdi-communication-location-on prefix"></i>
              <input type="text" name="direccion" id="direccion" value="<%=request.getParameter("direccion") %>" required>
              <label for="direccion">dirección</label>
            </div>
            <div class="input-field">
              <i class="mdi-communication-call prefix"></i>
              <input type="text" name="telefono" id="telefono" value="<%=request.getParameter("telefono") %>" required>
              <label for="telefono">teléfono</label>
            </div>
            <div class="input-field">
              <i class="fa fa-birthday-cake prefix"></i>
              <input type="date" class="datepicker" name="nacimiento" id="nacimiento" value="<%=request.getParameter("nacimiento") %>" required>
              <label for="nacimiento">fecha de nacim.</label>
            </div>
            <p class="center">
              <button class="btn waves-effect waves-light center" type="submit" name="aceptar">
              Aceptar
              <i class="mdi-action-check-circle"></i>
              </button>
              <a href="index.jsp" class="btn waves-effect waves-light center red">
              Cancelar
              <i class="fa fa-times"></i>
              </a>
            </p>
            <br>
          </form>
        </div>
      </div>
    </div>

    <!--Import jQuery before materialize.js-->
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/materialize.min.js"></script>
    <script>
      $('.datepicker').pickadate({
        // The title label to use for the month nav buttons
        labelMonthNext: 'Mes siguiente',
        labelMonthPrev: 'Mes anterior',

        // The title label to use for the dropdown selectors
        labelMonthSelect: 'Selecciona un mes',
        labelYearSelect: 'Selecciona un año',

        // Months and weekdays
        monthsFull: [ 'Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre', 'Diciembre' ],
        monthsShort: [ 'Ene', 'Feb', 'Mar', 'Abr', 'May', 'Jun', 'Jul', 'Ago', 'Sep', 'Oct', 'Nov', 'Dic' ],
        weekdaysFull: [ 'Domingo', 'Lunes', 'Martes', 'Miércoles', 'Jueves', 'Viernes', 'Sábado' ],
        weekdaysShort: [ 'Dom', 'Lun', 'Mar', 'Mié', 'Jue', 'Vie', 'Sab' ],

        // Materialize modified
        weekdaysLetter: [ 'D', 'L', 'M', 'X', 'J', 'V', 'S' ],

        // Today and clear
        today: 'Hoy',
        clear: 'Limpiar',
        close: 'Cerrar',
        format: "yyyy-mm-dd",
        showOtherMonths: true,
        selectOtherMonths: true,
        selectMonths: true, // Creates a dropdown to control month
        selectYears: 100, // Creates a dropdown of 15 years to control year
        max: true,
        firstDay: 1
      });
    </script>
  </body>
</html>
