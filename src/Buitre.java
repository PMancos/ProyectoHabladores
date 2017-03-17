/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin1
 */
public class Buitre extends Ave{
    private double velocidadVuelo;
    private double peso;

    public Buitre(double velocidadVuelo, double peso, String sexo, int edad) {
        super(sexo, edad);
        this.velocidadVuelo = velocidadVuelo;
        this.peso = peso;
    }
    
    
}
