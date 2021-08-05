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
public class Cuadrado extends Figura{
    private double lado;
    
    public double calcularArea(){
        return lado * lado;
    }
    
    public void asignarLado(double lado){
        this.lado = lado;
    }
    public double obtenerLado(){
        return this.lado;
    }
}
