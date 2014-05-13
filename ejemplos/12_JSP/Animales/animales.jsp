<%-- 
    Document   : animales
    Created on : 18-abr-2013, 9:05:20
    Author     : luisjose
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Animales</title>
    </head>
    <body>
        <%  String nombreAnimal = request.getParameter("animal");
            String nombreImagen;
            if(nombreAnimal.equals("Gato"))
                    nombreImagen = "gato.jpg";
                else
                    nombreImagen = "caracol.jpg";
        
        int veces = Integer.parseInt(request.getParameter("numero"));
        
        for (int i = 0; i < veces; i++) 
            out.print("<img src=\"" + nombreImagen +"\" width=\"20%\">");
            %>
    </body>
</html>
