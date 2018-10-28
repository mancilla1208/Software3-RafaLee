/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author andre
 */
public class Reporte {

    private String resultado_pruebas;
    private String estadistica_resultados;

    public Reporte(String resultado_pruebas, String estadistica_resultados) {
        super();
        this.resultado_pruebas = resultado_pruebas;
        this.estadistica_resultados = estadistica_resultados;
    }

    public String getResultado_pruebas() {
        return resultado_pruebas;
    }

    public void setResultado_pruebas(String resultado_pruebas) {
        this.resultado_pruebas = resultado_pruebas;
    }

    public String getEstadistica_resultados() {
        return estadistica_resultados;
    }

    public void setEstadistica_resultados(String estadistica_resultados) {
        this.estadistica_resultados = estadistica_resultados;
    }

}
