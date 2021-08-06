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
        Cuadrado c1 = new Cuadrado(5, "cuadrado 5cm");
        //c1.asignarNombre();
        String var = c1.obtenerNombre();
        System.out.println(var);
        //c1.asignarLado(5);
        
        double resultado = c1.calcularArea();
        System.out.println(" c1 El área del cuadrado "+c1.obtenerNombre()+ " es: "+resultado);
        
        Cuadrado c2 = new Cuadrado(7.4, "cuadrado 7.4cm");
        //c2.asignarNombre();
        //c2.asignarLado(7.4);
        resultado = c2.calcularArea();
        System.out.println(" c2 El área del cuadrado "+c2.obtenerNombre()+ " es: "+resultado);
        
        Triangulo t = new Triangulo(5.3, 8.6, "El triangulo 5x8");
        resultado = t.calcularArea();
        System.out.println(" El área del triangulo "+t.obtenerNombre()+ " es: "+resultado);
        
        
        Cuadrado c3 = new Cuadrado(78);
        resultado = c3.calcularArea();
        System.out.println(" C3 El área del cuadrado "+c3.obtenerNombre()+ " es: "+resultado);
        
        Triangulo t1 = new Triangulo(58.69,78.56);
        resultado = t1.calcularArea();
        System.out.println("t1 El área del triangulo "+t1.obtenerNombre()+ " es: "+resultado); 
        
    }
}
