/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T01_EJ01;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author anaranjo
 */
public class EscribirTXT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String archivo = "saludo.txt";
        String pregunta = "Línea 1 pregunta: Hola qué tal, cómo estás?";
        String respuesta = "Linea 2 responde: Hola, bien gracias!!";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            
            // Primera línea
            bw.write(pregunta);
            // Salto de línea o salto de carro
            bw.newLine();
            // Segunda línea
            bw.write(respuesta);

        } catch (FileNotFoundException e1) {
            System.out.println(e1.getMessage());
        } catch (IOException e2) {
            System.out.println(e2.getMessage());
        }
    }
}
