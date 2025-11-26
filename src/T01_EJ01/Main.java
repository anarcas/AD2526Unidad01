/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T01_EJ01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author anaranjo
 */
public class Main {

    public static void main(String[] args) {
        FileOutputStream fileOut = null;

        try {
            // --- PARTE 1: SERIALIZACIÓN (Escritura del objeto al archivo) ---

            // 1. Crear el objeto de la clase Persona
            Persona p = new Persona("Juan", 25);

            // 2. Crear el FileOutputStream (apunta al archivo, creando "persona.ser")
            fileOut = new FileOutputStream("persona.ser");

            // 3. Envolverlo con ObjectOutputStream (para manejar objetos)
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            // 4. Escribir el objeto al fichero (Serialización)
            out.writeObject(p);

            // 5. Cerrar recursos
            out.close();
            fileOut.close();
            System.out.println("Datos serializados en fichero: persona.ser");

            // --- PARTE 2: DESERIALIZACIÓN (Lectura del objeto desde el archivo) ---
            // 1. Deserializar, abrir el archivo para lectura
            FileInputStream fileIn = new FileInputStream("persona.ser");

            // 2. Envolverlo con ObjectInputStream
            ObjectInputStream in = new ObjectInputStream(fileIn);

            // 3. Leer el objeto desde el fichero (Deserialización)
            // Es necesario hacer un casting explícito [10]
            Persona personaRecuperada = (Persona) in.readObject();

            // 4. Escribir por consola los datos leídos
            System.out.println(String.format("Recuperado de fichero --> El nombre de la persona es %s y tiene %d años.",personaRecuperada.getNombre(),personaRecuperada.getEdad()));

            // 5. Cerrar los recursos
            in.close();

            // Manejo de excepciones (IOException y ClassNotFoundException)
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex.getCause());
        } finally {
            // Bloque para asegurar el cierre del flujo de salida si está abierto
            try {
                if (fileOut != null) {
                    fileOut.close();
                }
            } catch (IOException ex) {

                System.err.println(ex.getCause());
            }
        }
    }
}
