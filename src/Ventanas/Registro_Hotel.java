/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import Exepciones.*;
import java.awt.Color;
import static java.awt.PageAttributes.MediaType.C;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static javax.swing.JOptionPane.showMessageDialog;
import Diseño.*;
import Constructores.*;
import Exepciones.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import static java.awt.PageAttributes.MediaType.A;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import javax.swing.table.DefaultTableModel;;
/**
 *
 * @author amyam
 */
public class Registro_Hotel extends javax.swing.JFrame {

    /**
     * Creates new form Registro_Hotel
     */
    imagenFondo fondo=new imagenFondo();
    public Registro_Hotel() {
        this.setContentPane(fondo);
        initComponents();
        guardarHotel();
        
        //Pone la imagen de fondo
        Icon mIcon = new ImageIcon(new ImageIcon(getClass().getResource("/IMG/Iniciar sesion/Negro.png")).getImage().
            getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), 0));
        lblFondo.setIcon(mIcon);
        this.setExtendedState(this.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdcEstatus = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPais = new javax.swing.JTextField();
        lblPais = new javax.swing.JLabel();
        lblNuevo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtCodigo = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblEstatus = new javax.swing.JLabel();
        jbcEstatus = new javax.swing.JComboBox<>();
        lblNombre = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblCapacidad = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblCuartos = new javax.swing.JLabel();
        txtCapacidad = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtCuartos = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jdcEstatus.setText("jTextField1");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imghotel/icons8-cruz-96.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        txtPais.setText("Pais");

        lblPais.setText("Pais");

        lblNuevo.setText("Nuevo");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 82, 120, 25));

        lblDireccion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(255, 255, 255));
        lblDireccion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDireccion.setText("Direccion");
        jPanel1.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 24, 92, 22));

        txtDireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 26, 120, 25));

        lblTelefono.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefono.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTelefono.setText("Telefono");
        jPanel1.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 184, 146, -1));

        txtTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 187, 120, 25));

        lblEstatus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblEstatus.setForeground(new java.awt.Color(255, 255, 255));
        lblEstatus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEstatus.setText("Estatus");
        jPanel1.add(lblEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        jbcEstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Activo", "Baja" }));
        jPanel1.add(jbcEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, 20));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombre.setText("Nombre del Hotel");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 23, -1, -1));

        lblID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblID.setForeground(new java.awt.Color(255, 255, 255));
        lblID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblID.setText("ID ");
        jPanel1.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 125, 146, -1));

        lblCapacidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCapacidad.setForeground(new java.awt.Color(255, 255, 255));
        lblCapacidad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCapacidad.setText("Capacidad ");
        jPanel1.add(lblCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 184, -1, -1));

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmail.setText("Email");
        jPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 146, 36));

        lblCuartos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCuartos.setForeground(new java.awt.Color(255, 255, 255));
        lblCuartos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCuartos.setText("Cuartos");
        jPanel1.add(lblCuartos, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 137, 92, -1));

        txtCapacidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCapacidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCapacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCapacidadActionPerformed(evt);
            }
        });
        jPanel1.add(txtCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 187, 120, 25));

        txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 120, 25));

        txtCuartos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCuartos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtCuartos, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 140, 120, 25));

        txtID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 128, 120, 25));

        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 26, 120, 25));

        lblCodigo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(255, 255, 255));
        lblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodigo.setText("Codigo P.");
        jPanel1.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 79, 92, -1));

        btnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Nuevo");
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setOpaque(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 299, 100, 41));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imghotel/icons8-atrás-64.jpg"))); // NOI18N
        jButton1.setBorder(null);
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 299, -1, -1));
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 350));

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.setForeground(new java.awt.Color(255, 255, 51));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registro de Hotel");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
        private void guardarHotel() {
         try {
            FileInputStream fb=new FileInputStream("Hotel.OBJ");
            fce=new ObjectInputStream(fb);
                C=(RegistroHotel[]) fce.readObject();
               
                //Acomodar el index
                for (int i = 0; i < C.length; i++) {
                    if (C[i] == null) return;
                    indexC++;
                }
        } catch (IOException | ClassNotFoundException ex){ 
        }

    }
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
         try {   FileOutputStream fb=new FileOutputStream("Articulos OBJ");
           fcs=new ObjectOutputStream(fb);   
        String nombre,Email,Direccion,id,telefono,codigo,estatus = null;
        int cuartos=0,capacidad=0;
        //---------------------------------------------------
        
        
        Direccion = txtDireccion.getText();
        id = txtID.getText();
        telefono = txtTelefono.getText();
        codigo= txtCodigo.getText();
//           cuartos= Integer.parseInt(txtCuartos.getText());
//          capacidad= Integer.parseInt(txtCapacidad.getText());
          //----------------------------------------------------------------
         try {
        cuartos= Integer.parseInt(txtCuartos.getText());
    } catch (NumberFormatException err) {
        showMessageDialog(this, "proporciones Cantidad  de Cuartos");
       // lblCuartos.setForeground(Color.red);
        txtCuartos.requestFocus();
        return;
    } 
          try {
       capacidad= Integer.parseInt(txtCapacidad.getText());
    } catch (NumberFormatException err) {
        showMessageDialog(this, "proporciones Capasidad");
       // lblCuartos.setForeground(Color.red);
        txtCuartos.requestFocus();
        return;
    } 
nombre = txtNombre.getText();
    if (nombre.equals("")) {
        showMessageDialog(this, "Falta Nombre del Hotel");
        //lblTexto.setForeground(Color.red);
        txtNombre.requestFocus();
        return;
    }

        try {
                Email=txtEmail.getText();
                RevisarCorreo(Email);
 
            } catch (emailException ex) {
                showMessageDialog(this, ex.getMessage());
                txtEmail.requestFocus();
                return;
            }
 
     codigo = txtCodigo.getText();
    if (codigo.equals("")) {
        showMessageDialog(this, "Falta Codigo postal ");
        lblCodigo.setForeground(Color.red);
        txtCodigo.requestFocus();
        return;
    }
    Direccion = txtDireccion.getText();
    if (Direccion.equals("")) {
        showMessageDialog(this, "Falta Direccion del Hotel");
        lblDireccion.setForeground(Color.red);
        txtDireccion.requestFocus();
        return;
    }
    id = txtID.getText();
    if (id.equals("")) {
        showMessageDialog(this, "Falta ID del Hotel");
        lblID.setForeground(Color.red);
        txtID.requestFocus();
        return;
    }
    telefono = txtTelefono.getText();
    if (telefono.equals("")) {
        showMessageDialog(this, "Falta Telefono ");
        lblTelefono.setForeground(Color.red);
        txtTelefono.requestFocus();
        return;
    }
    C[indexC++]=new RegistroHotel(nombre,Email,Direccion,id,telefono,codigo,estatus,cuartos,capacidad);
       /* Object O[]=new Object[8];  
        O[0]=nombre; O[1]=Email;O[2]=Direccion;
          O[3]=id; O[4]=telefono;O[5]=codigo;
          O[6]=estatus; O[7]=cuartos;O[8]=capacidad;
        m.addRow(O);*/
        fcs.writeObject(A);fcs.flush();
          } 
         
        catch (IOException ex) { }
         actualizarArchivo();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtCapacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCapacidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCapacidadActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        txtEmail.setText(txtEmail.getText().toLowerCase());
    }//GEN-LAST:event_txtEmailFocusLost

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
            java.util.logging.Logger.getLogger(Registro_Hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_Hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_Hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_Hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro_Hotel().setVisible(true);
            }
        });
    }

     private void actualizarArchivo(){
       
         
          try {  
             FileOutputStream fb=new FileOutputStream("Hotel.OBJ" );
            fcs=new ObjectOutputStream(fb);fcs.writeObject(A);fcs.flush();
          } catch (IOException ex) { }
          
    //Objetos del proyecto
  
    
    //declaracion de FCS para la implemantacion de la persistencia
     }
     RegistroHotel[] C= new RegistroHotel[30];
     
         private ObjectOutputStream fcs;  //Flujo de datos pata escritura 
    private ObjectInputStream fce;  //Flujo de datos para lectura
    //private BufferedReader bce;  //Buffer de lectura
    private DefaultTableModel m;  //modelo
   // RegistroHotel[] C= new RegistroHotel[30];
    private int indexC=0, pos=-1;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> jbcEstatus;
    private javax.swing.JTextField jdcEstatus;
    private javax.swing.JLabel lblCapacidad;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCuartos;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEstatus;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNuevo;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCuartos;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    
          private void RevisarCorreo(String Correo) throws emailException{
            String[] Email = Correo.split("@");

            if (Email.length<2){
                throw new emailException("El formato del Email es incorrecto");
            } 
                if (Email[0].length()<=3){
                        throw new emailException("El Email debe contener mas de 3 caracteres");
                    }

                        if (!Email[1].equals("ittepic.edu.mx") && !Email[1].equals("gmail.com")){
                           throw new emailException("La terminacion del Email deberia ser gmail");
                       }
                            //Revisar si el correo existe
                            for (int i = 0; i < indexC; i++){ 
                                if((Correo.equals(C[i].getEmail()))){ 
                                    throw new emailException("El correo ya esta en uso");
                                }
                            }
                            
        }
        


}
