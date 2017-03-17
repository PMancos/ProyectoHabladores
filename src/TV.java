/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin1
 */
public class TV extends Aparato implements Hablador{
    
    private boolean teletexto;
    private int antiguedad;

    public TV(double consumo, double precio, boolean teletexto, int antiguedad) {
        super(consumo,precio);
        this.teletexto = teletexto;
        this.antiguedad = antiguedad;
    }

    @Override
    public void hablar() {
        System.out.println("Hola soy un TV y se hablar");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString()+"\nTeletexto: "+teletexto+"\nAntiguedad: "+antiguedad;
    }
    
    
}
