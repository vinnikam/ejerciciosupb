/**
 *
 * @author Vinni
 */
public class Ejemplo {
    // atributos -- variables de clase
    int a;
    int b;
    
    // NO SE PUEDEN LLAMAR CLASES O METODOS 
    
    // funciones -- métodos
    public boolean esPar(int numero){
        //LLAMAR
        return true;
    }
    
    public void guardarArchivo(String cadena){
        //LLAMAR
        
    }  
    public int unDivisor(int numero){
        //LLAMR
       return 8; 
    }
    public static void main5 (String[] gf){
        
        System.out.println("Calculando ... ");

        //Clase Scanner . usarla ?
        
        //LLAMAR CLASE;
        //NOMBRE NOMBREVARIABLE = new NOMBRECLASE ()
        Operaciones mivariable = new Operaciones();        
        int nom = mivariable.sumar(75, 88);  // regreso importante = al inicio int nom =
        System.out.println("Resultado ");
        System.out.println(nom);

    }
    
 
}
