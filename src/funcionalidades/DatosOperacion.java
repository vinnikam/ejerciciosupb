package funcionalidades;

/**
 *
 * @author Vinni
 */
public class DatosOperacion {
    // atributos
    private Double operador1;
    private Double operador2;
    private Double resultado;
    private String nombre;
    
    public DatosOperacion(){
        System.out.println("Se ejecuto contructor");
        this.operador1 = 0D;
        this.operador2 = 0.0;
        this.resultado = 0.0;
        this.nombre="NO HAY";
    }
    public DatosOperacion(String nombre){
        System.out.println("Se ejecuto contructor");
        this.operador1 = 0D;
        this.operador2 = 0.0;
        this.resultado = 0.0;
        this.nombre=nombre;
    }
    public DatosOperacion(String nombre, Double operador1, Double operador2, Double resultado){
        System.out.println("Se ejecuto contructor");
        this.operador1 = operador1;
        this.operador2 = operador2;
        this.resultado = resultado;
        this.nombre=nombre;
    }

    @Override
    public String toString(){
        return "nombre: "+this.nombre+" operador1 : "+this.operador1+
                " operador 2: "+this.operador2+" resultado :"+this.resultado;
    }
    
//    public static void main(String[] args) {
//        DatosOperacion datos = new DatosOperacion();
//        System.out.println(" paso 1"+datos);
//        datos.nombre ="Resta ";
//        System.out.println(" paso 2"+datos);
//        // llamados a constructor
//        DatosOperacion datos1 = new DatosOperacion();
//         
//        datos = new DatosOperacion();
//        System.out.println(" paso 3"+datos);
//        
//        
////        System.out.println(datos.operador1);
////        System.out.println(datos.operador2);
////        System.out.println(datos.resultado);
////        System.out.println(datos.nombre);
//
//    
//        
//    }
    
    
    
    // metodo para cambiar att NOMBRE
    public void cambiaNombre(String nuevonombre){
        this.nombre = nuevonombre;
    }
    // metodo que consulta valor de att Nombre
    public String consultaNombre(){
        return this.nombre;
    }
    public void cambiaOperador1(Double nuevovalor){
        this.operador1 = nuevovalor;
    }
    public Double consultaOperador1(){
        return this.operador1;
    }
    public void cambiaOperador2(Double nuevovalor){
        this.operador2 = nuevovalor;
    }
    public Double consultaOperador2(){
        return this.operador2;
    }
    public void cambiaResultado(Double nuevovalor){
        this.resultado = nuevovalor;
    }
    public Double consultaResultado(){
        return this.resultado;
    }
        // metodo para cambiar att NOMBRE
    public void setNombre(String nuevonombre){
        this.nombre = nuevonombre;
    }
    // metodo que consulta valor de att Nombre
    public String getNombre(){
        return this.nombre;
    }
    public void setOperador1(Double nuevovalor){
        this.operador1 = nuevovalor;
    }
    public Double getOperador1(){
        return this.operador1;
    }
    public void setOperador2(Double nuevovalor){
        this.operador2 = nuevovalor;
    }
    public Double getOperador2(){
        return this.operador2;
    }
    public void setResultado(Double nuevovalor){
        this.resultado = nuevovalor;
    }
    public Double getResultado(){
        return this.resultado;
    }
    
}
