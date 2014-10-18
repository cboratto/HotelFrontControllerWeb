/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelaria.dao;

import static hotelaria.dao.HotelDaoImplementacao.INSERIR_SQL;
import hotelaria.modelo.Quarto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author caioboratto
 */
public class QuartoDaoImplementacao implements QuartoDao {

    protected static final String CAMPOS = "id_quarto, id_quarto_tipo, id_hotel";
    protected static String INSERIR_SQL = "insert into app.quarto (id_quarto_tipo, id_hotel) values (?, ?)";
    protected static String SELECT_ALL_SQL = "select " + CAMPOS + " from app.quarto";
    //protected static String SELECT_SQL_ID = "select " + CAMPOS + " from app.hotel where id = ?";
    //protected static String SELECT_SQL_NOME = "select " + CAMPOS + " from app.hotel where nome = ?";
    //protected static String UPDATE_SQL = "update app.hotel set nome= ?, logradouro=?, numero=? where id=?";
    //protected static String DELETE_SQL = "delete from app.hotel where id=? ";

    @Override
    public void inserir(Quarto q) {
        Connection conn = null;
        PreparedStatement prepStmt = null;
        try {
            conn = Conexao.getInstance().getConnection();
            prepStmt = conn.prepareStatement(INSERIR_SQL);
            prepStmt.setLong(1, q.getQuartoTipo().getId());
            prepStmt.setLong(2, q.getHotel().getId());

            prepStmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void alterar(Quarto e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(Quarto e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Quarto> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
