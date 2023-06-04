/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Constructores;

import java.io.IOException;
import java.io.Serializable;

/**
 *
 * @author amyam
 */
public class RegistroHotel implements Serializable {
   protected String Nombre,Email,Direccion,ID,Telefono,Codigo,Estatus;
       protected  int Cuartos=0,Capacidad=0; 

    public RegistroHotel(String nombre, String Email1, String Direccion1, String id, String telefono, String codigo, String estatus, int cuartos, int capacidad) {
    }

    public RegistroHotel(String Nombre, String Email, String Direccion, String ID, String Telefono, String Codigo, String Estatus) {
        this.Nombre = Nombre;
        this.Email = Email;
        this.Direccion = Direccion;
        this.ID = ID;
        this.Telefono = Telefono;
        this.Codigo = Codigo;
        this.Estatus = Estatus;
    }

    public void guardar(java.io.FileWriter fcs){
        try {
            fcs.write(Nombre+"|"+Email+"|"+Direccion+"|"+ID+"|"+Telefono+"|"+Codigo+"|"+Estatus+"|"+Cuartos+Capacidad+"\n");       fcs.flush();
        } catch (IOException ex) { }
    }
  public void guardar(java.io.DataOutputStream fcs){
        try {
           fcs.writeUTF(Nombre);fcs.writeUTF(Email);fcs.writeUTF(Direccion);fcs.writeUTF(ID);
           fcs.writeUTF(Telefono);fcs.writeUTF(Codigo);fcs.writeUTF(Estatus);fcs.writeFloat(Cuartos);fcs.writeFloat(Capacidad);
           fcs.flush();
           
        } catch (IOException ex) { }
}
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getEstatus() {
        return Estatus;
    }

    public void setEstatus(String Estatus) {
        this.Estatus = Estatus;
    }

    public int getCuartos() {
        return Cuartos;
    }

    public void setCuartos(int Cuartos) {
        this.Cuartos = Cuartos;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

}
