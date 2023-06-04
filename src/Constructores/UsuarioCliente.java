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
public class UsuarioCliente extends Usuario implements Serializable {
    private int idCliente;

    public UsuarioCliente() {
    }

    public UsuarioCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public UsuarioCliente(int idCliente, String Email, char[] Contraseña) {
        super(Email, Contraseña);
        this.idCliente = idCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    
    

    
    
   
}
