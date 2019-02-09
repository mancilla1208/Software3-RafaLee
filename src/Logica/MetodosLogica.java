/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import GUI.*;
import static GUI.Docente.*;
import static GUI.GestionarEstudiante.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
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

    public MetodosLogica(Docente docente) {
        this.docente = docente;
    }

    public MetodosLogica(GestionarEstudiante gestion) {
        this.gestionEstudiante = gestion;
    }

    public MetodosLogica(Login login) {
        this.login = login;
    }

    public MetodosLogica(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public MetodosLogica(RegistroDocente registroDocente) {
        this.registroDoce = registroDocente;
    }

    public void limpiarCamposCrearActi() {
        jTextField_NombreActivi.setText("");
        jTextField_GradoActividad.setText("");
    }

    public void limpiarCamposGEstudiantes() {
        txtNombreCompletoEstu.setText("");
        txtGradoEstu.setText("");
    }

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

}
