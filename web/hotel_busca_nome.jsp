<%-- 
    Document   : hotel_busca_nome
    Created on : Oct 16, 2014, 10:18:37 PM
    Author     : caioboratto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hotel Busca por Nome</title>
    </head>
    <body>
        <h1>Hotel Busca por Nome</h1>
        <form method="POST" action="/HotelFrontControllerWeb31328334/FrontControllerServlet?control=BuscaHotelNome">
            <p>Nome do Hotel <input type="text" name="nome"></p>
            <p><input type="submit"></p>
        </form>
    </body>
</html>
