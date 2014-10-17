<%-- 
    Document   : HotelBuscaID
    Created on : Oct 16, 2014, 10:11:44 PM
    Author     : caioboratto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Busca Hotel por ID</title>
    </head>
    <body>
        <h1>Busca Hotel por ID</h1>
        <form method="POST" action="/HotelFrontControllerWeb31328334/FrontControllerServlet?control=BuscaHotelID">
            <p>Hotel ID <input type="text" name="id"></p>
            <p><input type="submit"></p>
        </form>
    </body>
</html>
