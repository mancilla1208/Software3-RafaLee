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
import Logica.ConexionMySql;
import Logica.MetodosBD;
import Logica.MetodosLogica;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 * @author Andres Mancilla Oliver
 * @author Andres Felipe Otalvaro
 *
 * Interfaz para la ventana Estudiante.
 */
public class Estudiante extends javax.swing.JInternalFrame {
    
    MetodosBD metodobd = new MetodosBD(this);
    int con3 = 2;
    
    private static ListaEstudiantes listaEstudiantes;
    
    public Estudiante(ListaEstudiantes listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    /**
     * Creates new form Estudiante
     */
    public Estudiante(String grado) {
        
        initComponents();
        metodobd.cargarActividadesEstudiante();
        txtRespuesta.setVisible(false);
        rbtnRespuesta1.setVisible(false);
        rbtnRespuesta2.setVisible(false);
        rbtnRespuesta3.setVisible(false);
        rbtnRespuesta4.setVisible(false);
        lblActividad.setVisible(false);
        lblNumeroPregunta.setVisible(false);
        txtAreaPregunta.setVisible(false);
        jScrollPane2.setVisible(false);
        btnSiguiente.setVisible(false);
        txtAreaPdf.setVisible(false);
        jScrollPane3.setVisible(false);
        
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbtnGrupo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList_Actividades = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jLabelNombreEstudiante = new javax.swing.JLabel();
        jLabel_texGra = new javax.swing.JLabel();
        jButtonSalirEstudiante = new javax.swing.JButton();
        jButtonVolverEstu = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel_Grado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel_Interno = new javax.swing.JPanel();
        lblActividad = new javax.swing.JLabel();
        lblNumeroPregunta = new javax.swing.JLabel();
        rbtnRespuesta1 = new javax.swing.JRadioButton();
        rbtnRespuesta2 = new javax.swing.JRadioButton();
        rbtnRespuesta3 = new javax.swing.JRadioButton();
        rbtnRespuesta4 = new javax.swing.JRadioButton();
        txtRespuesta = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaPregunta = new javax.swing.JTextArea();
        btnSiguiente = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaPdf = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximizable(true);
        setTitle("Estudiantes");
        setAutoscrolls(true);
        setPreferredSize(new java.awt.Dimension(916, 603));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Lista de actividades");

        jList_Actividades.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jList_Actividades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList_ActividadesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList_Actividades);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNombreEstudiante.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jPanel2.add(jLabelNombreEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 310, 30));

        jLabel_texGra.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jLabel_texGra.setText("Grado ");
        jPanel2.add(jLabel_texGra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 70, 30));

        jButtonSalirEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        jButtonSalirEstudiante.setContentAreaFilled(false);
        jButtonSalirEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirEstudianteActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonSalirEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 62, 45));

        jButtonVolverEstu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/volver2.png"))); // NOI18N
        jButtonVolverEstu.setContentAreaFilled(false);
        jButtonVolverEstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverEstuActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonVolverEstu, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 57, 45));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/barraEstudiantes.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 170, 90));

        jLabel_Grado.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jPanel2.add(jLabel_Grado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 50, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 90));

        jPanel_Interno.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Interno.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel_Interno.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblActividad.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblActividad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel_Interno.add(lblActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 360, 40));

        lblNumeroPregunta.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblNumeroPregunta.setText("1");
        jPanel_Interno.add(lblNumeroPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 40, 40));

        rbtnGrupo.add(rbtnRespuesta1);
        rbtnRespuesta1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rbtnRespuesta1.setText("\"\"");
        rbtnRespuesta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnRespuesta1ActionPerformed(evt);
            }
        });
        jPanel_Interno.add(rbtnRespuesta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 270, 30));

        rbtnGrupo.add(rbtnRespuesta2);
        rbtnRespuesta2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rbtnRespuesta2.setText("\"\"");
        jPanel_Interno.add(rbtnRespuesta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 217, 270, 30));

        rbtnGrupo.add(rbtnRespuesta3);
        rbtnRespuesta3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rbtnRespuesta3.setText("\"\"");
        jPanel_Interno.add(rbtnRespuesta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 270, 30));

        rbtnGrupo.add(rbtnRespuesta4);
        rbtnRespuesta4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rbtnRespuesta4.setText("\"\"");
        jPanel_Interno.add(rbtnRespuesta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 287, 270, 30));

        txtRespuesta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel_Interno.add(txtRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 440, 130));

        jScrollPane2.setBorder(null);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtAreaPregunta.setEditable(false);
        txtAreaPregunta.setColumns(20);
        txtAreaPregunta.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtAreaPregunta.setRows(5);
        txtAreaPregunta.setBorder(null);
        jScrollPane2.setViewportView(txtAreaPregunta);

        jPanel_Interno.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 400, 70));

        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        btnSiguiente.setBorderPainted(false);
        btnSiguiente.setContentAreaFilled(false);
        btnSiguiente.setFocusPainted(false);
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        jPanel_Interno.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 130, 50));

        txtAreaPdf.setColumns(20);
        txtAreaPdf.setRows(5);
        jScrollPane3.setViewportView(txtAreaPdf);

        jPanel_Interno.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 40, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Nuava2.jpg"))); // NOI18N
        jPanel_Interno.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jPanel_Interno, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jPanel_Interno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnRespuesta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnRespuesta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnRespuesta1ActionPerformed

    private void jButtonSalirEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirEstudianteActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirEstudianteActionPerformed

    private void jButtonVolverEstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverEstuActionPerformed
        dispose();
        Principal.VentaPrincipal.show();
        jbDocente.setVisible(true);
        jbEstudiante.setVisible(true);
        jLabelDocente.setVisible(true);
        jLabelEstudiante.setVisible(true);
        jLabelBienvenidos.setVisible(true);
    }//GEN-LAST:event_jButtonVolverEstuActionPerformed

    private void jList_ActividadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList_ActividadesMouseClicked
        metodobd.consultaActividad();
        jList_Actividades.enable(false);
        

    }//GEN-LAST:event_jList_ActividadesMouseClicked

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        // TODO add your handling code here:

        if (!txtRespuesta.isVisible()) {
               
            if (rbtnRespuesta1.isSelected()) {
                metodobd.agregarRespuesta(txtAreaPregunta.getText(), rbtnRespuesta1.getText().toString(), "Icfes");
                txtAreaPdf.append(lblNumeroPregunta.getText() + ". " + txtAreaPregunta.getText() + "\n");
                txtAreaPdf.append("" + rbtnRespuesta1.getText().toString() + "\n\n");
            }
            if (rbtnRespuesta2.isSelected()) {
                metodobd.agregarRespuesta(txtAreaPregunta.getText(), rbtnRespuesta2.getText().toString(), "Icfes");
                txtAreaPdf.append(lblNumeroPregunta.getText() + ". " + txtAreaPregunta.getText() + "\n");
                txtAreaPdf.append("" + rbtnRespuesta2.getText().toString() + "\n\n");
            }
            if (rbtnRespuesta3.isSelected()) {
                metodobd.agregarRespuesta(txtAreaPregunta.getText(), rbtnRespuesta3.getText().toString(), "Icfes");
                txtAreaPdf.append(lblNumeroPregunta.getText() + ". " + txtAreaPregunta.getText() + "\n");
                txtAreaPdf.append("" + rbtnRespuesta3.getText().toString() + "\n\n");
            }
            if (rbtnRespuesta4.isSelected()) {
                metodobd.agregarRespuesta(txtAreaPregunta.getText(), rbtnRespuesta4.getText().toString(), "Icfes");
                txtAreaPdf.append(lblNumeroPregunta.getText() + ". " + txtAreaPregunta.getText() + "\n");
                txtAreaPdf.append("" + rbtnRespuesta4.getText().toString() + "\n\n");
            }
            
        } else {
            metodobd.agregarRespuesta(txtAreaPregunta.getText(), txtRespuesta.getText(), "");
            txtAreaPdf.append(lblNumeroPregunta.getText() + ". " + txtAreaPregunta.getText() + "\n");
            txtAreaPdf.append("" + txtRespuesta.getText() + "\n\n");
            
        }
        metodobd.siguientePregunta();
        

    }//GEN-LAST:event_btnSiguienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnSiguiente;
    private javax.swing.JButton jButtonSalirEstudiante;
    private javax.swing.JButton jButtonVolverEstu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabelNombreEstudiante;
    public static javax.swing.JLabel jLabel_Grado;
    public static javax.swing.JLabel jLabel_texGra;
    public static javax.swing.JList<String> jList_Actividades;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_Interno;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JLabel lblActividad;
    public javax.swing.JLabel lblNumeroPregunta;
    private javax.swing.ButtonGroup rbtnGrupo;
    public javax.swing.JRadioButton rbtnRespuesta1;
    public javax.swing.JRadioButton rbtnRespuesta2;
    public javax.swing.JRadioButton rbtnRespuesta3;
    public javax.swing.JRadioButton rbtnRespuesta4;
    public javax.swing.JTextArea txtAreaPdf;
    public javax.swing.JTextArea txtAreaPregunta;
    public javax.swing.JTextField txtRespuesta;
    // End of variables declaration//GEN-END:variables
}
