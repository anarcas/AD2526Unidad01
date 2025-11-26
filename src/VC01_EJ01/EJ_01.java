/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VC01_EJ01;

import java.io.*;

/**
 *
 * @author anaranjo
 */
public class EJ_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        // Declaración e instanciación de variables/objetos
        // El objeto File no es físicamente un fichero o directorio en sí sino un espación de memoria que apunta a ese fichero o directorio
        File archivo = new File("hola");
        //File archivo = new File("adios/saludo/vecino");

        // Método para obtener la ruta del archivo, devuelve un String
        System.out.println(archivo.getAbsolutePath());
        // Método para comprobar si existe, devuelve un booleano
        System.out.println(archivo.exists());
        // Método para comprobar si es un directorio, devuelve un booleano
        System.out.println(archivo.isDirectory());

        // Método para crear un archivo
//        System.out.println(archivo.createNewFile());
        
        // Método para crear un directorio
//        try {
//            if (archivo.mkdirs()) {
//                System.out.println("El directorio se ha creado correctamente");
//            } else {
//                System.out.println("El directorio NO se ha podido crear");
//            }
//        } catch (Exception ioe) {
//            System.out.println(ioe.getMessage());
//        }
        
        // Método para crear varios directorios de golpe uno dentro de otro
//        try {
//            if (archivo.mkdirs()) {
//                System.out.println("El directorio se ha creado correctamente");
//            } else {
//                System.out.println("El directorio NO se ha podido crear");
//            }
//        } catch (Exception ioe) {
//            System.out.println(ioe.getMessage());
//        }
        
        // Método para borrar un archivo o directorio si no existe nada en su interior, si existe algo dentro de un directorio primero hay que borrar todo su contenido antes de borrar el directorio
        if (archivo.delete()) {
            System.out.println("borrado correctamente");
        } else {
            System.out.println("No se ha podido borrar");
        }

    }

}
