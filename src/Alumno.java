/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin1
 */
public class Alumno extends Persona{
    
    private String carrera;
    private int curso;

    public Alumno(String nombre, int edad, String carrera, int curso) {
        super(nombre,edad);
        this.carrera = carrera;
        this.curso = curso;
    }

   
    public void hablar() {
        System.out.println("Hola soy un Alumno y se hablar");
        System.out.println(toString());
    }
    
    
    
    @Override
    public String toString() {
        return super.toString()+"\nCarrera: "+carrera+"\nCurso: "+curso;
    }
    
    
}
