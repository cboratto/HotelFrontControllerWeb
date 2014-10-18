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

/**
 *
 * @author caioboratto
 */
public class CadastrarHotelController extends AbstractApplicationController {
    
    @Override
    public void execute() {
        
        Hotel hotel = new Hotel();
        HotelDao hDao = new HotelDaoImplementacao();
        
        hotel.setNome(getRequest().getParameter("nome"));
        hotel.setLogradouro(getRequest().getParameter("logradouro"));
        hotel.setNumero(Integer.parseInt(getRequest().getParameter("numero")));
        
        hDao.inserir(hotel);
        this.setReturnPage("/index.jsp");
    }
    
}
