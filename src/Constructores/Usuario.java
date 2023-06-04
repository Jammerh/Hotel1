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
public class Usuario implements Serializable {
    private String Email;
    private char[] Contraseña;

    public Usuario() {
    }

    public Usuario(String Email, char[] Contraseña) {
        this.Email = Email;
        this.Contraseña = Contraseña;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public char[] getContraseña() {
        return Contraseña;
    }

    public void setContraseña(char[] Contraseña) {
        this.Contraseña = Contraseña;
    }



    
}