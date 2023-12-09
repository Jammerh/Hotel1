package Ventanas;


import Constructores.*;
import Diseño.*;
import Exepciones.*;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import static javax.swing.JOptionPane.showMessageDialog;






public class Iniciar_Sesion extends javax.swing.JFrame {

    //Se declaran para poner las imagenes a los jPanels
imagenFondo fondo=new imagenFondo();
    public Iniciar_Sesion() {
            this.setContentPane(fondo);
        initComponents();
        ajustesIniciales();
        leerClientes();
        
        //Pone la imagen de fondo
        Icon mIcon = new ImageIcon(new ImageIcon(getClass().getResource("/IMG/Iniciar sesion/Negro.png")).getImage().
            getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), 0));
        lblFondo.setIcon(mIcon);
        //Maximiza la ventana
        this.setExtendedState(this.MAXIMIZED_BOTH);

    }
    public final void ajustesIniciales(){
        lblRegresar.setVisible(false);
        lblSuperior.setText("Tu direccion de email");
        btnAceptar.setText("Siguiente");
        txtVer.setVisible(false);
        txtContraseña.setVisible(false);
        txtEmail.setVisible(true);
        Seccion=true;
    }
    
        private void leerClientes() {
         try {
            FileInputStream fb=new FileInputStream("USUARIOS.OBJ");
            fce=new ObjectInputStream(fb);
                C=(UsuarioCliente[]) fce.readObject();
               
                //Acomodar el index
                for (int i = 0; i < C.length; i++) {
                    if (C[i] == null) return;
                    indexC++;
                }
        } catch (IOException | ClassNotFoundException ex){ 
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

        jpBase = new javax.swing.JPanel();
        lblIniciar = new javax.swing.JLabel();
        lblRegresar = new javax.swing.JLabel();
        lblSuperior = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        txtContraseña = new javax.swing.JPasswordField();
        txtVer = new javax.swing.JButton();
        txtError = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jpBase.setBackground(new java.awt.Color(255, 255, 255));
        jpBase.setMinimumSize(new java.awt.Dimension(500, 300));
        jpBase.setName(""); // NOI18N
        jpBase.setOpaque(false);
        jpBase.setPreferredSize(new java.awt.Dimension(500, 300));
        jpBase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIniciar.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        lblIniciar.setForeground(new java.awt.Color(255, 255, 255));
        lblIniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIniciar.setText("Iniciar sesion");
        jpBase.add(lblIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 460, -1));

        lblRegresar.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblRegresar.setForeground(new java.awt.Color(0, 153, 255));
        lblRegresar.setText("<  sasilvasi@ittepic.edu.mx");
        lblRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRegresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRegresarMouseExited(evt);
            }
        });
        jpBase.add(lblRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 337, -1));

        lblSuperior.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblSuperior.setForeground(new java.awt.Color(255, 255, 255));
        lblSuperior.setText("Tu direccion de email");
        jpBase.add(lblSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 200, -1));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
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
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        jpBase.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 440, -1));

        btnAceptar.setBackground(new java.awt.Color(255, 255, 102));
        btnAceptar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("SIGUIENTE");
        btnAceptar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnAceptar.setContentAreaFilled(false);
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jpBase.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 150, -1));

        txtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyPressed(evt);
            }
        });
        jpBase.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 440, 40));

        txtVer.setBorderPainted(false);
        txtVer.setContentAreaFilled(false);
        txtVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVerActionPerformed(evt);
            }
        });
        jpBase.add(txtVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 60, 40));

        txtError.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtError.setForeground(new java.awt.Color(255, 51, 51));
        jpBase.add(txtError, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 420, -1));

        lblFondo.setForeground(new java.awt.Color(255, 255, 255));
        lblFondo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblFondo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblFondoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jpBase.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 500, 310));

        jPanel1.setBackground(new java.awt.Color(44, 56, 96));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(202, Short.MAX_VALUE)
                .addComponent(jpBase, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(202, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jpBase, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseClicked
        ajustesIniciales();
    }//GEN-LAST:event_lblRegresarMouseClicked

    private void lblRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseEntered
        lblRegresar.setForeground(new Color(0, 71, 178));
    }//GEN-LAST:event_lblRegresarMouseEntered

    private void lblRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseExited
        lblRegresar.setForeground(new Color(0, 153, 255));
    }//GEN-LAST:event_lblRegresarMouseExited

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    
    private  String Email="";
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

        if(Seccion){

            try {
                Email=txtEmail.getText();
                lblRegresar.setText("<  "+Email);
                RevisarCorreo(Email);
                Ajustes();
                Seccion=false;
            } catch (emailException ex) {
                txtError.setText(ex.getMessage());
                txtEmail.requestFocus();
                return;
            }
        }else{
                try{
                 String Pass =new String (txtContraseña.getPassword());
                    revisarContra(Pass);
                    CA=new UsuarioCliente(indexC, Email,Pass);
                    showMessageDialog(this, "exito");
                    ClienteActual(); 
                }catch(contraseñaException ex){
                    txtError.setText(ex.getMessage());
                    txtContraseña.requestFocus();
                }
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

   private void ClienteActual(){
        //Reemplazar objecto del archivo
           try {
            FileOutputStream fb=new FileOutputStream("ClienteA.OBJ");
            fcsA=new ObjectOutputStream(fb); fcsA.writeObject(CA); fcsA.flush();
                this.setVisible(false);
                Mainpage f1=new Mainpage();
                f1.setVisible(true);
           } catch (IOException ex) {
               
           }   
    }
     //validar

       
    private void Ajustes(){
        lblRegresar.setVisible(true);
        lblSuperior.setText("Contraseña");
        btnAceptar.setText("Aceptar");
        txtContraseña.setVisible(true);
        txtEmail.setVisible(false);
        txtVer.setIcon(crearIcono("/IMG/Iniciar sesion/don´tseePassword.png",txtVer.getWidth(), txtVer.getHeight()));
        Ver=true;
        txtVer.setVisible(Ver);
    }
    
    private void txtVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVerActionPerformed
                //Intercalar entre los iconos de ver contraseña

        if(Ver){
            txtVer.setIcon(crearIcono("/IMG/Iniciar sesion/seePassword.png",txtVer.getWidth(), txtVer.getHeight()));
            Ver=false;
            txtContraseña.setEchoChar((char)0); 
            txtContraseña.requestFocus();
        }else{

            txtVer.setIcon(crearIcono("/IMG/Iniciar sesion/don´tseePassword.png",txtVer.getWidth(), txtVer.getHeight()));
            Ver=true;
            txtContraseña.setEchoChar('*'); 
            txtContraseña.requestFocus();
        }
    }//GEN-LAST:event_txtVerActionPerformed

       public Icon crearIcono(String ruta, int x, int y){
        Icon mIcon = new ImageIcon(new ImageIcon(getClass().getResource(ruta)).getImage().
        getScaledInstance(x, y, 0));
        return mIcon;
    }
    
    private void lblFondoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblFondoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblFondoAncestorAdded

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        txtError.setText(null);

    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        txtEmail.setText(txtEmail.getText().toLowerCase());
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyPressed
        txtError.setText(null);
    }//GEN-LAST:event_txtContraseñaKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
        Mainpage f1=new Mainpage();
        f1.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed
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
            java.util.logging.Logger.getLogger(Iniciar_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Iniciar_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Iniciar_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Iniciar_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Iniciar_Sesion().setVisible(true);
            }
        });
    }

 //booleanos especiales
    private boolean Ver=true;
    private boolean Seccion=true;

     //Objetos del proyecto
    UsuarioCliente[] C= new UsuarioCliente[30];
    UsuarioCliente CA= new UsuarioCliente();
    
        //declaracion de FCS para la implemantacion de la persistencia
    private ObjectOutputStream fcs;  //Flujo de Datos para Escritura
    private ObjectInputStream fce;  //Flujo de Datos para lectura
    
        //Para guardar al cliente actual
    private ObjectOutputStream fcsA;
    private ObjectInputStream fceA; 
    
    
    private int indexC=0, pos=-1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpBase;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblIniciar;
    private javax.swing.JLabel lblRegresar;
    private javax.swing.JLabel lblSuperior;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JLabel txtError;
    private javax.swing.JButton txtVer;
    // End of variables declaration//GEN-END:variables




    //EXEPCIONES UTILIZADAS

    /**
     *
     * @param Correo
     * @throws emailException
     */
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
                                    return;
                                }
                            }
                            throw new emailException("El correo no existe");
        }
        
        private void revisarContra(String pass) throws contraseñaException{
            //Revisar si la contraseña es correcta
            int d=0;
                for (int i = 0; i < indexC; i++){ 
                    if(Email.equals(C[i].getEmail())){ 
                        break;
                    }
                    d++;
                }      
                 if(!(pass.equals(C[d].getContraseña()))) throw new contraseñaException("La contraseña es incorrecta"); 
        }
    
}
