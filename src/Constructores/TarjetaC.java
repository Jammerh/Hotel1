package Constructores;

import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Humano 14
 */
public class TarjetaC implements Serializable{
    private String Numero, CVV;
    private String fechaVenc;

    public TarjetaC() {
    }

    public TarjetaC(String Numero, String CVV, String fechaVenc) {
        this.Numero = Numero;
        this.CVV = CVV;
        this.fechaVenc = fechaVenc;
    }



    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getCVV() {
        return CVV;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV;
    }

    public String getFechaVenc() {
        return fechaVenc;
    }

    public void setFechaVenc(String fechaVenc) {
        this.fechaVenc = fechaVenc;
    }

    
}