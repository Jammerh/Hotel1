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
public class Hoteles implements Serializable {
  private String Ubicacion, Nombre;
  private int Puntuacion, Categoria;

    public Hoteles() {
    }

    public Hoteles(String Ubicacion, String Nombre, int Puntuacion, int Categoria) {
        this.Ubicacion = Ubicacion;
        this.Nombre = Nombre;
        this.Puntuacion = Puntuacion;
        this.Categoria = Categoria;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPuntuacion() {
        return Puntuacion;
    }

    public void setPuntuacion(int Puntuacion) {
        this.Puntuacion = Puntuacion;
    }

    public int getCategoria() {
        return Categoria;
    }

    public void setCategoria(int Categoria) {
        this.Categoria = Categoria;
    }
  
  
  
}
