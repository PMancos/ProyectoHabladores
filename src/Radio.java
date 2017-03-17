/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin1
 */
public class Radio extends Aparato implements Hablador{
    private boolean casette;
    private double potencia;

    public Radio(boolean casette, double potencia, double consumo, double precio) {
        super(consumo, precio);
        this.casette = casette;
        this.potencia = potencia;
    }

    @Override
    public void hablar() {
        System.out.println("Hola, soy uha Radio y se hablar");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString()+"\nCasette: "+casette+"\nPotencia: "+potencia;
    }
    
    
}
