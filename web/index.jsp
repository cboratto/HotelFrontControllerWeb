<%-- 
    Document   : index
    Created on : 24/09/2014, 09:30:33
    Author     : Tomaz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gerenciamento de Hotéis</title>
    </head>
    <body>
        <h3>Gerenciamento de Hotéis</h3>
        <ol>
            <li><a href="/HotelFrontControllerWeb31328334/FrontControllerServlet?control=RetornaBuscaInfoHoteis&origem=reserva">Fazer Reserva</a></li>
            <li><a href="/HotelFrontControllerWeb31328334/FrontControllerServlet?control=ListarHoteis">Listar todos os hotéis</a></li>
            <li><a href="/HotelFrontControllerWeb31328334/cadastrar_hotel.jsp">Cadastrar novo hotel</a></li>
            <li><a href="/HotelFrontControllerWeb31328334/FrontControllerServlet?control=RetornaBuscaInfoHoteis&origem=quarto">Cadastrar novo quarto</a></li>
            <li>Alterar dados de um hotel já cadastrado</li>
            <li>Remover um hotel cadastrado</li>
            <li><a href="/HotelFrontControllerWeb31328334/HotelBuscaID.jsp">Buscar pelo ID do Hotel</a></li>
            <li><a href="/HotelFrontControllerWeb31328334/hotel_busca_nome.jsp">Buscar pelo Nome do Hotel</a></li>
        </ol>
    </body>
</html>
