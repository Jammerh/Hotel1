/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diseño;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Humano 14
 */
public class FondoMain extends JPanel{
   //Atributos
    private Image imagen;

    public void paint(Graphics g){
        //Crea la imagen
        imagen = new ImageIcon(getClass().getResource("/IMG/Main/Fondo.png" )).getImage();
        //La dibuja en el panel principal
        //1
            g.drawImage(imagen,0,0,getWidth()/2,getHeight()/2,this);
        //2
            g.drawImage(imagen,getWidth()/2,0,getWidth()/2,getHeight()/2,this);
            //3
            g.drawImage(imagen,0,getHeight()/2,getWidth()/2,getHeight()/2,this);
        //4
            g.drawImage(imagen,getWidth()/2,getHeight()/2,getWidth()/2,getHeight()/2,this);
       
        setOpaque(false);
        super.paint(g);
    }  
}
