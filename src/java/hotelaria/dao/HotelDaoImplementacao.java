/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelaria.dao;

import hotelaria.modelo.Hotel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author caioboratto
 */
public class HotelDaoImplementacao implements HotelDao {

    protected static final String CAMPOS = "id, nome, logradouro, numero";
    protected static String INSERIR_SQL = "insert into app.hotel (" + CAMPOS + ") values (?, ?, ?)";
    protected static String SELECT_ALL_SQL = "select " + CAMPOS + " from app.hotel";
    protected static String SELECT_SQL_ID = "select " + CAMPOS + " from app.hotel where id = ?";
    protected static String SELECT_SQL_NOME = "select " + CAMPOS + " from app.hotel where nome = ?";
    protected static String UPDATE_SQL = "update app.hotel set nome= ?, logradouro=?, numero=? where id=?";
    protected static String DELETE_SQL = "delete from app.hotel where id=? ";

    public HotelDaoImplementacao() {
    }

    @Override
    public void inserir(Hotel hotel) {
        Connection conn = null;
        PreparedStatement prepStmt = null;
        try {
            conn = Conexao.getInstance().getConnection();
            prepStmt = conn.prepareStatement(INSERIR_SQL);
            prepStmt.setString(1, hotel.getNome());
            prepStmt.setString(2, hotel.getLogradouro());
            prepStmt.setInt(3, hotel.getNumero());
            prepStmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void alterar(Hotel hotel
    ) {
        Connection conn = null;
        PreparedStatement prepStmt = null;
        try {
            conn = Conexao.getInstance().getConnection();
            prepStmt = conn.prepareStatement(UPDATE_SQL);
            prepStmt.setString(1, hotel.getNome());
            prepStmt.setString(2, hotel.getLogradouro());
            prepStmt.setInt(3, hotel.getNumero());
            prepStmt.setLong(4, hotel.getId());
            prepStmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void remover(Hotel hotel
    ) {
        Connection conn = null;
        PreparedStatement prepStmt = null;
        try {
            conn = Conexao.getInstance().getConnection();
            prepStmt = conn.prepareStatement(DELETE_SQL);
            prepStmt.setLong(1, hotel.getId());
            prepStmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Hotel> listar() {
        List<Hotel> hoteis = new ArrayList<Hotel>();

        Hotel hotel = null;
        PreparedStatement prepStmt = null;
        ResultSet rs = null;
        try {
            Connection conn = Conexao.getInstance().getConnection();
            prepStmt = conn.prepareStatement(SELECT_ALL_SQL);
            rs = prepStmt.executeQuery();
            while (rs.next()) {
                hotel = new Hotel();

                hotel.setId(rs.getLong("id"));
                hotel.setNome(rs.getString("nome"));
                hotel.setLogradouro(rs.getString("logradouro"));
                hotel.setNumero(rs.getInt("numero"));

                hoteis.add(hotel);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return hoteis;
    }

    public Hotel lerID(long id) {
        Hotel hotei = null;

        Hotel hotel = null;
        PreparedStatement prepStmt = null;
        ResultSet rs = null;
        try {
            Connection conn = Conexao.getInstance().getConnection();
            prepStmt = conn.prepareStatement(SELECT_SQL_ID);
            prepStmt.setLong(1, id);
            rs = prepStmt.executeQuery();
            while (rs.next()) {
                hotel = new Hotel();

                hotel.setId(rs.getLong("id"));
                hotel.setNome(rs.getString("nome"));
                hotel.setLogradouro(rs.getString("logradouro"));
                hotel.setNumero(rs.getInt("numero"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return hotel;
    }

    public Hotel lerNome(String nome) {
        Hotel hotei = null;

        Hotel hotel = null;
        PreparedStatement prepStmt = null;
        ResultSet rs = null;
        try {
            Connection conn = Conexao.getInstance().getConnection();
            prepStmt = conn.prepareStatement(SELECT_SQL_NOME);
            prepStmt.setString(1, nome);
            rs = prepStmt.executeQuery();
            while (rs.next()) {
                hotel = new Hotel();
                
                hotel.setId(rs.getLong("id"));
                hotel.setNome(rs.getString("nome"));
                hotel.setLogradouro(rs.getString("logradouro"));
                hotel.setNumero(rs.getInt("numero"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return hotel;
    }

}
