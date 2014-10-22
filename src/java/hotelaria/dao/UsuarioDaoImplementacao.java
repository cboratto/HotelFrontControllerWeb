/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelaria.dao;

import static hotelaria.dao.HotelDaoImplementacao.SELECT_ALL_SQL;
import static hotelaria.dao.QuartoDaoImplementacao.INSERIR_SQL;
import hotelaria.modelo.Hotel;
import hotelaria.modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDaoImplementacao implements UsuarioDao {

    protected static final String CAMPOS = "id_usuario, nome";
    protected static String INSERIR_SQL = "insert into app.usuario (nome) values ( ?)";
    protected static String SELECT_ALL_SQL = "select " + CAMPOS + " from app.usuario";

    //protected static String SELECT_SQL_ID = "select " + CAMPOS + " from app.hotel where id = ?";
    //protected static String SELECT_SQL_NOME = "select " + CAMPOS + " from app.hotel where nome = ?";
    //protected static String UPDATE_SQL = "update app.hotel set nome= ?, logradouro=?, numero=? where id=?";
    //protected static String DELETE_SQL = "delete from app.hotel where id=? ";
    @Override
    public void inserir(Usuario usuario) {
        Connection conn = null;
        PreparedStatement prepStmt = null;
        try {
            conn = Conexao.getInstance().getConnection();
            prepStmt = conn.prepareStatement(INSERIR_SQL);
            prepStmt.setString(1, usuario.getNome());

            prepStmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void alterar(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> listar() {
        List<Usuario> usuarios = new ArrayList<Usuario>();

        Usuario usuario = null;
        PreparedStatement prepStmt = null;
        ResultSet rs = null;
        try {
            Connection conn = Conexao.getInstance().getConnection();
            prepStmt = conn.prepareStatement(SELECT_ALL_SQL);
            rs = prepStmt.executeQuery();
            while (rs.next()) {
                usuario = new Usuario();

                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));


                usuarios.add(usuario);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return usuarios;
    }

}
