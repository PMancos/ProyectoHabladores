/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin1
 */
public class Bedel extends Persona {
    
    private String turno;
    private int antiguedad;

    public Bedel(String nombre, int edad, String turno, int antiguedad) {
        super(nombre, edad);
        this.turno = turno;
        this.antiguedad = antiguedad;
    }

    public void hablar() {
        System.out.println("Hola soy un Bedel y se hablar"); //getClass
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString()+"\nTurno: "+turno+"\nAntiguedad: "+antiguedad;
    }
    
    
    
    
}
