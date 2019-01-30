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
    public String url = "jdbc:mysql://localhost/" + BD;
    public String usuario = "andres";
    public String clave = "0702";
//    public String url = "jdbc:mysql://10.10.0.2/" + BD;
//    public String usuario = "rafaleePensil";
//    public String clave = "1234";

    /*
    * Metodo encargado de crear la conexión con sus respectivos parametros (nombre, contraseña)
    * ya establecidos.
     */
    public Connection Conectar() {
        Connection link = null;
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            link = DriverManager.getConnection(this.url, this.usuario, this.clave);
        } catch (Exception e) {

        }
        return link;
    }

    PreparedStatement Conectar(String select_archivopdf_FROM_pdf_WHERE_codigopd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
