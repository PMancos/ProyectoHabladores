/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin1
 */
public abstract class Aparato{
    private double consumo;
    private double precio;

    public Aparato(double consumo, double precio) {
        this.consumo = consumo;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Consumo=" + consumo + "\nPrecio=" + precio;
    }
    
    
}
