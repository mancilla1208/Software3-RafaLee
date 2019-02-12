/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import GUI.ActividadesResueltas;
import GUI.Docente;
import GUI.Estudiante;
import GUI.GestionarEstudiante;
import static GUI.GestionarEstudiante.txtGradoEstu;
import static GUI.GestionarEstudiante.txtNombreCompletoEstu;
import GUI.ListaEstudiantes;
import GUI.Login;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
    int cont = 0;

    //Arreglos para cargar las preguntas
    ArrayList<String> arregloEnunciadoA = new ArrayList<>();
    ArrayList<String> arregloEnunciadoI = new ArrayList<>();
    ArrayList<String> arregloResp1 = new ArrayList<>();
    ArrayList<String> arregloResp2 = new ArrayList<>();
    ArrayList<String> arregloResp3 = new ArrayList<>();
    ArrayList<String> arregloResp4 = new ArrayList<>();
    public ArrayList<String> IdsAbiertas = new ArrayList<>();
    public ArrayList<String> IdsIcfes = new ArrayList<>();

    private static ListaEstudiantes listaEstudiantes;
    private static Docente docente;
    private static Estudiante estudiante;
    private static ActividadesResueltas actividades;
    private static Login login;
    private static GestionarEstudiante gestion;

    int contador1 = 0;
    int contador2 = 0;

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

    public MetodosBD(ActividadesResueltas actividad) {
        this.actividades = actividad;
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

        try {
            cn = con.Conectar();
            Statement st = cn.createStatement();
            ResultSet rs1 = st.executeQuery(SqlID);
            if (rs1.next()) {
                idActividad = rs1.getString(1);

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
        SQL_GradoEstu = "SELECT e.grado, e.idEstudiante FROM rafalee_bd.estudiante e WHERE nombre_completo='" + ListaEstudiantes.jComboBoxListaEstu.getSelectedItem().toString() + "'";
        Connection conect = null;

        try {
            cn = con.Conectar();
            Statement st = cn.createStatement();
            ResultSet rs1 = st.executeQuery(SQL_GradoEstu);
            if (rs1.next()) {
                gradoEstudiante = rs1.getString(1);
                idEstudiante = rs1.getString(2);

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

    public void consultaActividad() {

        String idActividad1 = "";
        String nombreActividad = estudiante.jList_Actividades.getSelectedValue();
        estudiante.lblActividad.setText(nombreActividad);
        String sql = "SELECT a.idActividad FROM rafalee_bd.actividad a where a.nombre='" + nombreActividad + "' ";

        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                idActividad1 = rs.getString(1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(GestionarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (idActividad1 != null) {
            String sql1 = "SELECT a.enunciado,i.enunciado,i.respuesta1,i.respuesta2,i.respuesta3,i.respuesta4, a.idTipo_Abierta, i.idTipo_Icfes FROM "
                    + "rafalee_bd.tipo_abierta a join rafalee_bd.tipo_icfes i on a.id_Actividad "
                    + "= i.id_Actividad3 where a.id_Actividad =" + idActividad1;

            Statement st1;
            try {
                st1 = cn.createStatement();
                ResultSet rs1 = st1.executeQuery(sql1);

                while (rs1.next()) {

                    estudiante.lblActividad.setVisible(true);
                    estudiante.lblNumeroPregunta.setVisible(true);
                    estudiante.txtAreaPregunta.setVisible(true);
                    estudiante.jScrollPane2.setVisible(true);
                    estudiante.btnSiguiente.setVisible(true);

                    if (rs1.getString(1) != null) {
                        arregloEnunciadoA.add(rs1.getString(1));

                        if (cont == 0) {
                            estudiante.txtRespuesta.setVisible(true);
                            estudiante.txtAreaPregunta.setText(rs1.getString(1));
                            estudiante.rbtnRespuesta1.setVisible(false);
                            estudiante.rbtnRespuesta2.setVisible(false);
                            estudiante.rbtnRespuesta3.setVisible(false);
                            estudiante.rbtnRespuesta4.setVisible(false);

                        }

                    } else {
                        if (rs1.getString(2) != null) {
                            if (cont == 0) {
                                estudiante.txtAreaPregunta.setText(rs1.getString(2));
                                estudiante.rbtnRespuesta1.setVisible(true);
                                estudiante.rbtnRespuesta2.setVisible(true);
                                estudiante.rbtnRespuesta3.setVisible(true);
                                estudiante.rbtnRespuesta4.setVisible(true);

                                estudiante.txtRespuesta.setVisible(false);
                            }
                        }
                    }
                    if (rs1.getString(2) != null) {
                        arregloEnunciadoI.add(rs1.getString(2));

                    }
                    if (rs1.getString(3) != null) {
                        arregloResp1.add(rs1.getString(3));
                        if (cont == 0) {
                            estudiante.rbtnRespuesta1.setText(rs1.getString(3));
                        }
                    }
                    if (rs1.getString(4) != null) {
                        arregloResp2.add(rs1.getString(4));
                        if (cont == 0) {
                            estudiante.rbtnRespuesta2.setText(rs1.getString(4));
                        }
                    }
                    if (rs1.getString(5) != null) {
                        arregloResp3.add(rs1.getString(5));
                        if (cont == 0) {
                            estudiante.rbtnRespuesta3.setText(rs1.getString(5));
                        }
                    }
                    if (rs1.getString(6) != null) {
                        arregloResp4.add(rs1.getString(6));
                        if (cont == 0) {
                            estudiante.rbtnRespuesta4.setText(rs1.getString(6));
                        }
                    }
                    if (rs1.getString(7) != null) {
                        IdsAbiertas.add(rs1.getString(7));

                    }
                    if (rs1.getString(8) != null) {
                        IdsIcfes.add(rs1.getString(8));

                    }
//
                    cont++;

                }

            } catch (SQLException ex) {
                Logger.getLogger(GestionarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        cont = 0;

    }

    public void agregarRespuesta(String enunciado, String respuesta, String tipo) {
        String tip = "";
        String id = "";
        try {
            if (tipo.equals("Icfes")) {
                id = IdsIcfes.get(contador1);
                contador1++;

                PreparedStatement ps = cn.prepareStatement("INSERT INTO rafalee_bd.respuestaicfes(Enunciado,respuestaIcfes,idTipo_Icfes1) VALUES (?,?,?)");
                ps.setString(1, enunciado);
                ps.setString(2, respuesta);
                ps.setString(3, id);

                ps.executeUpdate();

            } else {
                id = IdsAbiertas.get(contador2);
                contador2++;

                PreparedStatement ps = cn.prepareStatement("INSERT INTO rafalee_bd.respuestaabierta(Enunciado,respuestaAbierta,idTipo_Abierta1) VALUES (?,?,?)");
                ps.setString(1, enunciado);
                ps.setString(2, respuesta);
                ps.setString(3, id);

                ps.executeUpdate();

            }

        } catch (SQLException ex) {
            Logger.getLogger(GestionarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al guardar respuesta");
        }

    }

    public void siguientePregunta() {
        int i = 2;
        if (contador2 <= arregloEnunciadoA.size() - 1) {
            estudiante.txtAreaPregunta.setText(arregloEnunciadoA.get(contador2));
            estudiante.txtRespuesta.setVisible(true);

            estudiante.rbtnRespuesta1.setVisible(false);
            estudiante.rbtnRespuesta2.setVisible(false);
            estudiante.rbtnRespuesta3.setVisible(false);
            estudiante.rbtnRespuesta4.setVisible(false);
            estudiante.lblNumeroPregunta.setText("" + i);
            i++;

        } else if (contador1 <= arregloEnunciadoI.size() - 1) {

            estudiante.txtAreaPregunta.setText(arregloEnunciadoI.get(contador1));

            estudiante.txtRespuesta.setVisible(false);
            estudiante.rbtnRespuesta1.setVisible(true);
            estudiante.rbtnRespuesta2.setVisible(true);
            estudiante.rbtnRespuesta3.setVisible(true);
            estudiante.rbtnRespuesta4.setVisible(true);
            estudiante.rbtnRespuesta1.setText(arregloResp1.get(contador1));
            estudiante.rbtnRespuesta2.setText(arregloResp2.get(contador1));
            estudiante.rbtnRespuesta3.setText(arregloResp3.get(contador1));
            estudiante.rbtnRespuesta4.setText(arregloResp4.get(contador1));
            estudiante.lblNumeroPregunta.setText("" + i);
            i++;

        } else {
            estudiante.btnSiguiente.setVisible(false);
            estudiante.jScrollPane2.setVisible(false);
            estudiante.lblActividad.setVisible(false);
            estudiante.lblNumeroPregunta.setVisible(false);
            estudiante.txtAreaPregunta.setVisible(false);
            estudiante.txtRespuesta.setVisible(false);
            estudiante.txtRespuesta.setVisible(false);
            estudiante.rbtnRespuesta1.setVisible(false);
            estudiante.rbtnRespuesta2.setVisible(false);
            estudiante.rbtnRespuesta3.setVisible(false);
            estudiante.rbtnRespuesta4.setVisible(false);
            estudiante.txtRespuesta.setText("");
            JOptionPane.showMessageDialog(null, "Actividad terminada");
            estudiante.jList_Actividades.enable(true);
            convertirPdF();

        }

    }

    public void agregarActividadesRealizadas() {

    }

    public void llenarIntermedia() {
        String SqlID = "SELECT a.idActividad FROM rafalee_bd.actividad a WHERE nombre='" + estudiante.lblActividad.getText() + "'";
        try {
            cn = con.Conectar();
            Statement st = cn.createStatement();
            ResultSet rs1 = st.executeQuery(SqlID);
            if (rs1.next()) {
                idActividad = rs1.getString(1);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error de conexión", JOptionPane.ERROR_MESSAGE);
        }
        try {

            PreparedStatement ps = cn.prepareStatement("INSERT INTO rafalee_bd.estudianteactividad(id_Estudiante,id_Actividad) VALUES (?,?)");
            ps.setString(1, idEstudiante);
            ps.setString(2, idActividad);
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(GestionarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void convertirPdF() {
        JFileChooser archivos = new JFileChooser();
        try {
            File pdf = new File("D:\\Universidad\\Software 3\\ProyectoFinal-RafaLee\\Software3-RafaLee\\src\\archivosPDF\\" + estudiante.lblActividad.getText() + " - " + estudiante.jLabelNombreEstudiante.getText() + ".pdf");
            OutputStream texto = new FileOutputStream(pdf);
            Document doc = new Document();
            PdfWriter.getInstance(doc, texto);
            doc.open();
            doc.add(new Paragraph(estudiante.txtAreaPdf.getText()));
            doc.close();
            texto.close();

        } catch (Exception e) {

        }

    }
}
