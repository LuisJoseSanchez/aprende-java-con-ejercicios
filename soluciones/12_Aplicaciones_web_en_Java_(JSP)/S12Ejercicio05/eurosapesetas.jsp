<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Euros a pesetas</title>
  </head>
  <body>
    <% Double e = Double.parseDouble(request.getParameter("euros")); %>
    <% out.print(e); %> euros son <% out.println(Math.round(e * 166.386)); %> pesetas.
  </body>
</html>
