/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diseño;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


    //Se crea una clase la cual nos permite poner el fondo
public class imagenFondo extends JPanel{
    //Atributos
    private Image imagen;
    //Genera un numero aleatorio del 1 al 12
    int ran = (int)(Math.random()*12+1);
    //Metodos
    public void paint(Graphics g){
        //Crea la imagen
        imagen = new ImageIcon(getClass().getResource("/IMG/Iniciar sesion/Edificio" + ran + ".png" )).getImage();
        //La dibuja en el panel principal
        g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
        setOpaque(false);
        super.paint(g);
    }
}