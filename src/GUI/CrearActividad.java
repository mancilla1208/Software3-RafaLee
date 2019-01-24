/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Logica.GestionArchivos;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * @author Andres Mancilla Oliver
 * @author Andres Felipe Otalvaro
 *
 * Interfaz para la ventana CrearActividad, en la cual el docente podra hacer la
 * gestion de tareas y actividades para los estudiantes.
 */
public class CrearActividad extends javax.swing.JFrame {

    JFileChooser seleccionado = new JFileChooser();
    File archivo;
    byte[] bytesImg;
    GestionArchivos gestion = new GestionArchivos();

    /**
     * Creates new form CrearActividad
     */
    public CrearActividad() {
        initComponents();
        this.setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, false);

        jPanelTipoPreguntas.setBackground(new Color(254, 227, 198, 220));
        jPanel2.setBackground(new Color(254, 227, 198, 220));

        jButtonCargarPre.setVisible(false);
        jLabelNombreArchivoPre.setVisible(false);
        jTextAreaRespuesta.setVisible(false);
        jScrollPaneRespuesta.setVisible(false);
        jLabelPreguntaA.setVisible(false);
        jLabelPreguntaB.setVisible(false);
        jLabelPreguntaC.setVisible(false);
        jLabelPreguntaD.setVisible(false);
        jTextFieldRespuesta1.setVisible(false);
        jTextFieldRespuesta2.setVisible(false);
        jTextFieldRespuesta3.setVisible(false);
        jTextFieldRespuesta4.setVisible(false);

        jButtonSiguientePre.setOpaque(false);
        jButtonSiguientePre.setContentAreaFilled(false);
        jButtonSiguientePre.setBorderPainted(false);

        jButtonAñadirTipoPre.setOpaque(false);
        jButtonAñadirTipoPre.setContentAreaFilled(false);
        jButtonAñadirTipoPre.setBorderPainted(false);

        jButtonGuardarTarea.setOpaque(false);
        jButtonGuardarTarea.setContentAreaFilled(false);
        jButtonGuardarTarea.setBorderPainted(false);

        jButtonVolver.setOpaque(false);
        jButtonVolver.setContentAreaFilled(false);
        jButtonVolver.setBorderPainted(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTipoPreguntas = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxTipoPreguntas = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaPregunta = new javax.swing.JTextArea();
        jLabelNumPregunta = new javax.swing.JLabel();
        jLabelPreguntaA = new javax.swing.JLabel();
        jLabelPreguntaB = new javax.swing.JLabel();
        jLabelPreguntaC = new javax.swing.JLabel();
        jLabelPreguntaD = new javax.swing.JLabel();
        jTextFieldRespuesta1 = new javax.swing.JTextField();
        jTextFieldRespuesta2 = new javax.swing.JTextField();
        jTextFieldRespuesta3 = new javax.swing.JTextField();
        jTextFieldRespuesta4 = new javax.swing.JTextField();
        jButtonCargarPre = new javax.swing.JButton();
        jLabelNombreArchivoPre = new javax.swing.JLabel();
        jScrollPaneRespuesta = new javax.swing.JScrollPane();
        jTextAreaRespuesta = new javax.swing.JTextArea();
        jButtonVolver = new javax.swing.JButton();
        jButtonCargarArchivoGeneral = new javax.swing.JButton();
        jLabelNombreArchivoGeneral = new javax.swing.JLabel();
        jButtonGuardarTarea = new javax.swing.JButton();
        jButtonSiguientePre = new javax.swing.JButton();
        jButtonAñadirTipoPre = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanelTipoPreguntas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipos de preguntas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 14))); // NOI18N
        jPanelTipoPreguntas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setText("Seleccione un tipo de pregunta:");
        jPanelTipoPreguntas.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 23));

        jComboBoxTipoPreguntas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Icfes", "Abierta", "Completar" }));
        jPanelTipoPreguntas.add(jComboBoxTipoPreguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 110, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Preguntas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 14))); // NOI18N

        jTextAreaPregunta.setColumns(20);
        jTextAreaPregunta.setRows(5);
        jScrollPane1.setViewportView(jTextAreaPregunta);

        jLabelNumPregunta.setText("No.");

        jLabelPreguntaA.setText("a)");

        jLabelPreguntaB.setText("b)");

        jLabelPreguntaC.setText("c)");

        jLabelPreguntaD.setText("d)");

        jTextFieldRespuesta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRespuesta1ActionPerformed(evt);
            }
        });

        jButtonCargarPre.setText("Examinar");
        jButtonCargarPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarPreActionPerformed(evt);
            }
        });

        jLabelNombreArchivoPre.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabelNombreArchivoPre.setText("Nombre de archivo");

        jScrollPaneRespuesta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Respuesta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 12))); // NOI18N

        jTextAreaRespuesta.setColumns(20);
        jTextAreaRespuesta.setRows(5);
        jScrollPaneRespuesta.setViewportView(jTextAreaRespuesta);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelNumPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonCargarPre, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelNombreArchivoPre, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabelPreguntaC))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabelPreguntaA))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jTextFieldRespuesta3, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jTextFieldRespuesta2, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabelPreguntaB))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabelPreguntaD))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jTextFieldRespuesta4, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jTextFieldRespuesta1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPaneRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNumPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabelPreguntaC))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabelPreguntaA))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jTextFieldRespuesta3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jTextFieldRespuesta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabelPreguntaB))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabelPreguntaD))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jTextFieldRespuesta4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldRespuesta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPaneRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCargarPre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombreArchivoPre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButtonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jButtonCargarArchivoGeneral.setText("Examinar");
        jButtonCargarArchivoGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarArchivoGeneralActionPerformed(evt);
            }
        });

        jLabelNombreArchivoGeneral.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabelNombreArchivoGeneral.setText("Nombre de archivo ");

        jButtonGuardarTarea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GuardarTarea.png"))); // NOI18N

        jButtonSiguientePre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/siguientePre.png"))); // NOI18N
        jButtonSiguientePre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguientePreActionPerformed(evt);
            }
        });

        jButtonAñadirTipoPre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AgregarTarea.png"))); // NOI18N
        jButtonAñadirTipoPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirTipoPreActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoBordeCT2.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jPanelTipoPreguntas, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButtonAñadirTipoPre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jButtonCargarArchivoGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabelNombreArchivoGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jButtonSiguientePre, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButtonGuardarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTipoPreguntas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButtonAñadirTipoPre, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabelNombreArchivoGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCargarArchivoGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSiguientePre, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGuardarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldRespuesta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRespuesta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRespuesta1ActionPerformed

    private void jButtonAñadirTipoPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirTipoPreActionPerformed

        if (jComboBoxTipoPreguntas.getSelectedItem() == "Icfes") {
            jTextAreaRespuesta.setVisible(false);
            jScrollPaneRespuesta.setVisible(false);

            jLabelPreguntaA.setVisible(true);
            jLabelPreguntaB.setVisible(true);
            jLabelPreguntaC.setVisible(true);
            jLabelPreguntaD.setVisible(true);

            jTextFieldRespuesta1.setVisible(true);
            jTextFieldRespuesta2.setVisible(true);
            jTextFieldRespuesta3.setVisible(true);
            jTextFieldRespuesta4.setVisible(true);

            jButtonCargarPre.setVisible(true);
            jLabelNombreArchivoPre.setVisible(true);

        } else if (jComboBoxTipoPreguntas.getSelectedItem() == "Abierta") {

            jTextAreaRespuesta.setVisible(true);
            jScrollPaneRespuesta.setVisible(true);

            jLabelPreguntaA.setVisible(false);
            jLabelPreguntaB.setVisible(false);
            jLabelPreguntaC.setVisible(false);
            jLabelPreguntaD.setVisible(false);

            jTextFieldRespuesta1.setVisible(false);
            jTextFieldRespuesta2.setVisible(false);
            jTextFieldRespuesta3.setVisible(false);
            jTextFieldRespuesta4.setVisible(false);

            jButtonCargarPre.setVisible(true);
            jLabelNombreArchivoPre.setVisible(true);

        } else if (jComboBoxTipoPreguntas.getSelectedItem() == "Completar") {

        }


    }//GEN-LAST:event_jButtonAñadirTipoPreActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonCargarArchivoGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarArchivoGeneralActionPerformed
        if (seleccionado.showDialog(null, "ABRIR ARCHIVO") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionado.getSelectedFile();
            if (archivo.canRead()) {
                if (archivo.getName().endsWith("txt") || archivo.getName().endsWith("doc") || archivo.getName().endsWith("pdf")) {
                    String contenido = gestion.AbrirATexto(archivo);
                    jLabelNombreArchivoGeneral.setText(archivo.getName());
                } else {
                    if (archivo.getName().endsWith("jpg") || archivo.getName().endsWith("png") || archivo.getName().endsWith("gif") || archivo.getName().endsWith("jpeg")) {
                        bytesImg = gestion.AbrirAImagen(archivo);
                        jLabelNombreArchivoGeneral.setText(archivo.getName());

                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor seleccione un archivo de texto o de imagen.");
                    }
                }
            }
        }
    }//GEN-LAST:event_jButtonCargarArchivoGeneralActionPerformed

    private void jButtonSiguientePreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguientePreActionPerformed

    }//GEN-LAST:event_jButtonSiguientePreActionPerformed

    private void jButtonCargarPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarPreActionPerformed
        if (seleccionado.showDialog(null, "ABRIR ARCHIVO") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionado.getSelectedFile();
            if (archivo.canRead()) {
                if (archivo.getName().endsWith("txt") || archivo.getName().endsWith("doc") || archivo.getName().endsWith("pdf")) {
                    String contenido = gestion.AbrirATexto(archivo);
                    jLabelNombreArchivoPre.setText(archivo.getName());
                } else {
                    if (archivo.getName().endsWith("jpg") || archivo.getName().endsWith("png") || archivo.getName().endsWith("gif") || archivo.getName().endsWith("jpeg")) {
                        bytesImg = gestion.AbrirAImagen(archivo);
                        jLabelNombreArchivoPre.setText(archivo.getName());
                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor seleccione un archivo de texto o de imagen.");
                    }
                }
            }
        }
    }//GEN-LAST:event_jButtonCargarPreActionPerformed

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
            java.util.logging.Logger.getLogger(CrearActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearActividad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAñadirTipoPre;
    private javax.swing.JButton jButtonCargarArchivoGeneral;
    private javax.swing.JButton jButtonCargarPre;
    private javax.swing.JButton jButtonGuardarTarea;
    private javax.swing.JButton jButtonSiguientePre;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JComboBox<String> jComboBoxTipoPreguntas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelNombreArchivoGeneral;
    private javax.swing.JLabel jLabelNombreArchivoPre;
    private javax.swing.JLabel jLabelNumPregunta;
    private javax.swing.JLabel jLabelPreguntaA;
    private javax.swing.JLabel jLabelPreguntaB;
    private javax.swing.JLabel jLabelPreguntaC;
    private javax.swing.JLabel jLabelPreguntaD;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelTipoPreguntas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneRespuesta;
    private javax.swing.JTextArea jTextAreaPregunta;
    private javax.swing.JTextArea jTextAreaRespuesta;
    private javax.swing.JTextField jTextFieldRespuesta1;
    private javax.swing.JTextField jTextFieldRespuesta2;
    private javax.swing.JTextField jTextFieldRespuesta3;
    private javax.swing.JTextField jTextFieldRespuesta4;
    // End of variables declaration//GEN-END:variables
}
