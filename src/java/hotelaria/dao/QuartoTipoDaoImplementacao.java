/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelaria.dao;

import static hotelaria.dao.HotelDaoImplementacao.SELECT_ALL_SQL;
import hotelaria.modelo.Hotel;
import hotelaria.modelo.QuartoTipo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author caioboratto
 */
public class QuartoTipoDaoImplementacao implements QuartoTipoDao {

    protected static final String CAMPOS = "id_quarto_tipo, nome_quarto_tipo, num_cap_maxima";
    //protected static String INSERIR_SQL = "insert into app.hotel (" + CAMPOS + ") values (?, ?, ?)";
    protected static String SELECT_ALL_SQL = "select " + CAMPOS + " from app.quarto_tipo";
    //protected static String SELECT_SQL_ID = "select " + CAMPOS + " from app.hotel where id = ?";
    //protected static String SELECT_SQL_NOME = "select " + CAMPOS + " from app.hotel where nome = ?";
    //protected static String UPDATE_SQL = "update app.hotel set nome= ?, logradouro=?, numero=? where id=?";
    //protected static String DELETE_SQL = "delete from app.hotel where id=? ";

    @Override
    public void inserir(QuartoTipo e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(QuartoTipo e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(QuartoTipo e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QuartoTipo> listar() {
        List<QuartoTipo> quartos = new ArrayList<QuartoTipo>();

        PreparedStatement prepStmt = null;
        ResultSet rs = null;
        try {
            Connection conn = Conexao.getInstance().getConnection();
            prepStmt = conn.prepareStatement(SELECT_ALL_SQL);
            rs = prepStmt.executeQuery();
            while (rs.next()) {
                QuartoTipo quarto = new QuartoTipo(rs.getLong(1), rs.getString(2), rs.getInt(3));

                quartos.add(quarto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return quartos;
    }

}
