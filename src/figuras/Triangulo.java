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
public class Triangulo extends Figura {
    private double base;
    private double altura;
    
    public double calcularArea(){
        return base * altura;
    }
}
