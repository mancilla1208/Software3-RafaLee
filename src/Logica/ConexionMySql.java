/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres Mancilla
 *
 * Clase que se encargara de realizar la conexión entre la aplicación y la base
 * de datos.
 *
 */
public class ConexionMySql {

    public String BD = "RafaLee_BD";
    public String url = "jdbc:mysql://localhost/" + BD;
    public String usuario = "andres";
    public String contraseña = "0702";

    public Connection Conectar() {
        Connection link = null;
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            link = DriverManager.getConnection(this.url, this.usuario, this.contraseña);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return link;
    }
}
