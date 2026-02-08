/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T01_EJ01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Clase que convierte objetos a bytes y los escribe en un archivo
 *
 * @author anaranjo
 */
public class PersonaSerializada {

    public static void main(String[] args) {

        String archivo = "persona.dat";
        Persona p = new Persona("Juan", 25);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {

            oos.writeObject(p);
            System.out.println("Datos serializados en fichero: " + archivo);

        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
