package Constructores;

//Fecha.java                  22/feb/2023

import static javax.swing.JOptionPane.*;
import java.util.*;

public class Fecha{
   private int d,m,a;
   private int D[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
   private String M[]={"","Enero","Febrero","Marzo","Abri","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
      public Fecha(){  //inicializar con la hora del sistema
            Calendar c=new GregorianCalendar();
            d=c.get(Calendar.DATE); 
            m=c.get(Calendar.MONTH)+1;
            a=c.get(Calendar.YEAR);
      }//constructor
      
         public Fecha(int x,int b,int y){
            d=x;   m=b;      a=y; 
      } //constructor
         
         public Fecha(String fecha){
           String F[]=fecha.split("/");
                d=Integer.parseInt(F[0]);
                m=Integer.parseInt(F[1]);
                a=Integer.parseInt(F[2]);
      } //constructor
     
        public String toString(int X) {
            switch(X){
                case 1 -> {
                    return (d<10?"0":"")+d+"/"+M[m]+"/"+a;
           }
                case 2 -> {
                    return d + " de " + M[m] + " del " + a;
           }
                default ->{
                    return (d<10?"0":"")+d+"/"+M[m]+"/"+a;
                }
            }
            
        }
      
      public boolean esBisiesto(){
      return ((a%4==0 && a%100!=0) || (a%400==0));
      }


      
}//class