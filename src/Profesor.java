/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin1
 */
public class Profesor extends Persona{
    
    private String despacho;
    private String email;

    public Profesor(String nombre, int edad, String despacho, String email) {
        super(nombre, edad);
        this.despacho = despacho;
        this.email = email;
    }

    
    public void hablar() {
        System.out.println("Hola soy un Profesor y se hablar");
        System.out.println(toString());
    }
    
    @Override
    public String toString() {
        return super.toString()+"\nDespacho: "+despacho+"\nEmail: "+email; 
    }
    
    
}
