/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pq1;

import funcionalidades.OperacionesM;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vinni
 */
public class OperacionematTest {
    
    public OperacionematTest() {
    }
    @Test
    public void probarConvertirNumero(){
        OperacionesM oper = new OperacionesM();
        Double rta = oper.convertirEnNumeroD(null);
        Assert.assertNull(rta);
        
    }
    @Test
    public void probarConvertirNumeroBlanco(){
        OperacionesM oper = new OperacionesM();
        Double rta = oper.convertirEnNumeroD("");
        Assert.assertNull(rta);
        
    }
    @Test
    public void probarConvertirNumeroOK(){
        OperacionesM oper = new OperacionesM();
        Double rta = oper.convertirEnNumeroD("8");
        System.out.println(rta);
        Assert.assertNotNull(rta);
        
    }
}
