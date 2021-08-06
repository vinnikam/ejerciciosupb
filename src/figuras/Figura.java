package figuras;

/**
 *
 * @author Vinni
 */
public abstract class Figura{
    // atributos 
    private String nombre;
    private String color;
    
    public Figura(String nombre){
        this.nombre = nombre;
    }
    // metodos
    public abstract double calcularArea();
    
//    public double perimetro() {
//        return 0;
//    }
    //asignarvalor
//    public void asignarNombre(String nombre){
//        this.nombre = nombre;
//    }
    
    //obtenervalor
    public String obtenerNombre(){
        return this.nombre;
    }

    public void asignarColor(String color){
        this.color = color;
    }
    
    //obtenervalor
    public String obtenerColor(){
        return this.color;
    }
    
}
