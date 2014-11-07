/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotelaria.controle.appcontrollers;

import hotelaria.controle.base.AbstractApplicationController;
import hotelaria.dao.QuartoDaoImplementacao;
import hotelaria.dao.ReservaDaoImplementacao;
import hotelaria.modelo.Hotel;
import hotelaria.modelo.Quarto;
import hotelaria.modelo.QuartoTipo;
import hotelaria.modelo.Reserva;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author caioboratto
 */
public class FazReservaController extends AbstractApplicationController { 

    @Override
    public void execute() {
        
        long idQuarto = Long.parseLong(getRequest().getParameter("quartoSelecionado"));
        
        Reserva reserva = new Reserva();
        reserva.setQuarto(new Quarto());
        reserva.getQuarto().setId(idQuarto);
        
        ReservaDaoImplementacao reservabd = new ReservaDaoImplementacao();
        
        reserva = reservabd.inserir2(reserva);
        
        this.setReturnPage("/efetuar_reserva.jsp");
        this.getRequest().setAttribute("reserva", reserva);
    }
    
}
