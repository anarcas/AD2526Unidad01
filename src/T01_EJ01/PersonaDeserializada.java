/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T01_EJ01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Clase que convierte bytes almacenados en un archivo en objetos
 *
 * @author anaranjo
 */
public class PersonaDeserializada {

    public static void main(String[] args) {

        String archivo = "persona.dat";
        Persona p;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {

            p = (Persona) ois.readObject();
            System.out.println("Datos deserializados del fichero: " + archivo);
            System.out.println("\tNombre de la persona: " + p.getNombre());
            System.out.println("\tEdad de la persona: " + p.getEdad());

        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
