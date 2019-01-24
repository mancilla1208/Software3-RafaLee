/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import GUI.Docente;
import GUI.Login;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres Mancilla Oliver
 * @author Andres Felipe Otalvaro
 *
 * Clase que contiene los metodos para el logueo del docente ya registrado en la
 * aplicación y para obtener el nombre respectivo del docente que inicia sesion
 * para su perfil en la aplicación.
 *
 */
public class MetodosLogin {

    //Pool metodospool = new Pool();
    ConexionMySql cc = new ConexionMySql();

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
            conect = cc.Conectar();
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
            conect = cc.Conectar();
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

}
