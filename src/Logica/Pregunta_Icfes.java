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
public class Pregunta_Icfes {

    private String res_opcion_A;
    private String res_opcion_B;
    private String res_opcion_C;
    private String res_opcion_D;

    public Pregunta_Icfes(String res_opcion_A, String res_opcion_B, String res_opcion_C, String res_opcion_D) {
        super();
        this.res_opcion_A = res_opcion_A;
        this.res_opcion_B = res_opcion_B;
        this.res_opcion_C = res_opcion_C;
        this.res_opcion_D = res_opcion_D;
    }

    public String getRes_opcion_A() {
        return res_opcion_A;
    }

    public void setRes_opcion_A(String res_opcion_A) {
        this.res_opcion_A = res_opcion_A;
    }

    public String getRes_opcion_B() {
        return res_opcion_B;
    }

    public void setRes_opcion_B(String res_opcion_B) {
        this.res_opcion_B = res_opcion_B;
    }

    public String getRes_opcion_C() {
        return res_opcion_C;
    }

    public void setRes_opcion_C(String res_opcion_C) {
        this.res_opcion_C = res_opcion_C;
    }

    public String getRes_opcion_D() {
        return res_opcion_D;
    }

    public void setRes_opcion_D(String res_opcion_D) {
        this.res_opcion_D = res_opcion_D;
    }

}
