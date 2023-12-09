package Constructores;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Humano 14
 */
public class Tarjeta {
    private int Numero, fechaVenc, CVV;
    private String Venc;

    public Tarjeta() {
    }

    public Tarjeta(int Numero, int fechaVenc, int CVV, String Venc) {
        this.Numero = Numero;
        this.fechaVenc = fechaVenc;
        this.CVV = CVV;
        this.Venc = Venc;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public int getFechaVenc() {
        return fechaVenc;
    }

    public void setFechaVenc(int fechaVenc) {
        this.fechaVenc = fechaVenc;
    }

    public int getCVV() {
        return CVV;
    }

    public void setCVV(int CVV) {
        this.CVV = CVV;
    }

    public String getVenc() {
        return Venc;
    }

    public void setVenc(String Venc) {
        this.Venc = Venc;
    }
    
}
