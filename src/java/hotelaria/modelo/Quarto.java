/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelaria.modelo;

/**
 *
 * @author caioboratto
 */
public class Quarto {

    long id;
    QuartoTipo quartoTipo;
    Hotel hotel;

    public Quarto() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public QuartoTipo getQuartoTipo() {
        return quartoTipo;
    }

    public void setQuartoTipo(QuartoTipo quartoTipo) {
        this.quartoTipo = quartoTipo;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
