/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T01_EJ01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author anaranjo
 */
public class LeerTXT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String archivo = "saludo.txt";
        StringBuilder sb = new StringBuilder();
        String linea;

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {

            // Se imprime por consulta la información del archivo
            while ((linea = br.readLine()) != null) {
                sb.append(linea);
                sb.append("\n");
            }
            // Se elimina el último salto de línea
            sb.deleteCharAt(sb.length() - 1);

            System.out.println(sb.toString());

        } catch (FileNotFoundException e1) {
            System.out.println(e1.getMessage());
        } catch (IOException e2) {
            System.out.println(e2.getMessage());
        }
    }
}
