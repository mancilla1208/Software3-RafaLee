/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author andre
 */
public class GestionArchivos {

    FileInputStream entrada;
    FileOutputStream salida;
    File archivo;

    public GestionArchivos() {

    }

    /*Abrir un archivo de texto*/
    public String AbrirATexto(File archivo) {
        String contenido = "";
        try {
            entrada = new FileInputStream(archivo);
            int ascci;
            while ((ascci = entrada.read()) != -1) {
                char carcater = (char) ascci;
                contenido += carcater;
            }
        } catch (Exception e) {
        }
        return contenido;
    }

    /*Abrir una imagen*/
    public byte[] AbrirAImagen(File archivo) {
        byte[] bytesImg = new byte[1024 * 100];
        try {
            entrada = new FileInputStream(archivo);
            entrada.read(bytesImg);
        } catch (Exception e) {
        }
        return bytesImg;
    }

}
