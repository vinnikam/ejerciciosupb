
import java.util.List;
import jdk.nashorn.internal.parser.Lexer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vinni
 */
public class UsarOperaciones {
    public static void main(String[] args) {
        System.out.println("Usando operaciones");
        
        // crear variable clase
        int val = 0;
        boolean datos = false;
        //NOMBREclase NOMBREVARIABLE = new NOMBRECLASE ()
        // instancias de clase
        Vacia mivariable = new Vacia();

        String dato = new String();
        String dato1 = "";

        mivariable.primeros10Primos();
        
        int numero = 5;
        mivariable.pares(8, numero);
        
        int resultado = mivariable.longitudClaseDeHoy("clase de hoy ");
        System.out.println(resultado);
        
        List lalista = mivariable.pares1(2, 3);
        System.out.println(lalista);
    }
}
