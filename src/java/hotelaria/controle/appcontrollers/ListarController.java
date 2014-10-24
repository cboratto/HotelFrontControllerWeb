/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelaria.controle.appcontrollers;

import hotelaria.controle.base.AbstractApplicationController;
import hotelaria.dao.HotelDao;
import hotelaria.dao.HotelDaoImplementacao;
import hotelaria.dao.QuartoDao;
import hotelaria.dao.QuartoDaoImplementacao;
import hotelaria.dao.UsuarioDao;
import hotelaria.dao.UsuarioDaoImplementacao;
import hotelaria.modelo.Hotel;
import hotelaria.modelo.Quarto;
import hotelaria.modelo.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author caioboratto
 */
public class ListarController extends AbstractApplicationController {

    @Override
    public void execute() {
        String origem = getRequest().getParameter("origem");

        if (origem.equals("usuario")) {
            List<Usuario> usuarios = new ArrayList<Usuario>();
            UsuarioDao usuariodao = new UsuarioDaoImplementacao();

            usuarios = usuariodao.listar();
            this.getRequest().setAttribute("lista_usuarios", usuarios);
            this.setReturnPage("/lista_usuarios.jsp");

        } else if (origem.equals("hotel")) {

            HotelDao hotelDao = new HotelDaoImplementacao();
            List<Hotel> hoteis = hotelDao.listar();

            this.setReturnPage("/lista_hoteis.jsp");
            this.getRequest().setAttribute("lista_hoteis", hoteis);
        } else if (origem.equals("quarto")) {
            List<Quarto> quartos = new ArrayList<Quarto>();
            QuartoDao quartodao = new QuartoDaoImplementacao();

            quartos = quartodao.listar();
            this.setReturnPage("/lista_quartos.jsp");
            this.getRequest().setAttribute("lista_quartos", quartos);
        }

    }

}
