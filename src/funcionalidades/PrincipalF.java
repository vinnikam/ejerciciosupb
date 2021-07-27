/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionalidades;


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
       
        // otro 
        Double numd1 = oper.leerNumero("Digite un número cualquiera (1) mayor a 0, si lo digito mal repita : ");
        Double numd2 = oper.leerNumero("Digite un número cualquiera (2) mayor a 0, si lo digito mal repita : ");

        resultado = oper.sumar(num1, num2);
        System.out.println(" La suma cualquiera entre " + numd1 + " y  " + numd2 + " = " + resultado);
       
        System.out.println("Finalizo");

        
    }
    
}
