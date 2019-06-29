<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Resultados electorales</title>
    <style>
      .contenedor {
        display: flex;
        width: 100%;
        justify-content: center;
      }
      
      table {
        border: 2px solid gray;
        border-collapse: collapse;
      }
      
      td {
        border: 1px solid gray;
        text-align: center;
        padding: 2px;
        
      }
    </style>
    <script src="js/Chart.js"></script>
  </head>
  <body>
    <h1 style="text-align: center;">Resultados electorales</h1>

    <div class="contenedor">
      <canvas id="pie-chart" height="100%"></canvas>
    </div>

    <div class="contenedor">

      <table>
        <thead>
          <tr>
            <th></th>
            <th>PP</th>
            <th>PSOE</th>
            <th>Ciudadanos</th>
            <th>Vox</th>
            <th>PACMA</th>
            <th>Podemos</th>
            <th>TOTAL</th>
          </tr>

        </thead>
        <tbody>
          <tr>
            <th>Votos</th>
            <td>4356023</td>
            <td>7480755</td>
            <td>4136600</td>
            <td>2677173</td>
            <td>326045</td>
            <td>3732929</td>
            <td>22709525</td>
          </tr>
          <tr>
            <th>Porcentaje</th>
            <td>19,18</td>
            <td>32,94</td>
            <td>18,22</td>
            <td>11,79</td>
            <td>1,44</td>
            <td>16,44</td>
            <td>100</td>
          </tr>
        </tbody>
      </table>

    </div>
    
  </div>

  <script>
    new Chart(document.getElementById("pie-chart"), {
      type: 'pie',
      data: {
        labels: ["PP", "PSOE", "Ciudadanos", "Vox", "PACMA", "Podemos"],
        datasets: [{
            backgroundColor: ["#0055A7", "#FF2527", "#FE6139", "#66BC29", "#FEDB44", "#6A3468"],
            data: [4356023, 7480755, 4136600, 2677173, 326045, 3732929]
          }]
      }
    });
  </script>

</body>
</html>
