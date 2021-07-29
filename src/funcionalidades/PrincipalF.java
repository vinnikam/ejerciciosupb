/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionalidades;

import uno.PoliciaNacional;


/**
 *
 * @author Vinni
 */
public class PrincipalF {
    public static void main(String[] args) {
        System.out.println("Inicio programa");
         OperacionesM oper = new OperacionesM();
         
        int num1 = oper.leerNumeroEntpos("Digite un número (1) mayor a 0, si lo digito mal repita : ");
        int num2 = oper.leerNumeroEntpos("Digite un número (2) mayor a 0, si lo digito mal repita : ");

        Double resultado = oper.sumar(num1, num2);
        System.out.println(" La suma enteros entre " + num1 + " y  " + num2 + " = " + resultado.intValue());
      
        DatosOperacion dato = new DatosOperacion("No existe");
                       dato = new DatosOperacion();
        
        // se cambia el uso directo a los atributos por que se encapsularon. 
         System.out.println("Ultima operacion "+dato);
        //dato.operador1 = new Double(num1);
        Double elnumero = new Double(num1);
        dato.cambiaOperador1(elnumero);
        //dato.operador2 = new Double(num2);;
        Double elnumero1 = new Double(num1);
        dato.cambiaOperador2(elnumero1);
        
        //dato.resultado = resultado;
        dato.cambiaResultado(resultado);
        dato.setResultado(resultado);
        //dato.nombre = "SUMA";
        dato.cambiaNombre("SUMA");
        
        dato = new DatosOperacion("SUMA", new Double(num1), new Double(num2), resultado);
        // otro 
        Double numd1 = oper.leerNumero("Digite un número cualquiera (1) mayor a 0, si lo digito mal repita : ");
        Double numd2 = oper.leerNumero("Digite un número cualquiera (2) mayor a 0, si lo digito mal repita : ");

        resultado = oper.sumar(numd1, numd2);
        System.out.println(" La suma cualquiera entre " + numd1 + " y  " + numd2 + " = " + resultado);
        System.out.println("Anterior operacion "+dato);
        System.out.println("Finalizo");
         
      
        
    }

    
}
