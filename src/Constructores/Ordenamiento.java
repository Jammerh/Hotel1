package Constructores;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Comparator;
import static javax.swing.JOptionPane.showConfirmDialog;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amyam
 */
public class Ordenamiento {
    public static int [] bubleSort(int A[ ]){
        int n=A.length;
        for (int p = 1; p < n; p++)
            for (int i = 0; i < n-p; i++) 
                if(A[i]>A[i+1]){int aux=A[i]; A[i]=A[i+1];A[i+1]=aux;}
        return A;
    }//bubleSort
    public static void mostrar(int A[]){
        for(int e:A)System.out.print("["+e+"]");
        System.out.println("\n");
    }//mostrar
     /*public static Hoteles [] bubleSort(Hoteles A[ ],String a){
        int n=A.length;
        for (int p = 1; p < n; p++)
            for (int i = 0; i < n-p; i++) {
                if(a.toLowerCase().equals("calif")){
                   if(A[i].getCalif()>A[i+1].getCalif()){Hoteles aux=A[i]; A[i]=A[i+1];A[i+1]=aux;}
                } else if(a.toLowerCase().equals("nombre"))
                   if(A[i].getNombre().compareTo(A[i+1].getNombre())>0){Hoteles aux=A[i]; A[i]=A[i+1];A[i+1]=aux;}
            }//for i
        return A;
    }//bubleSort*/
    public static void mostrar(Hoteles A[]){
        for(Hoteles e:A)System.out.print(e);
    }//mostrar
    
    public static int [] shellSort(int A[ ]){
        int n=A.length; boolean cambios=true;
        for (int salto = n/2;salto>=1 && cambios ; salto=salto>1?salto/2:1){
            cambios=false;
            for (int i = 0; i < n-salto; i++) 
                if(A[i]>A[i+salto]){int aux=A[i]; A[i]=A[i+salto];A[i+salto]=aux; cambios=true;}
        }//for salto
        return A;
    }//bubleSort
   public static <T> void quickSort(T[] arr, Comparator<? super T> comparator) {
        quickSort(arr, 0, arr.length - 1, comparator);
    }

    public static <T> void quickSort(T[] arr, int inicio, int fin, Comparator<? super T> comparator) {
        int i = inicio, f = fin;
        T piv = arr[inicio]; // Tomamos el primer elemento como pivote

        while (i < f) {
            while (comparator.compare(arr[i], piv) < 0) {
                i++;
            }
            while (comparator.compare(arr[f], piv) > 0) {
                f--;
            }
            if (i < f) {
                T aux = arr[i];
                arr[i] = arr[f];
                arr[f] = aux;
            }
        }

        arr[inicio] = arr[f];
        arr[f] = piv;

        if (inicio < f - 1) {
            quickSort(arr, inicio, f - 1, comparator);
        }
        if (f + 1 < fin) {
            quickSort(arr, f + 1, fin, comparator);
        }
    }
    public static void radixSort(int A[ ]){
        int may=A[0]; //mayor
        for (int i = 1; i < A.length; i++)if(A[i]>may)may=A[i];  //encontrar el may
        int d=(may+"").length();  //num de digitos del mayor
        for (int p = 0; p < d; p++) { //d pasadas
            ListaSimpleInt L[]=new ListaSimpleInt[10];
            for (int l = 0; l < 10; l++) L[l]=new  ListaSimpleInt(); //crear las Listas
            for (int i = 0; i < A.length; i++)  L[(A[i]/(int)Math.pow(10, p))%10].Agregar(A[i]);
            int a=0;
            for (int l = 0; l < 10; l++)  //regresar del array de listas al array original
               for (NodoSimpleEntero i = L[l].getIni(); i !=null; i=i.getSig()) A[a++]=i.getInfo();
        }//pasadas
    }//radix 
    public static int [] leerArchivo(String archi){
        String cadN="", num="";
        try {
            java.io.FileReader fe=new java.io.FileReader(archi);
            java.io.BufferedReader be=new java.io.BufferedReader(fe);
            while((num=be.readLine())!=null)cadN=cadN+num+"-";
        } catch (FileNotFoundException ex) { System.out.println(ex.getMessage());   } 
          catch (IOException ex) { System.out.println(ex.getMessage());    }
        String N[ ]=cadN.split("-");
        int A[ ]=new int[N.length];
        for (int i = 0; i < N.length; i++)A[i]=Integer.parseInt(N[i]);
        return A;
    }//leerArchivo    
    public static int [ ] intercalar(int A[ ],int B[ ]){
        int C[ ]=new int[A.length+B.length];
        int a=0,b=0,c=0;
        while(a<A.length && b<B.length)if(A[a]<=B[b])C[c++]=A[a++]; else C[c++]=B[b++];
        while(a<A.length )C[c++]=A[a++]; 
        while(b<B.length)C[c++]=B[b++];
        return C;
    }//intercalar --------------------------------------------------------------------------------------
   public static void mezclaDirecta(int A[]) {
        int n = A.length, tam = 1;
        for (int p = 0; (tam = (int) Math.pow(2, p)) < n; p++) {
            int a = 0;
            while (a < n) {
                int[] A1 = new int[Math.min(tam, n - a)], A2 = new int[Math.min(tam, n - a - A1.length)];
                for (int a1 = 0; a1 < A1.length; a1++) {
                    A1[a1] = A[a++];
                }
                mostrar(A1);
                for (int a2 = 0; a2 <  A2.length && a < n; a2++) {
                    A2[a2] = A[a++];
                }
                mostrar(A2);
                int B[] = intercalar(A1, A2);
                mostrar(B);
                int b = 0;
                for (int ba = a - B.length; ba < a; ba++) {
                    A[ba] = B[b++];
                }
                mostrar(A);
                //showConfirmDialog(null, "continuar", "¿Seguro?", 0, 1);
            }//while
        }//pasadas
    }//mezcla Directa
    public static ListaSimpleInt intercalar(ListaSimpleInt A,ListaSimpleInt B){
        ListaSimpleInt C=new ListaSimpleInt ();
        NodoSimpleEntero  a=A.getIni(),b=B.getIni();
        while(a!=null && b!=null)
            if(a.getInfo()<=b.getInfo()){ C.Agregar(a.getInfo()); a=a.getSig();}
            else {C.Agregar(b.getInfo()); b=b.getSig();}
        while(a!=null ){C.Agregar(a.getInfo()); a=a.getSig();}
        while(b!=null ){C.Agregar(b.getInfo()); b=b.getSig();}
        return C;
    }//intercalar listas --------------------------------------------------------------------------------------
    
      public static void mezclaNatural(int A[]) {
        int n = A.length, c = 0;
        boolean continuar = true;
        while (continuar) {
            int a = 0;
            while (a < n) {
                c = a;
                ListaSimpleInt A1 = new ListaSimpleInt();
                ListaSimpleInt A2 = new ListaSimpleInt();
                try {
                    while(a<n){
                    if (a < n) {
                        A1.Agregar(A[a++]);
                    }
                    while (A[a] >= A1.getFin().getInfo()) {
                        A1.Agregar(A[a++]);
                    }
                    if (a < n) {
                        A2.Agregar(A[a++]);
                    }
                    while (A[a] >= A2.getFin().getInfo()) {
                        A2.Agregar(A[a++]);
                    }
                    }
                } catch (ArrayIndexOutOfBoundsException err) {
                }
                if (A2.getIni() == null) {
                    continuar = false;
                }
                A1.mostrar();
                System.out.println("");
                A2.mostrar();
                
                System.out.println("\n");
                ListaSimpleInt B = intercalar(A1, A2);
                //B.mostrar();
                //showConfirmDialog(null,"continuar?");
                for (NodoSimpleEntero i = B.getIni(); i != null; i = i.getSig()) {
                    A[c++] = i.getInfo();

                }
                mostrar(A);
            }
        }
    }//Mezcla Natural---------------------------------------------------------------------------
    public static void main(String[] args) {
         int A[ ]={1,5,19,29,42,2,50,3,67,1};
         mezclaNatural(A);
    }//main
}
//DIJKSTXA
//EXPOSICION EJEMPLO Y CODIGO PARA LA SIGUIEMTE SEMANA 
//busqueda secuencial