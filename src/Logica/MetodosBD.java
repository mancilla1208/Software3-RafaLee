/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import GUI.Docente;
import static GUI.Docente.jLabel_NombreDocente;
import static GUI.Docente.jTextField_GradoActividad;
import static GUI.Docente.jTextField_NombreActivi;
import GUI.Estudiante;
import GUI.GestionarEstudiante;
import static GUI.GestionarEstudiante.jTableListaEstu;
import static GUI.GestionarEstudiante.txtGradoEstu;
import static GUI.GestionarEstudiante.txtNombreCompletoEstu;
import GUI.ListaEstudiantes;
import static GUI.ListaEstudiantes.jComboBoxListaEstu;
import GUI.Login;
import GUI.Principal;
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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andres Mancilla Oliver
 * @author Andres Felipe Otalvaro
 *
 * Clase que contiene los metodos basicos para insertar, eliminar y modificar
 * estudiantes de la lista y base de datos.
 */
public class MetodosBD {

    MetodosLogica logica = new MetodosLogica(this);
    ConexionMySql con = new ConexionMySql();
    Connection cn = con.Conectar();
    String SQL_GradoEstu = "";
    String gradoEstudiante = "";
    String idDocente = "";
    String idEstudiante = "";
    String idActividad = "";

    private static ListaEstudiantes listaEstudiantes;
    private static Docente docente;
    private static Estudiante estudiante;
    private static Login login;
    private static GestionarEstudiante gestion;

    public MetodosBD(GestionarEstudiante gestion) {
        this.gestion = gestion;
    }

    public MetodosBD(Login login) {
        this.login = login;
    }

    public MetodosBD() {
    }

    public MetodosBD(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public MetodosBD(Docente docente) {
        this.docente = docente;
    }

    /*
    * Metodo encargado de actualizar los datos del estudiante seleccionado 
    * en la lista y base de datos.
     */
    public void Actualizar(String nombreCompleto, String grado, String idEstudiante) {

        Connection conexion = null;
        try {
            conexion = con.Conectar();
            String SQL_actualizar = "UPDATE rafalee_bd.estudiante SET nombre_completo=?, grado=? WHERE idEstudiante=?";

            PreparedStatement ps = conexion.prepareStatement(SQL_actualizar);
            ps.setString(1, nombreCompleto);
            ps.setString(2, grado);
            ps.setString(3, idEstudiante);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Estudiante modificado", "", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar estudiante", "", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {

        } finally {
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al cerrar conexion", "", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

    }

    /*
    * Metodo encargado de eliminar un estudiante seleccionado en la lista y base de datos.
     */
    public void Eliminar(String id) {
        Connection conexion = null;
        PreparedStatement ps = null;
        try {
            String sql = "DELETE FROM rafalee_bd.estudiante WHERE idEstudiante=?";
            conexion = con.Conectar();
            ps = conexion.prepareStatement(sql);
            ps.setString(1, id);
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Se ha eliminado de forma exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "No se ha podido eliminar el registro");
            }

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "No se ha podido eliminar el registro");
        } finally {
            if (conexion != null && ps != null) {
                try {
                    conexion.close();
                    ps.close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Se produjo un error al cerrar la conexion");
                }
            }
        }

    }

    /**
     * Metodo que se encarga de realizar la inserción de un estudiante a la
     * lista por parte del docente
     */
    public void agregarEstudiante() {

        try {
            PreparedStatement ps = cn.prepareStatement("INSERT INTO rafalee_bd.estudiante(nombre_completo,grado) VALUES (?,?)");
            ps.setString(1, txtNombreCompletoEstu.getText());
            ps.setString(2, txtGradoEstu.getText());
            int res = ps.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Estudiante registrado");
                listaEstudiantesGestionDoce();
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar estudiante");
                listaEstudiantesGestionDoce();
            }
            cn.close();

        } catch (SQLException ex) {
            Logger.getLogger(GestionarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Metodo que se encarga de editar un estudiante seleccionado por el docente
     * para modificar alguno de sus datos
     */
    public void eliminarEstudiante() {
        int fila = gestion.jTableListaEstu.getSelectedRow();

        try {
            if (fila == -1) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar el estudiante a eliminar");
            } else {
                String valor = gestion.jTableListaEstu.getValueAt(fila, 0).toString();
                PreparedStatement ps = cn.prepareStatement("DELETE FROM rafalee_bd.estudiante WHERE idEstudiante='" + valor + "'");
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Estudiante eliminado");
                listaEstudiantesGestionDoce();
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestionarEstudiante.class.getName()).log(Level.SEVERE, null, ex);

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
        Statement st = null;
        ResultSet rs = null;

        try {
            conect = con.Conectar();
            st = conect.createStatement();
            rs = st.executeQuery(SSQL);
            if (rs.next()) {
                resultado = 1;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error de conexión", JOptionPane.ERROR_MESSAGE);
        } finally {
            if (st != null && rs != null) {
                try {
                    st.close();
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MetodosBD.class.getName()).log(Level.SEVERE, null, ex);
                }
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
        Statement st = null;
        ResultSet rs1 = null;

        try {
            conect = con.Conectar();
            st = conect.createStatement();
            rs1 = st.executeQuery(SSQL1);
            if (rs1.next()) {
                variableNombreDocente = rs1.getString(2);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error de conexión", JOptionPane.ERROR_MESSAGE);
        } finally {
            if (st != null && rs1 != null) {
                try {
                    st.close();
                    rs1.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MetodosBD.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
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
            Statement st = null;
            ResultSet rs = null;
            try {

                st = cn.createStatement();
                rs = st.executeQuery(consultas[i]);
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
                Logger.getLogger(MetodosBD.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    /**
     * Metodo encargado de obtener el id del docente que se encuentra logueado
     * en la aplicación en ese intante.
     */
    public void obtenerIdDocente() {
        //Consulta SQL que se encarga de obtener el id del docente que se encuentra logueado en ese momento
        String SSQL1 = "SELECT d.idDocente FROM rafalee_bd.docente d WHERE nombre_completo='" + docente.jLabel_NombreDocente.getText() + "'";
        Connection cn = null;

        System.out.println("nombre doce " + docente.jLabel_NombreDocente.getText());
        try {
            cn = con.Conectar();
            Statement st = cn.createStatement();
            ResultSet rs1 = st.executeQuery(SSQL1);
            if (rs1.next()) {
                idDocente = rs1.getString(1);
                System.out.println("id docente " + idDocente);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error de conexion", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Metodo encargado de crear la actividad en la base de datos y asignarla al
     * docente que esta en sesión en ese momento
     */
    public void crearActividad() {
        //Consulta SQL que se encarga de crear la actividad
        System.out.println("id docente " + idDocente);
        try {
            PreparedStatement ps = cn.prepareStatement("INSERT INTO rafalee_bd.actividad (nombre,grado,id_Docente1) VALUES (?,?,?)");
            ps.setString(1, Docente.jTextField_NombreActivi.getText());
            ps.setString(2, Docente.jTextField_GradoActividad.getText());
            ps.setString(3, idDocente);
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(GestionarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void obtenerIdActividad() {
        //Consulta SQL que se encarga de obtener el id de la actividad creada en ese intante
        String SqlID = "SELECT a.idActividad FROM rafalee_bd.actividad a WHERE nombre='" + docente.jTextField_NombreActivi.getText() + "'";
        //String SSQL1 = "SELECT d.idDocente FROM rafalee_bd.docente d WHERE nombre_completo='" + Docente.jLabel_NombreDocente.getText() + "'";

        System.out.println("Nombre actividad " + docente.jTextField_NombreActivi.getText());
        try {
            cn = con.Conectar();
            Statement st = cn.createStatement();
            ResultSet rs1 = st.executeQuery(SqlID);
            if (rs1.next()) {
                idActividad = rs1.getString(1);
                System.out.println("Id de la actividad " + idActividad);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error de conexión", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void guardarPregunta() {

        if (Docente.jComboBox_TipoPreguntas.getSelectedItem().toString().equals("Icfes")) {

            try {
                PreparedStatement ps = cn.prepareStatement("INSERT INTO rafalee_bd.tipo_icfes(enunciado,respuesta1,respuesta2,respuesta3,respuesta4,id_Actividad3) VALUES (?,?,?,?,?,?)");
                ps.setString(1, Docente.jTextAreaPregunta.getText());
                ps.setString(2, Docente.jTextFieldRespuesta1.getText());
                ps.setString(3, Docente.jTextFieldRespuesta2.getText());
                ps.setString(4, Docente.jTextFieldRespuesta3.getText());
                ps.setString(5, Docente.jTextFieldRespuesta4.getText());
                ps.setString(6, idActividad);
                ps.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(GestionarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    cn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Docente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
        if (Docente.jComboBox_TipoPreguntas.getSelectedItem().toString().equals("Abierta")) {
            try {
                PreparedStatement ps = cn.prepareStatement("INSERT INTO rafalee_bd.tipo_abierta(enunciado,id_Actividad) VALUES (?,?)");
                ps.setString(1, Docente.jTextAreaPregunta.getText());
                ps.setString(2, idActividad);
                ps.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(GestionarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    cn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Docente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }

    public String obtenerGradoEstudiante() {
        // Codigo para obtener el grado del estudiante y redireccionarlo a su perfil o grado correspondiente
        SQL_GradoEstu = "SELECT e.grado FROM rafalee_bd.estudiante e WHERE nombre_completo='" + ListaEstudiantes.jComboBoxListaEstu.getSelectedItem().toString() + "'";
        Connection conect = null;

        try {
            System.out.println("Aqui " + ListaEstudiantes.jComboBoxListaEstu.getSelectedItem().toString());
            cn = con.Conectar();
            Statement st = cn.createStatement();
            ResultSet rs1 = st.executeQuery(SQL_GradoEstu);
            if (rs1.next()) {
                gradoEstudiante = rs1.getString(1);
                System.out.println("Grado de " + ListaEstudiantes.jComboBoxListaEstu.getSelectedItem().toString() + " es " + gradoEstudiante);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error de conexión", JOptionPane.ERROR_MESSAGE);
        }
        return gradoEstudiante;

    }

    public void cargarActividadesEstudiante() {

        obtenerGradoEstudiante();
        DefaultListModel listaActividades = new DefaultListModel();
        String SQL = "SELECT a.nombre FROM rafalee_bd.actividad a WHERE grado='" + gradoEstudiante + "'";

        try {
            cn = con.Conectar();
            Statement st = cn.createStatement();
            ResultSet rs1 = st.executeQuery(SQL);
            while (rs1.next()) {
                listaActividades.addElement(rs1.getString(1));
                Estudiante.jList_Actividades.setModel(listaActividades);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error de conexión", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void cargarListaEstudiantes() {
        String sql = "SELECT * FROM rafalee_bd.estudiante";
        try {
            cn = con.Conectar();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                listaEstudiantes.jComboBoxListaEstu.addItem(rs.getString("nombre_completo"));

            }

        } catch (SQLException ex) {
            Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*
    * Metodo encargado de crear la tabla con sus respectivas columnas y la consulta
    * para que muestre los estudiantes que se encuentran registrados en la base de datos.
     */
    public void listaEstudiantesGestionDoce() {

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Grado");
        gestion.jTableListaEstu.setModel(modelo);

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
            gestion.jTableListaEstu.setModel(modelo);

        } catch (SQLException ex) {
            Logger.getLogger(GestionarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
