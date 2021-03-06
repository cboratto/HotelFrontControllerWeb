/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelaria.controle.appcontrollers;

import hotelaria.controle.base.AbstractApplicationController;
import hotelaria.dao.HotelDao;
import hotelaria.dao.HotelDaoImplementacao;
import hotelaria.modelo.Hotel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author caioboratto
 */
public class BuscaHotelIDController extends AbstractApplicationController {

    @Override
    public void execute() {
        Hotel hotel;
        HotelDaoImplementacao hoteldao = new HotelDaoImplementacao();

        hotel = hoteldao.lerID(Integer.parseInt(getRequest().getParameter("id")));

        List<Hotel> hoteis = new ArrayList<Hotel>();
        hoteis.add(hotel);
        
        this.setReturnPage("/lista_hoteis.jsp");
        this.getRequest().setAttribute("lista_hoteis", hoteis);

    }

}
