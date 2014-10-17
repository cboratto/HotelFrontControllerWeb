/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelaria.controle.appcontrollers;

import hotelaria.controle.base.AbstractApplicationController;
import hotelaria.dao.HotelDao;
import hotelaria.dao.HotelDaoImplementacao;
import hotelaria.dao.QuartoTipoDao;
import hotelaria.dao.QuartoTipoDaoImplementacao;
import hotelaria.modelo.Hotel;
import hotelaria.modelo.QuartoTipo;
import java.util.List;

/**
 *
 * @author caioboratto
 */
public class RetornaBuscaInfoHoteisController extends AbstractApplicationController {

    @Override
    public void execute() {
        List<Hotel> hoteis;
        List<QuartoTipo> quartos;

        HotelDao hoteldao = new HotelDaoImplementacao();
        QuartoTipoDao quartoTipoDao = new QuartoTipoDaoImplementacao();

        hoteis = hoteldao.listar();
        quartos = quartoTipoDao.listar();
        this.setReturnPage("/busca_hotel.jsp");
        this.getRequest().setAttribute("lista_hoteis", hoteis);
        this.getRequest().setAttribute("lista_quartos", quartos);

    }

}
