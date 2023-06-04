package Constructores;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Humano 14
 */
public class Reservacion {
    private Fecha Entrada, Salida;
    private int Personas;
    private String Extras;

    public Reservacion() {
    }

    public Reservacion(String Entrada, String Salida, int Personas, String Extras) {
        this.Entrada = new Fecha(Entrada);
        this.Salida = new Fecha(Salida);
        this.Personas = Personas;
        this.Extras = Extras;
    }

    public Fecha getEntrada() {
        return Entrada;
    }

    public void setEntrada(Fecha Entrada) {
        this.Entrada = Entrada;
    }

    public Fecha getSalida() {
        return Salida;
    }

    public void setSalida(Fecha Salida) {
        this.Salida = Salida;
    }

    public int getPersonas() {
        return Personas;
    }

    public void setPersonas(int Personas) {
        this.Personas = Personas;
    }

    public String getExtras() {
        return Extras;
    }

    public void setExtras(String Extras) {
        this.Extras = Extras;
    }
    
    
}
