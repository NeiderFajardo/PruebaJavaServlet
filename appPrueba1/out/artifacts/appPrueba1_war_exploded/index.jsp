<%--
  Created by IntelliJ IDEA.
  User: neideralejandro
  Date: 2/05/19
  Time: 07:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
  <%--El siguiente link hace referencia a las fuentes utilizadas --%>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css"
          integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf"
          crossorigin="anonymous">
    <link rel="stylesheet", type="text/css", href="styles/estilos.css"/>
    <title>Prueba de Aplicación</title>
  </head>
  <body>
    <div class="formulario">
        <form method="post" action="guardarServlet">
            <div class="field-name">
              <i class="far fa-user"></i>
              <input id="nombreUsuario" type="text" placeholder="Nombre de Usuario" required name="nombre">
            </div>
            <div class="field-email">
                <i class="far fa-envelope-open"></i>
              <input id="correoUsuario" type="email" placeholder="Correo" required name="correo">
            </div>
            <div class="field-password">
              <i class="fas fa-key"></i>
              <input id="contrasenaUsuario" type="password" placeholder="Contraseña" required name="contrasena">
            </div>
            <div>
                <button id="btn-login" class="registro" type="submit" value="guardar">Registrarse</button>
            </div>
        </form>
    </div>
  </body>
</html>
