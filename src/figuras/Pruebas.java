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
        c1.asignarLado(5);
        
        double resultado = c1.calcularArea();
        System.out.println(" El área del cuadrado "+c1.obtenerNombre()+ " es: "+resultado);
        
        Cuadrado c2 = new Cuadrado();
        c2.asignarNombre("cuadrado 7.4cm");
        c2.asignarLado(7.4);
        resultado = c2.calcularArea();
        System.out.println(" El área del cuadrado "+c2.obtenerNombre()+ " es: "+resultado);
        
    }
}
