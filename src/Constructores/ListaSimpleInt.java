package Constructores;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Humano 14
 */
public class ListaSimpleInt {
    private NodoSimpleEntero ini, fin;

    public ListaSimpleInt() { ini=fin=null; }
    
    public static void main(String args[]){
        ListaSimpleInt L=new ListaSimpleInt();
        L.Agregar(100); L.Agregar(90); L.Agregar(80); L.Agregar(50);
        L.ShowList();
        L.borrar(50);
        System.out.print("");
        L.ShowList();
        //resultado = (condicion)?valor1:valor2;
    }
    
    public void Agregar(int d){
        NodoSimpleEntero Nu=new NodoSimpleEntero(d);
        if(ini==null) ini=fin=Nu;
            else{
                fin.setSig(Nu);
                fin=Nu;
            }
    }//Agregar
    public void mostrar(){
        for (NodoSimpleEntero i = ini; i !=null; i=i.getSig())  System.out.print(i);
    }//mostrar
    public NodoSimpleEntero buscar(int d){
        for (NodoSimpleEntero i = ini; i != null; i=i.getSig()) {
            if(i.getInfo()==d) return i;
        }
        return null;
    }
        public NodoSimpleEntero buscarAnt(int d){
        for (NodoSimpleEntero i = ini; i != null; i=i.getSig()) {
            if(i.getSig().getInfo()==d) return i;
        }
        return null;
    }
        
        public boolean borrar(int e){
            if(buscar(e)==null) return false;
            if(e==ini.getInfo()){
                ini=ini.getSig();
            }
            else{
                NodoSimpleEntero b=buscarAnt(e);
                b.setSig(b.getSig().getSig());   
            }
            return true;
        }
        
        public boolean edit(int value, int Edit){
            NodoSimpleEntero b=buscarAnt(value);
            if(b==null)return false;
            b.setInfo(Edit); return true;
        }
    
    public void ShowList(){
        for (NodoSimpleEntero i = ini; i != null; i=i.getSig()) {
            System.out.print(i);
        }
    }//Mostrar los elementos de la lista

    public NodoSimpleEntero getIni() {
        return ini;
    }

    public void setIni(NodoSimpleEntero ini) {
        this.ini = ini;
    }

    public NodoSimpleEntero getFin() {
        return fin;
    }

    public void setFin(NodoSimpleEntero fin) {
        this.fin = fin;
    }
    
    
    
}//Class
