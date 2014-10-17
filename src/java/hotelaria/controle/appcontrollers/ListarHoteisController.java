package hotelaria.controle.appcontrollers;

import hotelaria.controle.base.AbstractApplicationController;
import hotelaria.dao.HotelDao;
import hotelaria.dao.HotelDaoImplementacao;
import hotelaria.modelo.Hotel;
import hotelaria.persistencia.HotelBd;
import java.util.List;

public class ListarHoteisController extends AbstractApplicationController {

    @Override
    public void execute() {
        HotelDao hotelDao = new HotelDaoImplementacao();
        
        List<Hotel> hoteis = hotelDao.listar();
        this.setReturnPage("/lista_hoteis.jsp");
        this.getRequest().setAttribute("lista_hoteis", hoteis);

    }

}
