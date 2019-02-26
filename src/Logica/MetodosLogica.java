/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import GUI.*;
import static GUI.Docente.*;
import static GUI.GestionarEstudiante.*;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class MetodosLogica {

    private static Docente docente;
    private static GestionarEstudiante gestionEstudiante;
    private static Login login;
    private static Estudiante estudiante;
    private static RegistroDocente registroDoce;
    private static MetodosBD metodosBD;

    JFileChooser seleccionado = new JFileChooser();
    File archivo;
    byte[] bytesImg;
    GestionArchivos gestion = new GestionArchivos();

    /**
     * Metodo constructor que se encargara de enviar los datos a la entidad
     * docente
     *
     * @param docente
     */
    public MetodosLogica(Docente docente) {
        this.docente = docente;
    }

    /**
     * Metodo constructor que se encargara de enviar los datos a la entidad
     * MetodosBD donde se encuentra todo el manejo de consultas MySql
     *
     * @param metodosBD
     */
    public MetodosLogica(MetodosBD metodosBD) {
        this.metodosBD = metodosBD;
    }

    /**
     * Metodo constructor que se encargara de enviar los datos a la entidad
     * gestion que se encarga de gestionar todos los datos del estudiante
     *
     * @param gestion
     */
    public MetodosLogica(GestionarEstudiante gestion) {
        this.gestionEstudiante = gestion;
    }

    /**
     * Metodo constructor que se encargara de enviar los datos a la entidad
     * login, en la cual valida entrada del docente a la aplicación
     *
     * @param login
     */
    public MetodosLogica(Login login) {
        this.login = login;
    }

    /**
     * Metodo constructor que se encargara de enviar los datos a la entidad
     * estudiante
     *
     * @param estudiante
     */
    public MetodosLogica(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    /**
     * Metodo constructor que se encargara de enviar los datos a la entidad
     * registroDocente para realizar el ingreso de nuevos docentes y sus perfles
     * a la platafoma
     *
     * @param registroDocente
     */
    public MetodosLogica(RegistroDocente registroDocente) {
        this.registroDoce = registroDocente;
    }

    /**
     * Metodo que se encarga de limpiar los campos en la ventada de docente al
     * momento de crear una actividad
     *
     */
    public void limpiarCamposCrearActi() {
        docente.jTextField_NombreActivi.setText("");
        docente.jTextField_GradoActividad.setText("");
    }

    /**
     * Metodo que se encarga de limpiar los campos en la ventada de gestion de
     * estudiantes la cual la administra el docente.
     *
     */
    public void limpiarCamposGEstudiantes() {
        GestionarEstudiante.txtNombreCompletoEstu.setText("");
        GestionarEstudiante.txtGradoEstu.setText("");
    }

    /**
     * Metodo que se encarga de limpiar los campos en la pregunta en la interfaz
     * del docente al momento de crear la actividad
     *
     */
    public void limpiarCamposPregunta() {
        if (Docente.jComboBox_TipoPreguntas.getSelectedItem().toString().equals("Icfes")) {
            docente.jTextAreaPregunta.setText("");
            docente.jTextFieldRespuesta1.setText("");
            docente.jTextFieldRespuesta2.setText("");
            docente.jTextFieldRespuesta3.setText("");
            docente.jTextFieldRespuesta4.setText("");
        } else if (Docente.jComboBox_TipoPreguntas.getSelectedItem().toString().equals("Abierta")) {
            docente.jTextAreaPregunta.setText("");
            docente.jTextAreaRespuesta.setText("");
        }

    }

    /**
     * Metodo que se encarga de permitir cargar y almacenar archivos, ya sean
     * imagenes o documentos de texto en cualquier formato
     *
     */
    public void cargarArchivoGeneral() {
        if (seleccionado.showDialog(null, "ABRIR ARCHIVO") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionado.getSelectedFile();
            if (archivo.canRead()) {
                if (archivo.getName().endsWith("txt") || archivo.getName().endsWith("doc") || archivo.getName().endsWith("pdf")) {
                    String contenido = gestion.AbrirATexto(archivo);
                    docente.jLabelNombreArchivoGeneral.setText(archivo.getName());
                } else {
                    if (archivo.getName().endsWith("jpg") || archivo.getName().endsWith("png") || archivo.getName().endsWith("gif") || archivo.getName().endsWith("jpeg")) {
                        bytesImg = gestion.AbrirAImagen(archivo);
                        jLabelNombreArchivoGeneral.setText(archivo.getName());

                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor seleccione un archivo de texto o de imagen.");
                    }
                }
            }
        }
    }

    /**
     * Metodo que se encarga de permitir cargar y almacenar archivos, ya sean
     * imagenes o documentos de texto en cualquier formato
     *
     */
    public void cargarArchivoPregunta() {
        if (seleccionado.showDialog(null, "ABRIR ARCHIVO") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionado.getSelectedFile();
            if (archivo.canRead()) {
                if (archivo.getName().endsWith("txt") || archivo.getName().endsWith("doc") || archivo.getName().endsWith("pdf")) {
                    String contenido = gestion.AbrirATexto(archivo);
                    docente.jLabelNombreArchivoPre.setText(archivo.getName());
                } else {
                    if (archivo.getName().endsWith("jpg") || archivo.getName().endsWith("png") || archivo.getName().endsWith("gif") || archivo.getName().endsWith("jpeg")) {
                        bytesImg = gestion.AbrirAImagen(archivo);
                        docente.jLabelNombreArchivoPre.setText(archivo.getName());

                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor seleccione un archivo de texto o de imagen.");
                    }
                }
            }
        }
    }

    /**
     * Metodo que se encarga de hacer la transición de la ventana docente al
     * inicio de la aplicación
     *
     */
    public static void irDeDocente_Inicio() {

        int seleccion = JOptionPane.showOptionDialog(
                null, // Componente padre
                "Esta seguro que desea salir.?", //Mensaje
                "Seleccione una opción", // Título
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, // null para icono por defecto.
                new Object[]{"Si", "No"}, // null para YES, NO y CANCEL
                "Si");

        if (seleccion == JOptionPane.YES_OPTION) {
            docente.dispose();
            Principal.jbDocente.setVisible(true);
            Principal.jbEstudiante.setVisible(true);
            Principal.jLabelBienvenidos.setVisible(true);
            Principal.jLabelDocente.setVisible(true);
            Principal.jLabelEstudiante.setVisible(true);
        } else {

        }
    }

    /**
     * Metodo que se encarga de añadir los tipo de preguntas a la actividad a
     * realizar
     *
     */
    public void añadirTipoPregunta() {
        if (docente.jComboBox_TipoPreguntas.getSelectedItem() == "Icfes") {
            docente.jTextAreaRespuesta.setVisible(false);
            docente.jScrollPaneRespuesta.setVisible(false);

            docente.jLabelPreguntaA.setVisible(true);
            docente.jLabelPreguntaB.setVisible(true);
            docente.jLabelPreguntaC.setVisible(true);
            docente.jLabelPreguntaD.setVisible(true);

            docente.jTextFieldRespuesta1.setVisible(true);
            docente.jTextFieldRespuesta2.setVisible(true);
            docente.jTextFieldRespuesta3.setVisible(true);
            docente.jTextFieldRespuesta4.setVisible(true);

            docente.jButtonCargarPre.setVisible(true);
            docente.jLabelNombreArchivoPre.setVisible(true);

        } else if (docente.jComboBox_TipoPreguntas.getSelectedItem() == "Abierta") {

            docente.jTextAreaRespuesta.setVisible(true);
            docente.jScrollPaneRespuesta.setVisible(true);

            docente.jLabelPreguntaA.setVisible(false);
            docente.jLabelPreguntaB.setVisible(false);
            docente.jLabelPreguntaC.setVisible(false);
            docente.jLabelPreguntaD.setVisible(false);

            jTextFieldRespuesta1.setVisible(false);
            jTextFieldRespuesta2.setVisible(false);
            jTextFieldRespuesta3.setVisible(false);
            jTextFieldRespuesta4.setVisible(false);

            docente.jButtonCargarPre.setVisible(true);
            docente.jLabelNombreArchivoPre.setVisible(true);

        } else if (docente.jComboBox_TipoPreguntas.getSelectedItem() == "Completar") {

        }
    }
}
