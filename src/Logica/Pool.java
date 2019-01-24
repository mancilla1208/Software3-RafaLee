/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;

/**
 *
 * @author andre
 */
public class Pool {

    public DataSource dataSource;
    public String db = "rafalee_bd";
    public String url = "jdbc:mysql://192.168.1.60/" + db;
    public String user = "rafalee";
    public String pass = "1234";

    public Pool() {
        inicializaDataSource();
    }

    private void inicializaDataSource() {
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName("org.gjt.mm.mysql.Driver");
        basicDataSource.setUsername(user);
        basicDataSource.setPassword(pass);
        basicDataSource.setUrl(url);
        basicDataSource.setMaxActive(50);
        dataSource = basicDataSource;
    }

}
