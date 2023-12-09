package Constructores;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Humano 14
 */
public class NodoSimpleEntero {
    private int info;
    private NodoSimpleEntero sig;
    public NodoSimpleEntero(int C){
        info=C; sig=null;
    }

    public int getInfo() {
        return info;
    }

    public NodoSimpleEntero getSig() {
        return sig;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public void setSig(NodoSimpleEntero sig) {
        this.sig = sig;
    }
    
        @Override
    public String toString() {
        return "{"+info+"} -> ";
    }

    
}
