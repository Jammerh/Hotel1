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
public class Pago implements Serializable{
    private String Metodo;
    private int Monto, Previo;

    public Pago() {
    }

    public Pago(String Metodo, int Monto, int Previo) {
        this.Metodo = Metodo;
        this.Monto = Monto;
        this.Previo = Previo;
    }

    public String getMetodo() {
        return Metodo;
    }

    public void setMetodo(String Metodo) {
        this.Metodo = Metodo;
    }

    public int getMonto() {
        return Monto;
    }

    public void setMonto(int Monto) {
        this.Monto = Monto;
    }

    public int getPrevio() {
        return Previo;
    }

    public void setPrevio(int Previo) {
        this.Previo = Previo;
    }
    
    
}
