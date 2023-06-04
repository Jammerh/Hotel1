package Constructores;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Humano 14
 */
public class UsuarioHotel extends Usuario {
    private int idHotel;
    private boolean Estatus;

    public UsuarioHotel() {
    }

    public UsuarioHotel(int idHotel, String Email, char[] Contraseña, boolean Estatus) {
        super(Email, Contraseña);
        this.idHotel = idHotel;
        this.Estatus = Estatus;
    }

    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public boolean isEstatus() {
        return Estatus;
    }

    public void setEstatus(boolean Estatus) {
        this.Estatus = Estatus;
    }

    
    
    
}
