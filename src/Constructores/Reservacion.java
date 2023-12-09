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
public class Reservacion implements Serializable {
    private String Entrada, Salida;
    private int Personas, Monto;
    private String Tipo;

    public Reservacion() {
    }

    public Reservacion(String Entrada, String Salida, int Personas, String Tipo, int Monto) {
        this.Entrada = Entrada;
        this.Salida = Salida;
        this.Personas = Personas;
        this.Tipo = Tipo;
        this.Monto = Monto;
    }

    public int getMonto() {
        return Monto;
    }

    public void setMonto(int Monto) {
        this.Monto = Monto;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getEntrada() {
        return Entrada;
    }

    public void setEntrada(String Entrada) {
        this.Entrada = Entrada;
    }

    public String getSalida() {
        return Salida;
    }

    public void setSalida(String Salida) {
        this.Salida = Salida;
    }

    public int getPersonas() {
        return Personas;
    }

    public void setPersonas(int Personas) {
        this.Personas = Personas;
    }

    public String getExtras() {
        return Tipo;
    }

    public void setExtras(String Tipo) {
        this.Tipo = Tipo;
    }

    
}