/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import GUI.Login;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class MetodosLogin {

    Pool metodospool = new Pool();

    public int validar_ingreso() {
        String usuario = Login.jTextFieldUsuario.getText();
        String clave = String.valueOf(Login.jPasswordField1.getPassword());
        int resultado = 0;
        String SSQL = "SELECT * FROM rafalee_bd.docente WHERE nombre_usuario='" + usuario + "' AND clave='" + clave + "'";
        Connection conect = null;
        try {
            conect = metodospool.dataSource.getConnection();
            Statement st = conect.createStatement();
            ResultSet rs = st.executeQuery(SSQL);
            if (rs.next()) {
                resultado = 1;
                System.out.println("entro a la conexión");
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

}
