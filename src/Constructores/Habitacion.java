package Constructores;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Humano 14
 */
public class Habitacion {
    private int Num, Precio;
    private String Tipo;

    public Habitacion() {
    }

    public Habitacion(int Num, int Precio, String Tipo) {
        this.Num = Num;
        this.Precio = Precio;
        this.Tipo = Tipo;
    }

    public int getNum() {
        return Num;
    }

    public void setNum(int Num) {
        this.Num = Num;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    
}
