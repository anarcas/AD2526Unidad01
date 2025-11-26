/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T01_EJ01;
import java.io.Serializable;
/**
 * Clase Persona
 * 
 * @author anaranjo
 */
public class Persona implements Serializable {
    // Es muy recomendado declarar serialVersionUID
    private static final long serialVersionUID = 42L; 
    
    private String nombre;
    private int edad;

    /**
     * Constructor de la clase Persona [8]
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    // Métodos set omitidos por simplicidad
}
