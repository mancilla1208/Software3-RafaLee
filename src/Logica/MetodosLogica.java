/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import static GUI.Docente.*;
import static GUI.GestionarEstudiante.*;

/**
 *
 * @author andre
 */
public class MetodosLogica {

    public void limpiarCamposCrearActi() {
        jTextField_NombreActivi.setText("");
        jTextField_GradoActividad.setText("");
    }

    public void limpiarCamposGEstudiantes() {
        txtNombreCompletoEstu.setText("");
        txtGradoEstu.setText("");
    }

}
