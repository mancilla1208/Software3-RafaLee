/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import GUI.Docente;
import static GUI.Docente.*;
import GUI.GestionarEstudiante;
import static GUI.GestionarEstudiante.*;
import GUI.Login;
import GUI.Principal;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class MetodosLogica {

    private static Docente docente;
    private static GestionarEstudiante gestion;

    public MetodosLogica(Docente docente) {
        this.docente = docente;
    }
    public MetodosLogica(GestionarEstudiante gestion) {
        this.gestion = gestion;
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
