/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin1
 */
public class Canario extends Ave implements Hablador{
    private String canta;

    public Canario(String canta, String sexo, int edad) {
        super(sexo, edad);
        this.canta = canta;
    }
    
    @Override
    public String toString() {
        return super.toString()+"Canta: "+canta;
    }

    @Override
    public void hablar() {
       
    }

    
    
    
}
