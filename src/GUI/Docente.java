/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static GUI.GestionarEstudiante.jTableListaEstu;
import Logica.ConexionMySql;
import Logica.GestionArchivos;
import Logica.MetodosBD;
import Logica.MetodosLogica;
import java.awt.Color;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andres Mancilla Oliver
 * @author Andres Felipe Otalvaro
 *
 * Interfaz para la ventana Docente, donde se realiza toda la administración de
 * tareas para el estudiante por parte del docente y demas funciones.
 */
public class Docente extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    ConexionMySql cc = new ConexionMySql();
    Connection cn = cc.Conectar();
    MetodosBD metodobd = new MetodosBD();
    MetodosLogica logica = new MetodosLogica();
    String idDocente = "";

    JFileChooser seleccionado = new JFileChooser();
    File archivo;
    byte[] bytesImg;
    GestionArchivos gestion = new GestionArchivos();

    /**
     * Creates new form Docente
     */
    public Docente() {
        initComponents();
        metodobd.cargarActividades();

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

        jPanelBarraDocente = new javax.swing.JPanel();
        jLabel_NombreDocente = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButtonExitDocente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList_ActividadesG0 = new javax.swing.JList<>();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList_ActividadesG1 = new javax.swing.JList<>();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList_ActividadesG2 = new javax.swing.JList<>();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList_ActividadesG3 = new javax.swing.JList<>();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList_ActividadesG4 = new javax.swing.JList<>();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jList_ActividadesG5 = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        jB_AñadirTipoPre = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
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
        jB_GuardarTarea = new javax.swing.JButton();
        jB_SiguientePre = new javax.swing.JButton();
        jB_CargarArchivoGeneral = new javax.swing.JButton();
        jLabelNombreArchivoGeneral = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox_TipoPreguntas = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jTextField_NombreActivi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField_GradoActividad = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
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
        setPreferredSize(new java.awt.Dimension(900, 700));
        setRequestFocusEnabled(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBarraDocente.setBackground(new java.awt.Color(255, 220, 184));
        jPanelBarraDocente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelBarraDocente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_NombreDocente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanelBarraDocente.add(jLabel_NombreDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 4, 290, 30));

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel2.setText("Docente");
        jPanelBarraDocente.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 42, 65, 13));

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel3.setText("2018");
        jPanelBarraDocente.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 61, 65, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/docenteNiños.png"))); // NOI18N
        jPanelBarraDocente.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 330, 100));

        jButtonExitDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Exit.png"))); // NOI18N
        jButtonExitDocente.setBorderPainted(false);
        jButtonExitDocente.setContentAreaFilled(false);
        jButtonExitDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitDocenteActionPerformed(evt);
            }
        });
        jPanelBarraDocente.add(jButtonExitDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, -1, -1));

        getContentPane().add(jPanelBarraDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 100));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setPreferredSize(new java.awt.Dimension(898, 580));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Actividades", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 12))); // NOI18N

        jList_ActividadesG0.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jScrollPane1.setViewportView(jList_ActividadesG0);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Grado 0", jPanel5);

        jList_ActividadesG1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jScrollPane2.setViewportView(jList_ActividadesG1);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Grado 1", jPanel6);

        jList_ActividadesG2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jScrollPane3.setViewportView(jList_ActividadesG2);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Grado 2", jPanel7);

        jList_ActividadesG3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jScrollPane4.setViewportView(jList_ActividadesG3);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Grado 3", jPanel8);

        jList_ActividadesG4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jScrollPane5.setViewportView(jList_ActividadesG4);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Grado 4", jPanel9);

        jList_ActividadesG5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jScrollPane6.setViewportView(jList_ActividadesG5);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Grado 5", jPanel10);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Crear actividad", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 12))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jB_AñadirTipoPre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AgregarTarea.png"))); // NOI18N
        jB_AñadirTipoPre.setBorderPainted(false);
        jB_AñadirTipoPre.setContentAreaFilled(false);
        jB_AñadirTipoPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_AñadirTipoPreActionPerformed(evt);
            }
        });
        jPanel3.add(jB_AñadirTipoPre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 40, 40));

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Preguntas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 14))); // NOI18N
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextAreaPregunta.setColumns(20);
        jTextAreaPregunta.setRows(5);
        jScrollPane7.setViewportView(jTextAreaPregunta);

        jPanel11.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 383, 40));

        jLabelNumPregunta.setText("No.");
        jPanel11.add(jLabelNumPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 34, 25, 31));

        jLabelPreguntaA.setText("a)");
        jPanel11.add(jLabelPreguntaA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabelPreguntaB.setText("b)");
        jPanel11.add(jLabelPreguntaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabelPreguntaC.setText("c)");
        jPanel11.add(jLabelPreguntaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabelPreguntaD.setText("d)");
        jPanel11.add(jLabelPreguntaD, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jTextFieldRespuesta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRespuesta1ActionPerformed(evt);
            }
        });
        jPanel11.add(jTextFieldRespuesta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 400, -1));
        jPanel11.add(jTextFieldRespuesta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 400, -1));
        jPanel11.add(jTextFieldRespuesta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 400, -1));
        jPanel11.add(jTextFieldRespuesta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 400, -1));

        jButtonCargarPre.setText("Examinar");
        jButtonCargarPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarPreActionPerformed(evt);
            }
        });
        jPanel11.add(jButtonCargarPre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 101, 26));

        jLabelNombreArchivoPre.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabelNombreArchivoPre.setText("Nombre de archivo");
        jPanel11.add(jLabelNombreArchivoPre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 186, 30));

        jScrollPaneRespuesta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Respuesta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 12))); // NOI18N

        jTextAreaRespuesta.setColumns(20);
        jTextAreaRespuesta.setRows(5);
        jScrollPaneRespuesta.setViewportView(jTextAreaRespuesta);

        jPanel11.add(jScrollPaneRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 420, 120));

        jB_GuardarTarea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GuardarTarea.png"))); // NOI18N
        jB_GuardarTarea.setBorderPainted(false);
        jB_GuardarTarea.setContentAreaFilled(false);
        jB_GuardarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_GuardarTareaActionPerformed(evt);
            }
        });
        jPanel11.add(jB_GuardarTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 200, 45, -1));

        jB_SiguientePre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/siguientePre.png"))); // NOI18N
        jB_SiguientePre.setBorderPainted(false);
        jB_SiguientePre.setContentAreaFilled(false);
        jB_SiguientePre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_SiguientePreActionPerformed(evt);
            }
        });
        jPanel11.add(jB_SiguientePre, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 200, 55, -1));

        jPanel3.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 460, 250));

        jB_CargarArchivoGeneral.setText("Examinar");
        jB_CargarArchivoGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_CargarArchivoGeneralActionPerformed(evt);
            }
        });
        jPanel3.add(jB_CargarArchivoGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 100, -1));

        jLabelNombreArchivoGeneral.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jPanel3.add(jLabelNombreArchivoGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 310, 20));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setText("Tipo de pregunta:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 20));

        jComboBox_TipoPreguntas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Icfes", "Abierta", "Completar" }));
        jPanel3.add(jComboBox_TipoPreguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 70, 20));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setText("Nombre de actividad:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 20, -1, -1));
        jPanel3.add(jTextField_NombreActivi, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 22, 297, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setText("Grado:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));
        jPanel3.add(jTextField_GradoActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 62, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Crear actividad", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CrearTarea.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 130, 70));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(164, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 101, -1, -1));

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


    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItemInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInicioActionPerformed

        int seleccion = JOptionPane.showOptionDialog(
                null, // Componente padre
                "Esta seguro que desea salir.?", //Mensaje
                "Seleccione una opción", // Título
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, // null para icono por defecto.
                new Object[]{"Si", "No"}, // null para YES, NO y CANCEL
                "Si");

        if (seleccion == JOptionPane.YES_OPTION) {
            this.dispose();
            Principal.jbDocente.setVisible(true);
            Principal.jbEstudiante.setVisible(true);
            Principal.jLabelBienvenidos.setVisible(true);
            Principal.jLabelDocente.setVisible(true);
            Principal.jLabelEstudiante.setVisible(true);
        } else {

        }

    }//GEN-LAST:event_jMenuItemInicioActionPerformed

    private void jButtonExitDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitDocenteActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExitDocenteActionPerformed

    private void jB_AñadirTipoPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_AñadirTipoPreActionPerformed

        if (jComboBox_TipoPreguntas.getSelectedItem() == "Icfes") {
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

        } else if (jComboBox_TipoPreguntas.getSelectedItem() == "Abierta") {

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

        } else if (jComboBox_TipoPreguntas.getSelectedItem() == "Completar") {

        }

    }//GEN-LAST:event_jB_AñadirTipoPreActionPerformed

    private void jTextFieldRespuesta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRespuesta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRespuesta1ActionPerformed

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

    private void jB_CargarArchivoGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_CargarArchivoGeneralActionPerformed
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
    }//GEN-LAST:event_jB_CargarArchivoGeneralActionPerformed

    private void jB_SiguientePreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_SiguientePreActionPerformed

        String SSQL1 = "SELECT d.idDocente FROM rafalee_bd.docente d WHERE nombre_completo='" + jLabel_NombreDocente.getText() + "'";
        Connection conect = null;

        try {
            conect = cc.Conectar();
            Statement st = conect.createStatement();
            ResultSet rs1 = st.executeQuery(SSQL1);
            if (rs1.next()) {
                idDocente = rs1.getString(1);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error de conexión", JOptionPane.ERROR_MESSAGE);
        }

        if (jComboBox_TipoPreguntas.getSelectedItem().toString().equals("Icfes")) {

            try {
                PreparedStatement ps = cn.prepareStatement("INSERT INTO rafalee_bd.tipo_icfes(enunciado,respuesta1,respuesta2,respuesta3,respuesta4,id_Actividad3) VALUES (?,?,?,?,?,?)");
                ps.setString(1, jTextAreaPregunta.getText());
                ps.setString(2, jTextFieldRespuesta1.getText());
                ps.setString(3, jTextFieldRespuesta2.getText());
                ps.setString(4, jTextFieldRespuesta3.getText());
                ps.setString(5, jTextFieldRespuesta4.getText());
                ps.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(GestionarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_jB_SiguientePreActionPerformed


    private void jB_GuardarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_GuardarTareaActionPerformed

    }//GEN-LAST:event_jB_GuardarTareaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String SSQL1 = "SELECT d.idDocente FROM rafalee_bd.docente d WHERE nombre_completo='" + jLabel_NombreDocente.getText() + "'";
        Connection conect = null;

        try {
            conect = cc.Conectar();
            Statement st = conect.createStatement();
            ResultSet rs1 = st.executeQuery(SSQL1);
            if (rs1.next()) {
                idDocente = rs1.getString(1);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error de conexión", JOptionPane.ERROR_MESSAGE);
        }
        try {
            PreparedStatement ps = cn.prepareStatement("INSERT INTO rafalee_bd.actividad (nombre,grado,id_Docente1) VALUES (?,?,?)");
            ps.setString(1, jTextField_NombreActivi.getText());
            ps.setString(2, jTextField_GradoActividad.getText());
            ps.setString(3, idDocente);
            ps.executeUpdate();
            logica.limpiarCamposCrearActi();

        } catch (SQLException ex) {
            Logger.getLogger(GestionarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_AñadirTipoPre;
    private javax.swing.JButton jB_CargarArchivoGeneral;
    private javax.swing.JButton jB_GuardarTarea;
    private javax.swing.JButton jB_SiguientePre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCargarPre;
    private javax.swing.JButton jButtonExitDocente;
    private javax.swing.JComboBox<String> jComboBox_TipoPreguntas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelNombreArchivoGeneral;
    private javax.swing.JLabel jLabelNombreArchivoPre;
    private javax.swing.JLabel jLabelNumPregunta;
    private javax.swing.JLabel jLabelPreguntaA;
    private javax.swing.JLabel jLabelPreguntaB;
    private javax.swing.JLabel jLabelPreguntaC;
    private javax.swing.JLabel jLabelPreguntaD;
    public javax.swing.JLabel jLabel_NombreDocente;
    public static javax.swing.JList<String> jList_ActividadesG0;
    public static javax.swing.JList<String> jList_ActividadesG1;
    public static javax.swing.JList<String> jList_ActividadesG2;
    public static javax.swing.JList<String> jList_ActividadesG3;
    public static javax.swing.JList<String> jList_ActividadesG4;
    public static javax.swing.JList<String> jList_ActividadesG5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemInicio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelBarraDocente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPaneRespuesta;
    private javax.swing.JTabbedPane jTabbedPane2;
    public static javax.swing.JTextArea jTextAreaPregunta;
    public static javax.swing.JTextArea jTextAreaRespuesta;
    public static javax.swing.JTextField jTextFieldRespuesta1;
    public static javax.swing.JTextField jTextFieldRespuesta2;
    public static javax.swing.JTextField jTextFieldRespuesta3;
    public static javax.swing.JTextField jTextFieldRespuesta4;
    public static javax.swing.JTextField jTextField_GradoActividad;
    public static javax.swing.JTextField jTextField_NombreActivi;
    // End of variables declaration//GEN-END:variables
}
