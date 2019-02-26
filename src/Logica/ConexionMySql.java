/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres Mancilla Oliver
 * @author Andres Felipe Otalvaro
 *
 * Clase que se encargara de realizar la conexión entre la aplicación y la base
 * de datos.
 *
 */
public class ConexionMySql {

    public String BD = "rafalee_bd";
//    public String url = "jdbc:mysql://localhost/" + BD;
//    public String usuario = "root";
//    public String clave = "";
    public String url = "jdbc:mysql://10.10.0.2/" + BD;
    public String usuario = "rafaLeeBD";
    public String clave = "1234";

    /*
    * Metodo encargado de crear la conexión con sus respectivos parametros (nombre, contraseña)
    * ya establecidos.
     */
    public Connection Conectar() {
        Connection conect = null;
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            conect = DriverManager.getConnection(this.url, this.usuario, this.clave);
        } catch (Exception e) {

        }
        return conect;
    }

    public void cerrarConexion() {
        try {
            Conectar().close();
        } catch (SQLException ex) {

        }
    }
}
