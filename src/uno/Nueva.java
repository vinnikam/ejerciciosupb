
package uno;

import funcionalidades.OperacionesM;
import java.util.Scanner;

/**
 *
 * @author Vinni
 */
public class Nueva {
    public static void main(String[] args) {
        
        OperacionesM oper = new OperacionesM();
        oper.calculaCos();
        
        Double operador1 = 0D;
        Double operador2 = 0D;
        Double resultado;
        String nombre;
    
        Scanner sc  = new Scanner(System.in);
        String valor = sc.next();
        try {
            Double d1 = Double.parseDouble(valor);
            operador1 = d1;
        } catch (Exception e) {
        }
        
        String valor2 = sc.next();
        try {
            Double d1 = Double.parseDouble(valor);
            operador2 = d1;
        } catch (Exception e) {
        }
        resultado = sumar(operador1, operador2);
        nombre = "SUMA";
        System.out.println(" operador1"+operador1);
        
    }
    public static Double sumar(double valor, double valor2){
        return valor+valor2;
    }
    public static Double sumar1(double valor, double valor2){
        return valor+valor2;
    }
    public static Double restar(double valor, double valor2){
        return valor+valor2;
    }    
    public static Double restar3(double valor, double valor2){
        return valor+valor2;
    }    
    public static Double restar4(double valor, double valor2){
        return valor+valor2;
    }    
    public static Double restar5(double valor, double valor2){
        return valor+valor2;
    }    
    public static Double restar6(double valor, double valor2){
        return valor+valor2;
    }    
}
