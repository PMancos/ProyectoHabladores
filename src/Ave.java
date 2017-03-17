/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin1
 */
public class Ave {
    private String sexo;
    private int edad;

    public Ave(String sexo, int edad) {
        this.sexo = sexo;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Sexo: " + sexo + "Edad: " + edad;
    }
    
    
}
