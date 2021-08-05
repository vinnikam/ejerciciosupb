/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author Vinni
 */
public class Pruebas {
    public static void main(String[] args) {
        Cuadrado c1 = new Cuadrado();
        c1.asignarNombre("cuadrado 5cm");
        String var = c1.obtenerNombre();
        System.out.println(var);
        
    }
}
