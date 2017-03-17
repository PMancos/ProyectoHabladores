/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin1
 */
public class Loro extends Ave implements Hablador{
    private String region;
    private String color;

    public Loro(String region, String color, String sexo, int edad) {
        super(sexo, edad);
        this.region = region;
        this.color = color;
    }

    @Override
    public void hablar() {
        System.out.println("Hola, soy un Loro y se hablar");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString()+"\nRegion: "+region+
                "\nColor: "+color;
    }
    
}
