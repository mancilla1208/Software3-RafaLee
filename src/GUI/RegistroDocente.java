/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static GUI.Principal.jLabelBienvenidos;
import static GUI.Principal.jLabelDocente;
import static GUI.Principal.jLabelEstudiante;
import static GUI.Principal.jbDocente;
import static GUI.Principal.jbEstudiante;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andre
 */
public class RegistroDocente extends javax.swing.JFrame {

    /**
     * Creates new form RegistroDocente
     */
    Connection con = null;
    Statement stmt = null;

    public RegistroDocente() {
        initComponents();
        this.setLocationRelativeTo(null);

        jB_RegistrarDoce.setOpaque(false);
        jB_RegistrarDoce.setContentAreaFilled(false);
        jB_RegistrarDoce.setBorderPainted(false);

        jB_CancelarRegistro.setOpaque(false);
        jB_CancelarRegistro.setContentAreaFilled(false);
        jB_CancelarRegistro.setBorderPainted(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextRegis_Nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextRegis_Edad = new javax.swing.JTextField();
        jTextRegis_Sede = new javax.swing.JTextField();
        jTextRegis_Usuario = new javax.swing.JTextField();
        jB_RegistrarDoce = new javax.swing.JButton();
        jB_CancelarRegistro = new javax.swing.JButton();
        jTextRegis_Clave = new javax.swing.JPasswordField();
        jLabelFondoRegistro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextRegis_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRegis_NombreActionPerformed(evt);
            }
        });
        getContentPane().add(jTextRegis_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 250, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre completo:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 130, 20));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Edad:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, 20));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sede:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, 20));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre de usuario:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, 20));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contraseña:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, 20));

        jTextRegis_Edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRegis_EdadActionPerformed(evt);
            }
        });
        jTextRegis_Edad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextRegis_EdadKeyTyped(evt);
            }
        });
        getContentPane().add(jTextRegis_Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 80, -1));
        getContentPane().add(jTextRegis_Sede, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 180, -1));
        getContentPane().add(jTextRegis_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 220, -1));

        jB_RegistrarDoce.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        jB_RegistrarDoce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_RegistrarDoceActionPerformed(evt);
            }
        });
        getContentPane().add(jB_RegistrarDoce, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, -1, -1));

        jB_CancelarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        jB_CancelarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_CancelarRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(jB_CancelarRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, -1, -1));
        getContentPane().add(jTextRegis_Clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 180, -1));

        jLabelFondoRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RegistrarDocente.jpg"))); // NOI18N
        getContentPane().add(jLabelFondoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextRegis_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRegis_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextRegis_NombreActionPerformed

    private void jB_CancelarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_CancelarRegistroActionPerformed
        this.dispose();


    }//GEN-LAST:event_jB_CancelarRegistroActionPerformed

    private void jB_RegistrarDoceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_RegistrarDoceActionPerformed

        String cadena2, cadena3, cadena4, cadena5, cadena6;

        cadena2 = jTextRegis_Nombre.getText();
        cadena3 = jTextRegis_Edad.getText();
        cadena4 = jTextRegis_Sede.getText();
        cadena5 = jTextRegis_Usuario.getText();
        cadena6 = jTextRegis_Clave.getText().toString();

        if (jTextRegis_Nombre.getText().equals("") || (jTextRegis_Edad.getText().equals("")) || (jTextRegis_Sede.getText().equals("")) || (jTextRegis_Usuario.getText().equals(""))
                || (jTextRegis_Clave.getText().equals(""))) {

            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos \n", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            jTextRegis_Nombre.requestFocus();
        } else {
            try {

                String url = "jdbc:mysql://localhost:3306/rafalee_bd";
                String usuario = "andres";
                String contraseña = "0702";

                Class.forName("com.mysql.jdbc.Driver").newInstance();
                con = DriverManager.getConnection(url, usuario, contraseña);
                if (con != null) {
                    System.out.println("Se ha establecido una conexión a la base de datos "
                            + "\n " + url);
                }

                stmt = con.createStatement();
                stmt.executeUpdate("INSERT INTO docente VALUES('" + 0 + "','" + cadena2 + "','" + cadena3 + "','" + cadena4 + "','" + cadena5 + "','" + cadena6 + "')");
                System.out.println("Los valores han sido agregados a la base de datos ");

            } catch (InstantiationException ex) {
                Logger.getLogger(RegistroDocente.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(RegistroDocente.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(RegistroDocente.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(RegistroDocente.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                if (con != null) {
                    try {
                        con.close();
                        stmt.close();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
            javax.swing.JOptionPane.showMessageDialog(this, "Registro exitoso! \n", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
        this.jTextRegis_Nombre.setText("");
        this.jTextRegis_Edad.setText("");
        this.jTextRegis_Sede.setText("");
        this.jTextRegis_Usuario.setText("");
        this.jTextRegis_Clave.setText("");

        this.dispose();

        Login login = new Login();
        login.show();

        jbDocente.setVisible(false);
        jbEstudiante.setVisible(false);
        jLabelBienvenidos.setVisible(false);
        jLabelDocente.setVisible(false);
        jLabelEstudiante.setVisible(false);


    }//GEN-LAST:event_jB_RegistrarDoceActionPerformed

    private void jTextRegis_EdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRegis_EdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextRegis_EdadActionPerformed

    private void jTextRegis_EdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextRegis_EdadKeyTyped
        char v = evt.getKeyChar();
        if (v < '0' || v > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_jTextRegis_EdadKeyTyped

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
            java.util.logging.Logger.getLogger(RegistroDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroDocente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_CancelarRegistro;
    private javax.swing.JButton jB_RegistrarDoce;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelFondoRegistro;
    private javax.swing.JPasswordField jTextRegis_Clave;
    private javax.swing.JTextField jTextRegis_Edad;
    private javax.swing.JTextField jTextRegis_Nombre;
    private javax.swing.JTextField jTextRegis_Sede;
    private javax.swing.JTextField jTextRegis_Usuario;
    // End of variables declaration//GEN-END:variables
}
