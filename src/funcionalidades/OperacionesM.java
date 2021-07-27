/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionalidades;

import java.util.Scanner;

/**
 *
 * @author Vinni
 */
public class OperacionesM {
    public Double sumar(double num1,double num2){
        return num1+num2;
    }
    public int leerNumeroEntpos(String mensaje){
        Double numero = null;
        do{
            numero = this.leerNumero(mensaje);
        }while(numero.intValue()<0);
        
        return numero.intValue();
    }
    
    public Double leerNumero(String mensaje){
        Scanner lector = new Scanner(System.in);
        Double num1 =null;
        do{
            System.out.print(mensaje);
            String captura = lector.next();
            num1 = this.convertirEnNumeroD(captura);
        }while (num1 == null);
        
        return num1;
    }
    public Double convertirEnNumeroD(String numeroenCadena){
        Double numero = null;
        try{
            numero = Double.parseDouble(numeroenCadena);
        }catch (NumberFormatException var){
            //var.printStackTrace();
            numero=null;
        }finally{
         ;
        }
        
        return numero;
    }
}
