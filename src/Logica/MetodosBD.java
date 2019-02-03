/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import GUI.Docente;
import GUI.GestionarEstudiante;
import GUI.Login;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres Mancilla Oliver
 * @author Andres Felipe Otalvaro
 *
 * Clase que contiene los metodos basicos para insertar, eliminar y modificar
 * estudiantes de la lista y base de datos.
 */
public class MetodosBD {

    ConexionMySql con = new ConexionMySql();
    Connection cn = con.Conectar();

    /*
    * Metodo encargado de actualizar los datos del estudiante seleccionado 
    * en la lista y base de datos.
     */
    public void Actualizar(String nombreCompleto, String grado, String idEstudiante) {

        Connection conexion = null;

        try {
            conexion = con.Conectar();
            String sql = "UPDATE rafalee_bd.estudiante SET nombre_completo=?, grado=? WHERE idEstudiante=?";

            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, nombreCompleto);
            ps.setString(2, grado);
            ps.setString(3, idEstudiante);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Datos guardados con exito");
            } else {
                JOptionPane.showMessageDialog(null, "No se han podido actualizar los datos");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se han podido actualizar los datos, error en la operación" + "Error:" + e);
        } finally {
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error al cerrar la conexion" + "Error:" + e);

                }
            }
        }

    }

    /*
    * Metodo encargado de eliminar un estudiante seleccionado en la lista y base de datos.
     */
    public void Eliminar(String id) {
        Connection conexion = null;

        try {

            String sql = "DELETE FROM rafalee_bd.estudiante WHERE idEstudiante=?";
            conexion = con.Conectar();
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, id);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Se ha eliminado de forma exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "No se ha podido eliminar el registro");
            }

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "No se ha podido eliminar el registro");
        } finally {
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Se produjo un error al cerrar la conexion");
                }
            }
        }

    }

    /*
    * Metodo que se encarga de verificar si los datos ingresados del docente son correctos
    * para el inicio de sesion a la aplicación.
     */
    public int validar_ingreso() {
        String usuario = Login.jTextFieldUsuario.getText();
        String clave = String.valueOf(Login.jPasswordField1.getPassword());
        int resultado = 0;
        String SSQL = "SELECT * FROM rafalee_bd.docente WHERE nombre_usuario='" + usuario + "' AND clave='" + clave + "'";
        Connection conect = null;
        try {
            conect = con.Conectar();
            Statement st = conect.createStatement();
            ResultSet rs = st.executeQuery(SSQL);
            if (rs.next()) {
                resultado = 1;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error de conexión", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                conect.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex, "Error de desconexión", JOptionPane.ERROR_MESSAGE);
            }
        }
        return resultado;
    }

    /*
    * Metodo que se encarga de capturar de la base de datos el nombre completo del docente logueado
    * para ubicarlo en su perfil correspondiente.
     */
    public String nombreDocente() {
        String usuario = Login.jTextFieldUsuario.getText();
        String clave = String.valueOf(Login.jPasswordField1.getPassword());
        String variableNombreDocente = "";
        String SSQL1 = "SELECT * FROM rafalee_bd.docente WHERE nombre_usuario='" + usuario + "' AND clave='" + clave + "'";
        Connection conect = null;

        try {
            conect = con.Conectar();
            Statement st = conect.createStatement();
            ResultSet rs1 = st.executeQuery(SSQL1);
            if (rs1.next()) {
                variableNombreDocente = rs1.getString(2);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error de conexión", JOptionPane.ERROR_MESSAGE);
        }
        return variableNombreDocente;
    }

    /**
     * Metodo encargado de cargar cada una de las listaas de actividades en el
     * grado correspondiente
     */
    public void cargarActividades() {

        DefaultListModel ListaG0 = new DefaultListModel();
        DefaultListModel ListaG1 = new DefaultListModel();
        DefaultListModel ListaG2 = new DefaultListModel();
        DefaultListModel ListaG3 = new DefaultListModel();
        DefaultListModel ListaG4 = new DefaultListModel();
        DefaultListModel ListaG5 = new DefaultListModel();

        int[] grados = {0, 1, 2, 3, 4, 5};
        String[] consultas = new String[6];

        for (int i = 0; i < grados.length; i++) {
            String sql = "SELECT a.nombre FROM rafalee_bd.actividad a WHERE grado=" + grados[i] + "";
            consultas[i] = sql;
            Statement st;

            try {
                st = cn.createStatement();
                ResultSet rs = st.executeQuery(consultas[i]);
                while (rs.next()) {
                    if (grados[i] == 0) {
                        ListaG0.addElement(rs.getString(1));
                        Docente.jList_ActividadesG0.setModel(ListaG0);
                    }
                    if (grados[i] == 1) {
                        ListaG1.addElement(rs.getString(1));
                        Docente.jList_ActividadesG1.setModel(ListaG1);
                    }
                    if (grados[i] == 2) {
                        ListaG2.addElement(rs.getString(1));
                        Docente.jList_ActividadesG2.setModel(ListaG2);
                    }
                    if (grados[i] == 3) {
                        ListaG3.addElement(rs.getString(1));
                        Docente.jList_ActividadesG3.setModel(ListaG3);
                    }
                    if (grados[i] == 4) {
                        ListaG4.addElement(rs.getString(1));
                        Docente.jList_ActividadesG4.setModel(ListaG4);
                    }
                    if (grados[i] == 5) {
                        ListaG5.addElement(rs.getString(1));
                        Docente.jList_ActividadesG5.setModel(ListaG5);
                    }

                }

            } catch (SQLException ex) {
                Logger.getLogger(GestionarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
