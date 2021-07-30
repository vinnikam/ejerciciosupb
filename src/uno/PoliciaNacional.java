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
public class PoliciaNacional extends Persona{
    public Long numeroPlaca;
    public String nombreEspos;
    public int numeroHijos;
    
    
    public PoliciaNacional(){
        
    }
    @Override
    public String toString(){
        return this.nombre;
    }
    protected void generaMensaje(){
        System.out.println("Mensaje ");
    }
    public static void main(String[] args) {
        PoliciaNacional poli = new PoliciaNacional();
        poli.generaMensaje();
    }
}
class Ejercito{
    
}
