/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static GUI.GestionarEstudiante.jTableListaEstu;
import Logica.ConexionMySql;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andre
 */
public class Docente extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    ConexionMySql cc = new ConexionMySql();
    Connection cn = cc.Conectar();

    /**
     * Creates new form Docente
     */
    public Docente() {
        initComponents();

        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);

        jButtonCrearTarea.setOpaque(false);
        jButtonCrearTarea.setContentAreaFilled(false);
        jButtonCrearTarea.setBorderPainted(false);

        jButtonGuardarTarea.setOpaque(false);
        jButtonGuardarTarea.setContentAreaFilled(false);
        jButtonGuardarTarea.setBorderPainted(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBarraDocente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonCrearTarea = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButtonGuardarTarea = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemInicio = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximizable(true);
        setResizable(true);
        setTitle("Docente");
        setAutoscrolls(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBarraDocente.setBackground(new java.awt.Color(255, 220, 184));
        jPanelBarraDocente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelBarraDocente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Benilda Villa Montes");
        jPanelBarraDocente.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 14, 248, -1));

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel2.setText("Docente");
        jPanelBarraDocente.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 42, 65, 13));

        jButtonCrearTarea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CrearTarea.png"))); // NOI18N
        jButtonCrearTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearTareaActionPerformed(evt);
            }
        });
        jPanelBarraDocente.add(jButtonCrearTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 54, -1));

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel3.setText("2018");
        jPanelBarraDocente.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 61, 65, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/docenteNiños.png"))); // NOI18N
        jPanelBarraDocente.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 340, 100));

        jButtonGuardarTarea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GuardarTarea.png"))); // NOI18N
        jButtonGuardarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarTareaActionPerformed(evt);
            }
        });
        jPanelBarraDocente.add(jButtonGuardarTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 60, 60));

        getContentPane().add(jPanelBarraDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 100));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel10.setText("Tarea - Colores");

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel11.setText("Vocales");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setText("Evaluación - Clase de animales");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setText("Tarea programada - Lectura");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel4)
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(26, 26, 26)
                .addComponent(jLabel10)
                .addContainerGap(221, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Grado 0", jPanel4);

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 289, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Grado 1", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 289, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Grado 2", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 204, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 289, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Grado 3", jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 289, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Grado 4", jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 289, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Grado 5", jPanel9);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 101, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel6.setText("Lectura sobre animales");

        jLabel7.setText("1. Cual de los siguientes animales tiene 4 patas?");

        jRadioButton1.setText("Delfin");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Perro");

        jRadioButton3.setText("Ballena");

        jLabel8.setText("2. Leer y dar opinion sobre el siguiente texto:");

        jLabel9.setText("Esto es una prueba, conteste en el siguiente recuadro.");
        jLabel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder("RESPUESTA"));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                        .addComponent(jTextField1)
                        .addComponent(jLabel8)
                        .addComponent(jRadioButton3)
                        .addComponent(jRadioButton2)
                        .addComponent(jRadioButton1)
                        .addComponent(jLabel7)))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6)
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton3)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 101, 620, 461));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/archivo.png"))); // NOI18N
        jMenu1.setText("Archivo");

        jMenuItemInicio.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Home.png"))); // NOI18N
        jMenuItemInicio.setText("Inicio");
        jMenuItemInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInicioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemInicio);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Gestionar.png"))); // NOI18N
        jMenu2.setText("G. Estudiantes");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Gestionar2.png"))); // NOI18N
        jMenuItem1.setText("Gestionar estudiante");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        GestionarEstudiante gestion = new GestionarEstudiante();
        gestion.show();

        String sqlMostrar = "SELECT * FROM rafalee_bd.estudiante";
        Statement st;

        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Grado");

        jTableListaEstu.setModel(modelo);

        String[] Dato = new String[3];
        try {
            st = cn.createStatement();
            ResultSet result = st.executeQuery(sqlMostrar);
            while (result.next()) {
                Dato[0] = result.getString(1);
                Dato[1] = result.getString(2);
                Dato[2] = result.getString(3);
                modelo.addRow(Dato);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jMenuItemInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInicioActionPerformed
        int msjSalir = JOptionPane.showConfirmDialog(null, "Esta seguro que desea ir a inicio?");
        if (msjSalir == JOptionPane.YES_OPTION) {
            this.dispose();
            Principal.jbDocente.setVisible(true);
            Principal.jbEstudiante.setVisible(true);
            Principal.jLabelBienvenidos.setVisible(true);
            Principal.jLabelDocente.setVisible(true);
            Principal.jLabelEstudiante.setVisible(true);

        } else if (msjSalir == JOptionPane.NO_OPTION) {

        }
    }//GEN-LAST:event_jMenuItemInicioActionPerformed

    private void jButtonGuardarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarTareaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGuardarTareaActionPerformed

    private void jButtonCrearTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearTareaActionPerformed

        CrearActividad nueva = new CrearActividad();
        nueva.show();

    }//GEN-LAST:event_jButtonCrearTareaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCrearTarea;
    private javax.swing.JButton jButtonGuardarTarea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemInicio;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelBarraDocente;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
