/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pq1;

import figuras.Cuadrado;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vinni
 */
public class OperacionesTest {
    
    public OperacionesTest() {
    }
    @Test
    public void pruebaAreaCuadrado(){
        
        Cuadrado c1 = new Cuadrado(4);
        double rta = c1.calcularArea();
        Double d = new Double(16);
        Double rtad = rta;
        Assert.assertEquals(d, rtad);
    }
    @Test
    public void validaNombre(){
        Cuadrado c1 = new Cuadrado(4);
        String nombre = c1.obtenerNombre();
        System.out.println(nombre);
        Assert.assertNotNull(nombre);
        
    }
    @Test
    public void validaColor(){
        Cuadrado c1 = new Cuadrado(4);
        String color = c1.obtenerColor();
        System.out.println(color);
        Assert.assertNull(color);
        
    }
    @Test
    public void validaNombreEnviado(){
        Cuadrado c1 = new Cuadrado(4, "cuadrado");
        String nombre = c1.obtenerNombre();
        Integer longitud = nombre.length();
        
        Long valoresperado = 8L;
        Long longL = longitud.longValue();
        
        Assert.assertEquals(longL, valoresperado);       
    }
    @Test
    public void validaNombreEnviado1(){
        Cuadrado c1 = new Cuadrado(4, "cuadrado");
        String nombre = c1.obtenerNombre();
        int longitud = nombre.length();
        
        
        Assert.assertTrue(longitud == 8);       
    }
    @Test
    public void validaNombreEnviado2(){
        Cuadrado c1 = new Cuadrado(4, "Cuadrado");
        String nombre = c1.obtenerNombre();
        
        
        Assert.assertEquals("cuadrado".toUpperCase(), nombre.toUpperCase());       
    }
}
