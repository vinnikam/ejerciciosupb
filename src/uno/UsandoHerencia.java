/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

/**
 *
 * @author Vinni
 */
public class UsandoHerencia {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.nombre = "Helios";
        p.estatura = 1.70;
        p.peso = 48.3;
        
        System.out.println(p);
        
        Persona p1 = new Persona();
        p1.nombre = "Marcos";
        p1.estatura = 1.50;
        p1.peso = 35.3;
        
        System.out.println(p1);
          
        PoliciaNacional elpolicia = new PoliciaNacional();
        elpolicia.nombre = "jorge gomez";
        System.out.println(elpolicia);
        
        Profesor pro = new Profesor();
        pro.nombre = "YO";
        System.out.println(pro);
    }
}
