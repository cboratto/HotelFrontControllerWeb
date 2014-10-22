package hotelaria.controle.appcontrollers;

import hotelaria.controle.base.AbstractApplicationController;
import hotelaria.dao.UsuarioDao;
import hotelaria.dao.UsuarioDaoImplementacao;
import hotelaria.modelo.Usuario;

public class CadastrarUsuarioController extends AbstractApplicationController {

    @Override
    public void execute() {
        String nome;
        nome = getRequest().getParameter("nome");
        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        
        UsuarioDao usuariodao = new UsuarioDaoImplementacao();
        usuariodao.inserir(usuario);
        
        this.setReturnPage("/index.jsp");
    }

}
