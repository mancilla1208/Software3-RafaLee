/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Logica.ConexionMySql;
import Logica.MetodosBD;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andres Mancilla Oliver
 * @author Andres Felipe Otalvaro
 *
 */
public class GestionarEstudiante extends javax.swing.JFrame {

    ConexionMySql cc = new ConexionMySql();
    Connection cn = cc.Conectar();
    MetodosBD metodobd = new MetodosBD();
    String idEstudiante = "";

    /**
     * Creates new form AgregarEstudiante
     */
    public GestionarEstudiante() {
        initComponents();
        mostrarTabla();
        this.setLocationRelativeTo(null);
        jPanelAddEstu.setBackground(new Color(222, 243, 252, 30));

        jButtonAñadirEstu.setBackground(new Color(222, 243, 252, 0));

        jButtonEditar.setOpaque(false);
        jButtonEditar.setContentAreaFilled(false);
        jButtonEditar.setBorderPainted(false);

        jButtonEliminar.setOpaque(false);
        jButtonEliminar.setContentAreaFilled(false);
        jButtonEliminar.setBorderPainted(false);

        jButtonVolver.setOpaque(false);
        jButtonVolver.setContentAreaFilled(false);
        jButtonVolver.setBorderPainted(false);

        jButtonActualizar.setOpaque(false);
        jButtonActualizar.setContentAreaFilled(false);
        jButtonActualizar.setBorderPainted(false);

    }

    /*
    * Metodo encargado de crear la tabla con sus respectivas columnas y la consulta
    * para que muestre los estudiantes que se encuentran registrados en la base de datos.
     */
    void mostrarTabla() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Grado");
        jTableListaEstu.setModel(modelo);

        String sql = "SELECT * FROM rafalee_bd.estudiante";
        String[] datos = new String[3];
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                modelo.addRow(datos);
            }
            jTableListaEstu.setModel(modelo);

        } catch (SQLException ex) {
            Logger.getLogger(GestionarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /*
    * Metodo encargado de limpiar los campos de nombre y grado del estudiante.
     */
    void limpiar() {
        txtNombreCompletoEstu.setText("");
        txtGradoEstu.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAddEstu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombreCompletoEstu = new javax.swing.JTextField();
        txtGradoEstu = new javax.swing.JTextField();
        jPanelEliModiEstu = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListaEstu = new javax.swing.JTable();
        jButtonEliminar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jButtonAñadirEstu = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelAddEstu.setBackground(new java.awt.Color(222, 243, 252));
        jPanelAddEstu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agregar estudiante", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 12))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel3.setText("Grado:");

        txtNombreCompletoEstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCompletoEstuActionPerformed(evt);
            }
        });
        txtNombreCompletoEstu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreCompletoEstuKeyTyped(evt);
            }
        });

        txtGradoEstu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGradoEstuKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanelAddEstuLayout = new javax.swing.GroupLayout(jPanelAddEstu);
        jPanelAddEstu.setLayout(jPanelAddEstuLayout);
        jPanelAddEstuLayout.setHorizontalGroup(
            jPanelAddEstuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddEstuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAddEstuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanelAddEstuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGradoEstu, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreCompletoEstu, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelAddEstuLayout.setVerticalGroup(
            jPanelAddEstuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddEstuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAddEstuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreCompletoEstu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanelAddEstuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtGradoEstu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanelAddEstu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 380, 130));

        jPanelEliModiEstu.setBackground(new java.awt.Color(222, 243, 252));
        jPanelEliModiEstu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Eliminar/Modificar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jTableListaEstu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableListaEstu);

        javax.swing.GroupLayout jPanelEliModiEstuLayout = new javax.swing.GroupLayout(jPanelEliModiEstu);
        jPanelEliModiEstu.setLayout(jPanelEliModiEstuLayout);
        jPanelEliModiEstuLayout.setHorizontalGroup(
            jPanelEliModiEstuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEliModiEstuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelEliModiEstuLayout.setVerticalGroup(
            jPanelEliModiEstuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelEliModiEstu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 240));

        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar.png"))); // NOI18N
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 60, 50));

        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Editar.png"))); // NOI18N
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 60, 50));

        jButtonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Volver.png"))); // NOI18N
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 60, 50));

        jButtonAñadirEstu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.png"))); // NOI18N
        jButtonAñadirEstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirEstuActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAñadirEstu, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 52, 46));

        jButtonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar.png"))); // NOI18N
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 50, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoGestionEstu.jpg"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 2, true));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreCompletoEstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCompletoEstuActionPerformed
        txtNombreCompletoEstu.transferFocus();
    }//GEN-LAST:event_txtNombreCompletoEstuActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed

        dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonAñadirEstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirEstuActionPerformed

        try {
            PreparedStatement ps = cn.prepareStatement("INSERT INTO rafalee_bd.estudiante(nombre_completo,grado) VALUES (?,?)");
            ps.setString(1, txtNombreCompletoEstu.getText());
            ps.setString(2, txtGradoEstu.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Estudiante registrado");
            mostrarTabla();
        } catch (SQLException ex) {
            Logger.getLogger(GestionarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButtonAñadirEstuActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed

        int filaseleccionada;

        try {
            filaseleccionada = jTableListaEstu.getSelectedRow();
            if (filaseleccionada == -1) {
                JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
            } else {
                DefaultTableModel modelotabla = (DefaultTableModel) jTableListaEstu.getModel();
                String codigo = (String) modelotabla.getValueAt(filaseleccionada, 0);
                String nombre = (String) modelotabla.getValueAt(filaseleccionada, 1);
                String apellido = (String) modelotabla.getValueAt(filaseleccionada, 2);
                idEstudiante = codigo;
                txtNombreCompletoEstu.setText(nombre);
                txtGradoEstu.setText(apellido);

            }
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex + "\nInténtelo nuevamente", " .::Error En la Operacion::.", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed

        int fila = jTableListaEstu.getSelectedRow();
        String valor = jTableListaEstu.getValueAt(fila, 0).toString();
        if (fila >= 0) {
            try {
                PreparedStatement ps = cn.prepareStatement("DELETE FROM rafalee_bd.estudiante WHERE idEstudiante='" + valor + "'");
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Estudiante eliminado");
                mostrarTabla();
            } catch (SQLException ex) {
                Logger.getLogger(GestionarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
//        if (idEstudiante.isEmpty()) {
//            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun estudiante para eliminar");
//        }else{
//            metodobd.Eliminar(idEstudiante);
//        }

    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void txtNombreCompletoEstuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreCompletoEstuKeyTyped

    }//GEN-LAST:event_txtNombreCompletoEstuKeyTyped

    private void txtGradoEstuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGradoEstuKeyTyped
        char v = evt.getKeyChar();
        if (v < '0' || v > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtGradoEstuKeyTyped

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed

        if (idEstudiante.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Dede seleccionar un estudiante de la tabla para modificar");
        } else {
            metodobd.Actualizar(txtNombreCompletoEstu.getText(), txtGradoEstu.getText(), idEstudiante);
            mostrarTabla();
            limpiar();
        }
    }//GEN-LAST:event_jButtonActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(GestionarEstudiante.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarEstudiante.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarEstudiante.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarEstudiante.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonAñadirEstu;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonVolver;
    public static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanelAddEstu;
    private javax.swing.JPanel jPanelEliModiEstu;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTableListaEstu;
    private javax.swing.JTextField txtGradoEstu;
    private javax.swing.JTextField txtNombreCompletoEstu;
    // End of variables declaration//GEN-END:variables
}
