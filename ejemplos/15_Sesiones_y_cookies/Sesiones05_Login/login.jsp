<%
  String usuario = request.getParameter("usuario");
  String contrasena = request.getParameter("contrasena");
  
  if (usuario.equals("pepe") && contrasena.equals("1234")) {
    session.setAttribute("usuario", usuario);
    response.sendRedirect("index.jsp");
  } else {
    session.setAttribute("error", "Usuario o contraseña incorrecto");
    response.sendRedirect("formulario-login.jsp");
  }
%>
