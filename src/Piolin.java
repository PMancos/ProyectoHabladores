/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin1
 */
public class Piolin extends Canario{
    private int numPeliculas;

    public Piolin(int numPeliculas, String canta, String sexo, int edad) {
        super(canta, sexo, edad);
        this.numPeliculas = numPeliculas;
    }

    @Override
    public void hablar() {
        System.out.println("Hola soy Piolin y se hablar");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString()+"\nNumero de peliculas: "+numPeliculas;
    }

    
    
    
}
