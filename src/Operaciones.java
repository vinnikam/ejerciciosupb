
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author Vinni
 */
public class Operaciones {
    
    
    public int sumar(int numero1, int numero2){
        //System.out.println("numero 1: "+numero1);
        //System.out.println("numero 2: "+numero2);
        int sumatotal = numero1 + numero2;
        return sumatotal;
    }
    public int leerNumeroEntero(String mensaje){
        return this.leerConsola(mensaje);
    }
    public int leerNumeroEnteroOld(String mensaje){
        Scanner lector = new Scanner(System.in);
        int num1 =0;
        
        do{
            System.out.print(mensaje);
            num1 = lector.nextInt();
        }
        while (num1 <=0);
        return num1;
    }
    public int leerConsola(String mensaje){
        Scanner lector = new Scanner(System.in);
        int num1 =0;
        do{
            System.out.print(mensaje);
            String captura = lector.next();
            num1 = this.convertirEnNumero(captura);
        }while (num1 <=0);
        return num1;
    }
    
    public int convertirEnNumero(String cadena){
        int numero = -1;
        try{
            numero = Integer.parseInt(cadena);
        }catch (NumberFormatException var){
            //var.printStackTrace();
            numero=-1;
        }finally{
         ;
        }
        
        return numero;
    }
    
    public int division(int numero1, int numero2){
        //System.out.println("numero 1: "+numero1);
        //System.out.println("numero 2: "+numero2);
        int sumatotal = numero1 / numero2;
        return sumatotal;
    }
    
    
    
    
    
    public double sumarD(double num1,double num2){
        return num1+num2;
    }
    public double leerConsolaD(String mensaje){
        Scanner lector = new Scanner(System.in);
        double num1 =0;
        System.out.print(mensaje);
        String captura = lector.next();
        num1 = this.convertirEnNumeroD(captura);
        return num1;
    }
    public double convertirEnNumeroD(String cadena){
        double numero = -1;
        try{
            numero = Double.parseDouble(cadena);
        }catch (NumberFormatException var){
            //var.printStackTrace();
            numero=-1;
        }finally{
         ;
        }
        
        return numero;
    }
}
