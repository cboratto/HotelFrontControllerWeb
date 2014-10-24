/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelaria.dao;

import static hotelaria.dao.HotelDaoImplementacao.INSERIR_SQL;
import static hotelaria.dao.UsuarioDaoImplementacao.SELECT_ALL_SQL;
import hotelaria.modelo.Hotel;
import hotelaria.modelo.Quarto;
import hotelaria.modelo.QuartoTipo;
import hotelaria.modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author caioboratto
 */
public class QuartoDaoImplementacao implements QuartoDao {

    
    protected static String INSERIR_SQL = "insert into app.quarto (id_quarto_tipo, id_hotel) values (?, ?)";
    protected static String SELECT_ALL_SQL = "select q.ID_QUARTO,\n" +
                                            "       h.NOME,\n" +       
                                            "       qt.NOME_QUARTO_TIPO\n" +
                                            "from quarto q \n" +
                                            "join quarto_tipo qt \n" +  
                                            "on q.ID_QUARTO_TIPO = qt.ID_QUARTO_TIPO\n" +
                                            "join hotel h\n" +
                                            "on h.ID = q.ID_HOTEL";
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
        List<Quarto> quartos = new ArrayList<Quarto>();

        Quarto quarto = null;
        PreparedStatement prepStmt = null;
        ResultSet rs = null;
        try {
            Connection conn = Conexao.getInstance().getConnection();
            prepStmt = conn.prepareStatement(SELECT_ALL_SQL);
            rs = prepStmt.executeQuery();
            while (rs.next()) {
                quarto = new Quarto();
                
                //
                Hotel h = new Hotel();
                QuartoTipo qt = new QuartoTipo();
                //
                h.setNome(rs.getString("nome"));
                qt.setNomeQuartoTipo(rs.getString("NOME_QUARTO_TIPO"));
                quarto.setId(rs.getInt("id_quarto"));
                //
                quarto.setHotel(h);
                quarto.setQuartoTipo(qt);

                quartos.add(quarto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return quartos;
    }

}
