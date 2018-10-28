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
public class Actividad {

    private String nombre;
    private String archivo_general;
    private String num_preguntas;
    private String grado;

    public Actividad(String nombre, String archivo_general, String num_preguntas, String grado) {
        super();
        this.nombre = nombre;
        this.archivo_general = archivo_general;
        this.num_preguntas = num_preguntas;
        this.grado = grado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArchivo_general() {
        return archivo_general;
    }

    public void setArchivo_general(String archivo_general) {
        this.archivo_general = archivo_general;
    }

    public String getNum_preguntas() {
        return num_preguntas;
    }

    public void setNum_preguntas(String num_preguntas) {
        this.num_preguntas = num_preguntas;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

}
