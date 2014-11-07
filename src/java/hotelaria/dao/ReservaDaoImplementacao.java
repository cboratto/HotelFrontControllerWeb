/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelaria.dao;


import hotelaria.modelo.Reserva;
import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Random;

public class ReservaDaoImplementacao implements ReservaDao {

    protected static String INSERT_RESERVA = "insert into reserva (id_quarto, cod_reserva) values (?, ?)";

    @Override
    public void inserir(Reserva r) {
        Connection conn = null;
        PreparedStatement prepStmt = null;
        try {
            conn = Conexao.getInstance().getConnection();
            prepStmt = conn.prepareStatement(INSERT_RESERVA);
            prepStmt.setLong(1, r.getQuarto().getId());
            SecureRandom sr = new SecureRandom();
            prepStmt.setString(2, "RESER00" + sr.generateSeed(64));

            prepStmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void alterar(Reserva e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(Reserva e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Reserva> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Reserva inserir2(Reserva r) {
        Connection conn = null;
        PreparedStatement prepStmt = null;
        Reserva reserva = new Reserva();

        try {
            conn = Conexao.getInstance().getConnection();
            prepStmt = conn.prepareStatement(INSERT_RESERVA, Statement.RETURN_GENERATED_KEYS);
            prepStmt.setLong(1, r.getQuarto().getId());
            Random rand = new Random();
            String codReserva = "RESER00" + ((Integer)rand.nextInt(1000)).toString();
            prepStmt.setString(2, codReserva);

            Long i = null;
            prepStmt.executeUpdate();
            ResultSet rs = prepStmt.getGeneratedKeys();
            rs.next();
            i = rs.getLong(1);
            
            reserva.setId(i);
            reserva.setQuarto(r.getQuarto());
            reserva.setCodReserva(codReserva);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return reserva;
    }
}
