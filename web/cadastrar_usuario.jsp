<%-- 
    Document   : cadastrar_usuario
    Created on : Oct 22, 2014, 8:48:36 PM
    Author     : caioboratto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Usuário</title>
    </head>
    <body>
        <h1>Cadastrar Usuário</h1>
        <form method="POST" action="/HotelFrontControllerWeb31328334/FrontControllerServlet?control=CadastrarUsuario">
            <p>Nome  <input type="text" name="nome"></p>            
            <p><input type="submit"></p>
        </form>
    </body>
</html>
