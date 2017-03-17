
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin1
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Hablador> listaHablantes=new ArrayList(7);
        
        Loro l1=new Loro("Australia", "azul", "macho", 20);
        Piolin p1=new Piolin(5, "En la ducha", "hembra", 30);
        Alumno a1=new Alumno("Loren", 34, "Informatica", 5);
        Profesor pro1=new Profesor("Elena", 40, "555", "elena@gmail.com");
        Bedel b1=new Bedel("Pepe", 30, "Quinto", 5);
        TV t1=new TV(300, 500, true, 5);
        Radio r1=new Radio(true, 100, 50, 200);
        
        listaHablantes.add(l1);
        listaHablantes.add(p1);
        listaHablantes.add(a1);
        listaHablantes.add(pro1);
        listaHablantes.add(b1);
        listaHablantes.add(t1);
        listaHablantes.add(r1);
        
        for(int i=0;i<listaHablantes.size();i++){
            listaHablantes.get(i).hablar();
            System.out.println("");
        }
    }
    
}
