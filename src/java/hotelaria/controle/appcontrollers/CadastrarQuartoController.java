/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelaria.controle.appcontrollers;

import hotelaria.controle.base.AbstractApplicationController;
import hotelaria.dao.QuartoDao;
import hotelaria.dao.QuartoDaoImplementacao;
import hotelaria.modelo.Hotel;
import hotelaria.modelo.Quarto;
import hotelaria.modelo.QuartoTipo;

/**
 *
 * @author caioboratto
 */
public class CadastrarQuartoController extends AbstractApplicationController {

    @Override
    public void execute() {
        Hotel h = new Hotel();
        QuartoTipo q = new QuartoTipo();

        long idHotel = Integer.parseInt(getRequest().getParameter("hotelSelecionado"));
        long idQuarto = Integer.parseInt(getRequest().getParameter("quartoSelecionado"));

        h.setId(idHotel);
        q.setId(idQuarto);

        Quarto quarto = new Quarto();
        quarto.setHotel(h);
        quarto.setQuartoTipo(q);

        QuartoDao quartoDao = new QuartoDaoImplementacao();
        quartoDao.inserir(quarto);

    }

}
