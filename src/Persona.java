/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin1
 */
public abstract class Persona implements Hablador{
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    
    
    @Override
    public void hablar() {
       
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nEdad: " + edad;
    }
    
    
}
