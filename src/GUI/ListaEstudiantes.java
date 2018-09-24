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

/**
 *
 * @author andre
 */
public class ListaEstudiantes extends javax.swing.JFrame {

    /**
     * Creates new form ListaEstudiantes
     */
    public ListaEstudiantes() {
        initComponents();
        this.setLocationRelativeTo(null);

        jButtonAceptarEstu.setOpaque(false);
        jButtonAceptarEstu.setContentAreaFilled(false);
        jButtonAceptarEstu.setBorderPainted(false);

        jButtonCancelarEstu.setOpaque(false);
        jButtonCancelarEstu.setContentAreaFilled(false);
        jButtonCancelarEstu.setBorderPainted(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButtonAceptarEstu = new javax.swing.JButton();
        jButtonCancelarEstu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(650, 324));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 2, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 255));
        jLabel2.setText("Selecciona tu nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 410, -1));

        jComboBox1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombres", "Rafa1", "Pepe", "Chilindrina" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 290, -1));

        jButtonAceptarEstu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        jButtonAceptarEstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarEstuActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAceptarEstu, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 60, 50));

        jButtonCancelarEstu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        jButtonCancelarEstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarEstuActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarEstu, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 60, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listaEstudiantes.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceptarEstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarEstuActionPerformed

        dispose();
        Estudiante estudiante = new Estudiante();
        Principal.VentaPrincipal.add(estudiante);
        Principal.VentaPrincipal.moveToFront(estudiante);
        estudiante.setSize(Principal.VentaPrincipal.getWidth(), Principal.VentaPrincipal.getHeight());
        estudiante.setLocation(0, 0);
        estudiante.show();


    }//GEN-LAST:event_jButtonAceptarEstuActionPerformed

    private void jButtonCancelarEstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarEstuActionPerformed
        dispose();

        jbDocente.setVisible(true);
        jbEstudiante.setVisible(true);
        jLabelDocente.setVisible(true);
        jLabelEstudiante.setVisible(true);
        jLabelBienvenidos.setVisible(true);
        
    }//GEN-LAST:event_jButtonCancelarEstuActionPerformed

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
            java.util.logging.Logger.getLogger(ListaEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaEstudiantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptarEstu;
    private javax.swing.JButton jButtonCancelarEstu;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
