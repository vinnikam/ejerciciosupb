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
    
    public Triangulo(double base, double altura, String nombre){
        super(nombre);  // llamado al constructor papa public Figura(String nombre){
        this.base = base;
        this.altura = altura;
    }
    public Triangulo(double base, double altura){
        super("Triangulo de "+base+"x"+altura+" de b*h");  // llamado al constructor papa public Figura(String nombre){
        this.base = base;
        this.altura = altura;
        
    }
    @Override
    public double calcularArea(){
        return base * altura;
    }

    public double obtenerBase() {
        return base;
    }

//    public void asignarBase(double base) {
//        this.base = base;
//    }

    public double obtenerAltura() {
        return altura;
    }

//    public void asignarAltura(double altura) {
//        this.altura = altura;
//    }
    
}
