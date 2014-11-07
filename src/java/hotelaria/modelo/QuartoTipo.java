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
public class QuartoTipo {

    Long id;
    String nomeQuartoTipo;
    int numCapacidadeMaxima;

    public QuartoTipo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeQuartoTipo() {
        return nomeQuartoTipo;
    }

    public void setNomeQuartoTipo(String nomeQuartoTipo) {
        this.nomeQuartoTipo = nomeQuartoTipo;
    }

    public int getNumCapacidadeMaxima() {
        return numCapacidadeMaxima;
    }

    public void setNumCapacidadeMaxima(int numCapacidadeMaxima) {
        this.numCapacidadeMaxima = numCapacidadeMaxima;
    }

}
