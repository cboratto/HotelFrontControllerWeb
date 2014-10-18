<%-- 
    Document   : cadastrar_hotel
    Created on : Oct 17, 2014, 9:03:20 PM
    Author     : caioboratto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar Novo Hotel</title>
    </head>
    <body>
        <h1>Cadastre o novo Hotel</h1>
        <form method="POST" action="/HotelFrontControllerWeb31328334/FrontControllerServlet?control=CadastrarHotel">
            <p>Nome do Hotel <input type="text" name="nome"></p>
            <p>Logradouro  <input type="text" name="logradouro"></p>
            <p>Numero <input type="text" name="numero"></p>
            <p><input type="submit"></p>
        </form>
    </body>
</html>
