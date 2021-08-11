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
import parqueo.Parqueadero;
import parqueo.Vehiculo;

/**
 *
 * @author Vinni
 */
public class ParqueaderoTest {
    
    public ParqueaderoTest() {
    }
    @Test
    public void validaTamanoC(){
        Parqueadero p1 = new Parqueadero();
        Long tamano = (long)p1.cuposDisponiblesC();
        Long inicio = (long)p1.ESPACIOSC;
        Assert.assertEquals(inicio, tamano);
        
    }
    @Test
    public void addMoto(){
        Parqueadero p1 = new Parqueadero();
        Vehiculo v = new Vehiculo("ABC", "MOTO");
        boolean rta = p1.registraM(v);
        
        Assert.assertTrue(rta);
        
    }
    @Test
    public void addMotoTamano(){
        Parqueadero p1 = new Parqueadero();
        Vehiculo v = new Vehiculo("ABC", "MOTO");
        boolean rta = p1.registraM(v);
        p1.registraM(v);
        p1.registraM(v);
        p1.registraM(v);
//        p1.registraM(v);
//        p1.registraM(v);
//        p1.registraM(v);
//        p1.registraM(v);
//        p1.registraM(v);
//        p1.registraM(v);
        Long tamano = (long)p1.cuposDisponiblesM();
        System.out.println("tamano "+tamano);
        
        Long elquepienso = (long)p1.ESPACIOSM-1;
        Assert.assertEquals(elquepienso, tamano);
        
    }
    @Test
    public void addCarroTamano(){
        Parqueadero p1 = new Parqueadero();
        Vehiculo v = new Vehiculo("ABC", "CARRO");
        boolean rta = p1.registraC(v);
        p1.registraM(v);
        p1.registraM(v);
        p1.registraM(v);
//        p1.registraM(v);
//        p1.registraM(v);
//        p1.registraM(v);
//        p1.registraM(v);
//        p1.registraM(v);
//        p1.registraM(v);
        Long tamano = (long)p1.cuposDisponiblesC();
        System.out.println("tamano CARROS "+tamano);
        
        Long elquepienso = (long)p1.ESPACIOSC-1;
        Assert.assertEquals(elquepienso, tamano);
        
    }
    @Test
    public void salidaCarro(){
        Parqueadero p1 = new Parqueadero();
        Vehiculo v = new Vehiculo("ABC", "CARRO");
        boolean rta = p1.registraC(v);
        
        long valor = p1.salidaC(v);
        System.out.println(valor);
        
        Assert.assertTrue(valor >=0);
        
    }
    @Test
    public void salidaMoto(){
        Parqueadero p1 = new Parqueadero();
        Vehiculo v = new Vehiculo("ABC", "MOTO");
        boolean rta = p1.registraM(v);
        
        long valor = p1.salidaM(v);
        System.out.println(valor);
        
        v = new Vehiculo("dsd", "MOTO");
        rta = p1.registraM(v);
        
        valor = p1.salidaM(v);
        
        System.out.println(valor);
        
        System.out.println("moto "+p1.getTotalRecaudado());    
        Assert.assertTrue(valor >=0);
        
    }
    @Test
    public void salidaCarroNExiste(){
        Parqueadero p1 = new Parqueadero();
        Vehiculo v = new Vehiculo("ABC", "CARRO");
        
        
        long valor = p1.salidaC(v);
        System.out.println(valor);
        
        Assert.assertTrue(valor <0);
        
    }
}
