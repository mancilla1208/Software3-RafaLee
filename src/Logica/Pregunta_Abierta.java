/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Andres Mancilla
 */
public class Pregunta_Abierta extends Pregunta {

    private String respuesta;

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getEnumciado() {
        return enumciado;
    }

    public void setEnumciado(String enumciado) {
        this.enumciado = enumciado;
    }

    public int getNum_pregunta() {
        return num_pregunta;
    }

    public void setNum_pregunta(int num_pregunta) {
        this.num_pregunta = num_pregunta;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public Pregunta_Abierta(String respuesta, String enumciado, int num_pregunta, int documento) {
        super(enumciado, num_pregunta, documento);
        this.respuesta = respuesta;
    }

}
