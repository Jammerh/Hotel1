/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import Constructores.*;
import static Constructores.Ordenamiento.quickSort;
import Diseño.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Comparator;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Humano 14
 */
public class Mainpage extends javax.swing.JFrame {

    /**
     * Creates new form Mainpage
     */
    
    //Se declaran para poner las imagenes a los jPanels
FondoMain fondo=new FondoMain();
    public Mainpage() {
        this.setContentPane(fondo);
        initComponents();
        leerCliente();
        leerHotel();
        AjustarHoteles();
        Ajusteinicial();
    }
    
     private void leerCliente() {
         try {
            FileInputStream fb=new FileInputStream("ClienteA.OBJ");
            fceA=new ObjectInputStream(fb);
                CA=(UsuarioCliente) fceA.readObject();
        } catch (IOException | ClassNotFoundException ex){ 
        }
     }
         
        private void leerHotel() {
    try {
        FileInputStream fb = new FileInputStream("HOTEL.OBJ");
        fce = new ObjectInputStream(fb);
        H = (Hoteles[]) fce.readObject();

        // Acomodar el índice
        for (int i = 0; i < H.length; i++) {
            if (H[i] == null) return;
            indexC++;
            System.out.println(indexC + " " + H[i].getNombre());
        }
    } catch (IOException | ClassNotFoundException ex) {
        ex.printStackTrace();
    }
}
    
          private void AjustarHoteles(){
              try{
              Hoteles A=H[pos]; 
              lblName.setText(A.getNombre());
              lblUbicacion1.setText(A.getUbicacion());
              lblPrecio.setText(A.getPrecio());
              int ran = (int)(Math.random()*12+1);
              lblImagen1.setIcon(crearIcono("/IMG/Iniciar sesion/Edificio" + ran + ".png" ,lblImagen1.getWidth(), lblImagen1.getHeight()));
              }catch(NullPointerException ex){
                    lblName.setText("");
                    lblUbicacion1.setText("");
                   lblPrecio.setText("");
              }
              
                            try{
              Hoteles B=H[pos+1];
              lblNombre2.setText(B.getNombre());
              lblUbicacion2.setText(B.getUbicacion());
              lblPrecio2.setText(B.getPrecio());
            int ran2 = (int)(Math.random()*12+1);
            lblImagen2.setIcon(crearIcono("/IMG/Iniciar sesion/Edificio" + ran2 + ".png" ,lblImagen1.getWidth(), lblImagen1.getHeight()));
              }catch(NullPointerException ex){

                    lblNombre2.setText("");
                    lblUbicacion2.setText(""); 
                   lblPrecio2.setText("");
              }
               System.out.println(pos);       
          }
          
public void Ajusteinicial(){
            lblLogo.setIcon(crearIcono("/IMG/Logo3.png",lblLogo.getWidth(), lblLogo.getHeight()));
            lblUser.setText("Cliente: " +CA.getEmail());
                //Genera un numero aleatorio del 1 al 12

            if(CA.getEmail()==null){
                btnCerrar.setVisible(false);
                btnHistorial.setVisible(false);
                lblName.setEnabled(false);
                lblNombre2.setEnabled(false);
            }else{
               Cerrar();
            }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtBajar = new javax.swing.JButton();
        btnHotelnew = new javax.swing.JButton();
        txtSubir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblImagen1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblName = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblStar1 = new javax.swing.JLabel();
        lblStar2 = new javax.swing.JLabel();
        lblStar3 = new javax.swing.JLabel();
        lblStar4 = new javax.swing.JLabel();
        lblStar5 = new javax.swing.JLabel();
        lblUbicacion1 = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblImagen2 = new javax.swing.JLabel();
        lblNombre2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblStar6 = new javax.swing.JLabel();
        lblStar7 = new javax.swing.JLabel();
        lblStar8 = new javax.swing.JLabel();
        lblStar9 = new javax.swing.JLabel();
        lblStar10 = new javax.swing.JLabel();
        lblUbicacion2 = new javax.swing.JLabel();
        lblPrecio2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        lblUser = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        btnHistorial = new javax.swing.JButton();
        jbcPrecios = new javax.swing.JComboBox<>();
        jbcPrecios1 = new javax.swing.JComboBox<>();
        jcbOrdenar = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBajar.setBackground(new java.awt.Color(204, 204, 255));
        txtBajar.setFont(new java.awt.Font("Segoe UI", 1, 100)); // NOI18N
        txtBajar.setText("↓");
        txtBajar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBajarActionPerformed(evt);
            }
        });
        jPanel2.add(txtBajar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 130, 181));

        btnHotelnew.setBackground(new java.awt.Color(0, 0, 0));
        btnHotelnew.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnHotelnew.setForeground(new java.awt.Color(255, 255, 255));
        btnHotelnew.setText("Registrar Hotel");
        btnHotelnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHotelnewActionPerformed(evt);
            }
        });
        jPanel2.add(btnHotelnew, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 130, 50));

        txtSubir.setBackground(new java.awt.Color(204, 204, 255));
        txtSubir.setFont(new java.awt.Font("Segoe UI", 1, 100)); // NOI18N
        txtSubir.setText("↑");
        txtSubir.setEnabled(false);
        txtSubir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubirActionPerformed(evt);
            }
        });
        jPanel2.add(txtSubir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 199));

        jPanel9.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 140, 430));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imghotel/Imagen2.jpg"))); // NOI18N
        jPanel3.add(lblImagen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 24, -1, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 233, 704, 10));

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblName.setText("Antojistos Hotel ");
        lblName.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblName.setEnabled(false);
        lblName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNameMouseClicked(evt);
            }
        });
        jPanel3.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 13, -1, -1));

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        lblStar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imghotel/icons8-estrella-32.png"))); // NOI18N
        jPanel4.add(lblStar1);

        lblStar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imghotel/icons8-estrella-32.png"))); // NOI18N
        jPanel4.add(lblStar2);

        lblStar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imghotel/icons8-estrella-32.png"))); // NOI18N
        jPanel4.add(lblStar3);

        lblStar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imghotel/icons8-estrella-32.png"))); // NOI18N
        jPanel4.add(lblStar4);
        jPanel4.add(lblStar5);

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 13, 200, -1));

        lblUbicacion1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUbicacion1.setForeground(new java.awt.Color(51, 102, 255));
        lblUbicacion1.setText("Cancun Quintana Roo zona Hotelera");
        jPanel3.add(lblUbicacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 52, 389, -1));

        lblPrecio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(0, 204, 51));
        lblPrecio.setText("Desde $2,500 a $10,000  ");
        jPanel3.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 124, 200, 39));

        jLabel5.setText("Por noche");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 138, -1, -1));

        jPanel7.setOpaque(false);
        jPanel7.setLayout(new java.awt.GridLayout(2, 3));

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imghotel/Imagen6.jpg"))); // NOI18N
        jPanel7.add(jLabel21);

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imghotel/Imagen8.jpg"))); // NOI18N
        jPanel7.add(jLabel22);

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imghotel/Imagen7.jpg"))); // NOI18N
        jPanel7.add(jLabel17);

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imghotel/Imagen10.jpg"))); // NOI18N
        jPanel7.add(jLabel23);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imghotel/Imagen11.jpg"))); // NOI18N
        jPanel7.add(jLabel15);

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imghotel/Imagen9.jpg"))); // NOI18N
        jPanel7.add(jLabel18);

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 82, 116, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imghotel/Imagen2.jpg"))); // NOI18N
        jPanel5.add(lblImagen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        lblNombre2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblNombre2.setText("Marina Hotel ");
        lblNombre2.setEnabled(false);
        lblNombre2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNombre2MouseClicked(evt);
            }
        });
        jPanel5.add(lblNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 13, -1, -1));

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        lblStar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imghotel/icons8-estrella-32.png"))); // NOI18N
        jPanel6.add(lblStar6);

        lblStar7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imghotel/icons8-estrella-32.png"))); // NOI18N
        jPanel6.add(lblStar7);

        lblStar8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imghotel/icons8-estrella-32.png"))); // NOI18N
        jPanel6.add(lblStar8);

        lblStar9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imghotel/icons8-estrella-32.png"))); // NOI18N
        jPanel6.add(lblStar9);
        jPanel6.add(lblStar10);

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 13, 200, -1));

        lblUbicacion2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUbicacion2.setForeground(new java.awt.Color(51, 102, 255));
        lblUbicacion2.setText("Tepic, Nay zona Hotelera");
        jPanel5.add(lblUbicacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 52, 389, -1));

        lblPrecio2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPrecio2.setForeground(new java.awt.Color(0, 204, 51));
        lblPrecio2.setText("Desde $2,500 a $10,000  ");
        jPanel5.add(lblPrecio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 124, 200, 39));

        jLabel10.setText("Por noche");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, -1, -1));

        jPanel8.setOpaque(false);
        jPanel8.setLayout(new java.awt.GridLayout(2, 3));

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imghotel/Imagen6.jpg"))); // NOI18N
        jPanel8.add(jLabel24);

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imghotel/Imagen8.jpg"))); // NOI18N
        jPanel8.add(jLabel25);

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imghotel/Imagen7.jpg"))); // NOI18N
        jPanel8.add(jLabel19);

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imghotel/Imagen10.jpg"))); // NOI18N
        jPanel8.add(jLabel26);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imghotel/Imagen11.jpg"))); // NOI18N
        jPanel8.add(jLabel16);

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imghotel/Imagen9.jpg"))); // NOI18N
        jPanel8.add(jLabel20);

        jPanel5.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 82, 116, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 254, -1, 175));

        jPanel9.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(44, 56, 96));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 86, 70));

        btnCerrar.setBackground(new java.awt.Color(0, 0, 0));
        btnCerrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setText("Cerrar sesion");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 110, 30));

        btnCrear.setBackground(new java.awt.Color(0, 0, 0));
        btnCrear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(255, 255, 255));
        btnCrear.setText("Crear cuenta");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 113, 30));

        lblUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setText("Usuario: XXXX");
        jPanel1.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 13, 330, -1));

        btnIniciar.setBackground(new java.awt.Color(0, 0, 0));
        btnIniciar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setText("Iniciar sesion");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, -1, 30));

        btnHistorial.setBackground(new java.awt.Color(0, 0, 0));
        btnHistorial.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnHistorial.setForeground(new java.awt.Color(255, 255, 255));
        btnHistorial.setText("HISTORIAL");
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });
        jPanel1.add(btnHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 110, 30));

        jbcPrecios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Precios", "$2500", "$5000", "$10000" }));
        jPanel1.add(jbcPrecios, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, -1, 20));

        jbcPrecios1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Precios", "$2500", "$5000", "$10000" }));
        jPanel1.add(jbcPrecios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 100, 40));

        jcbOrdenar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ordenar ", "Nombre ", "Mayor Precio", "Menor Precio", " " }));
        jcbOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbOrdenarActionPerformed(evt);
            }
        });
        jPanel1.add(jcbOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNameMouseClicked
        irReserva();
        HA= H[pos];
    }//GEN-LAST:event_lblNameMouseClicked

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        this.setVisible(false);
        Registrar f1=new Registrar();
        f1.setVisible(true);
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnHotelnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHotelnewActionPerformed
        Cerrar();
        this.setVisible(false);
        Registro_Hotel f1=new Registro_Hotel();
        f1.setVisible(true);
    }//GEN-LAST:event_btnHotelnewActionPerformed

    private void Cerrar(){
        btnIniciar.setVisible(false);
        btnCrear.setVisible(false);
        lblName.setEnabled(true);
        lblNombre2.setEnabled(true);
    }
    
    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        btnIniciar.setVisible(true);
        btnCrear.setVisible(true);
        btnCerrar.setVisible(false);
        btnHistorial.setVisible(false);
        CA=new UsuarioCliente();
        ClienteActual();
        lblUser.setText("Usuario: " +CA.getEmail());
    }//GEN-LAST:event_btnCerrarActionPerformed

        private void ClienteActual(){
        //Reemplazar objecto del archivo
           try {
            FileOutputStream fb=new FileOutputStream("ClienteA.OBJ");
            fcsA=new ObjectOutputStream(fb); fcsA.writeObject(CA); fcsA.flush();
           } catch (IOException ex) {
               
           }   
    }
        
            private void HotelActual(){
        //Reemplazar objecto del archivo
           try {
            FileOutputStream fb=new FileOutputStream("HOTELA.OBJ");
            fcsH=new ObjectOutputStream(fb); fcsH.writeObject(H); fcsH.flush();
           } catch (IOException ex) {
               
           }   
    }
    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        Cerrar();
        this.setVisible(false);
        Iniciar_Sesion f1=new Iniciar_Sesion();
        f1.setVisible(true);
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void lblNombre2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNombre2MouseClicked
        HA=H[pos+1];
        irReserva();
    }//GEN-LAST:event_lblNombre2MouseClicked

    private void txtSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubirActionPerformed
        txtBajar.setEnabled(true);
        pos=pos-1;
        if(pos<=0){ txtSubir.setEnabled(false);}
        AjustarHoteles();
    }//GEN-LAST:event_txtSubirActionPerformed

    private void txtBajarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBajarActionPerformed
        txtSubir.setEnabled(true);
        pos=pos+1;
        if(pos>=indexC-2){ txtBajar.setEnabled(false);}
        AjustarHoteles();
    }//GEN-LAST:event_txtBajarActionPerformed

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        this.setVisible(false);
        HistorialCliente f1=new HistorialCliente();
        f1.setVisible(true);
        f1.leerCA(CA);
    }//GEN-LAST:event_btnHistorialActionPerformed

    private void jcbOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbOrdenarActionPerformed
        Comparator<Hoteles> comparator = null;
    switch (jcbOrdenar.getSelectedIndex()) {
        case 1:
    quickSortHoteles(0, H.length - 1, "Nombre ");
            AjustarHoteles();
            break;
        case 2:
            quickSortHoteles(0, H.length - 1, "precio Mayor ");
            AjustarHoteles();
            break ;
        case 3:
             quickSortHoteles(0, H.length - 1, "precio Menor  ");
            AjustarHoteles();
            break;
        
    }

    AjustarHoteles();

 

    }//GEN-LAST:event_jcbOrdenarActionPerformed

private void quickSortHoteles(int inicio, int fin, String criterio) {
    if (inicio < fin) {
        int indiceParticion = particion(H, inicio, fin, criterio);
        if (indiceParticion != -1) {
            quickSortHoteles(inicio, indiceParticion - 1, criterio);
            quickSortHoteles(indiceParticion + 1, fin, criterio);
        }
    }
}

private int particion(Hoteles[] arreglo, int inicio, int fin, String criterio) {
    Hoteles pivote = arreglo[fin];
    int i = inicio - 1;

    // Buscar un pivote no nulo más adelante en el arreglo
    if (pivote == null) {
        for (int k = fin; k >= inicio; k--) {
            if (arreglo[k] != null) {
                pivote = arreglo[k];
                arreglo[k] = arreglo[fin];
                arreglo[fin] = pivote;
                break;
            }
        }
        // Si aún así el pivote es null, devolver -1 para indicar un error
        if (pivote == null) {
            return -1;
        }
    }

    for (int j = inicio; j < fin; j++) {
        if (arreglo[j] != null) {
            boolean condicion = false;
            // Asegúrate de que la comparación de cadenas no tenga espacios adicionales y sea en minúsculas
            if ("Nombre".equalsIgnoreCase(criterio.trim()) && arreglo[j].getNombre().compareTo(pivote.getNombre()) < 0) {
                condicion = true;
            } else if ("precio Mayor".equalsIgnoreCase(criterio.trim()) && arreglo[j].getPrecio().compareTo(pivote.getPrecio()) < 0) {
                condicion = true;
            }else if ("precio Menor".equalsIgnoreCase(criterio.trim()) && arreglo[j].getPrecio().compareTo(pivote.getPrecio()) > 0) {
                condicion = true;
            }

            if (condicion) {
                i++;
                Hoteles temp = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temp;
            }
        }
    }

    // Intercambia el elemento en i+1 con el pivote
    Hoteles temp = arreglo[i + 1];
    arreglo[i + 1] = arreglo[fin];
    arreglo[fin] = temp;

    return i + 1;
}

    private void irReserva(){
        if(lblNombre2.isEnabled()){
        this.dispose();
        Reserva f1=new Reserva();
        f1.leerCA(CA);
        f1.leerHA(HA);
        f1.setVisible(true);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainpage().setVisible(true);
            }
        });
    }

        public Icon crearIcono(String ruta, int x, int y){
        Icon mIcon = new ImageIcon(new ImageIcon(getClass().getResource(ruta)).getImage().
        getScaledInstance(x, y, 0)); 
        return mIcon;
    }
   
    //Para guardar al cliente actual
    private ObjectOutputStream fcsA;
    private ObjectInputStream fceA;
    UsuarioCliente CA= new UsuarioCliente();
    
    //Para guardar al cliente actual
    private ObjectOutputStream fcsH;
    private ObjectInputStream fceH;
    Hoteles HA= new Hoteles();
    
         //datos para hotel
     Hoteles[] H= new Hoteles[50];
     
    private ObjectOutputStream fcs;  //Flujo de datos pata escritura 
    private ObjectInputStream fce;  //Flujo de datos para lectura
    //private BufferedReader bce;  //Buffer de lectura
    private int indexC=0, 
    
    //Para ubicar en que posicion hacer los hoteles
    pos=0;
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnHotelnew;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> jbcPrecios;
    private javax.swing.JComboBox<String> jbcPrecios1;
    private javax.swing.JComboBox<String> jcbOrdenar;
    private javax.swing.JLabel lblImagen1;
    private javax.swing.JLabel lblImagen2;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblPrecio2;
    private javax.swing.JLabel lblStar1;
    private javax.swing.JLabel lblStar10;
    private javax.swing.JLabel lblStar2;
    private javax.swing.JLabel lblStar3;
    private javax.swing.JLabel lblStar4;
    private javax.swing.JLabel lblStar5;
    private javax.swing.JLabel lblStar6;
    private javax.swing.JLabel lblStar7;
    private javax.swing.JLabel lblStar8;
    private javax.swing.JLabel lblStar9;
    private javax.swing.JLabel lblUbicacion1;
    private javax.swing.JLabel lblUbicacion2;
    private javax.swing.JLabel lblUser;
    private javax.swing.JButton txtBajar;
    private javax.swing.JButton txtSubir;
    // End of variables declaration//GEN-END:variables
}
