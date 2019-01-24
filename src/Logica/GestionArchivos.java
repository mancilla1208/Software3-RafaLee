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
 * @author Andres Mancilla Oliver
 * @author Andres Felipe Otalvaro
 *
 * Clase que contiene los metodos para la gestion de archivos en la aplicación.
 *
 */
public class GestionArchivos {

    FileInputStream entrada;
    FileOutputStream salida;
    File archivo;

    public GestionArchivos() {

    }

    /*Metodo para abrir un archivo de texto*/
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

    /*Metodo para abrir una imagen*/
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
