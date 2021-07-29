
import java.util.Scanner;
import uno.PoliciaNacional;

/**
 *
 * @author Vinni
 */
public class Principal {
    public static void main5(String[] arg) {
        System.out.println("Iniciando ..");
        Operaciones oper = new Operaciones();
            
        int num1 = oper.leerConsola("Digite un número (1) mayor a 0, si lo digito mal repita : ");
        int num2 = oper.leerConsola("Digite un número (2) mayor a 0, si lo digito mal repita : ");

        int resultado = oper.sumar(num1, num2);
        System.out.println(" La suma entre " + num1 + " y  " + num2 + " = " + resultado);
        
        //System.out.println("lei "+num1);
        System.out.println("Finalizando ..");
        
        double uno = oper.leerConsolaD("num1");
        double dos = oper.leerConsolaD("num2");
        double salida  = oper.sumar(uno, dos);
        System.out.println("salida "+salida);
        //int x = oper.division(2, 0);
        //num1 = oper.leerConsola("Opcion leyendo String, digite cualquier cosa preferible numero");
        //System.out.println(" Valor leido :" +num1);

    }
    public static void main2(String[] arg) {
        System.out.println("Iniciando ..");
        boolean nu1ok = true;
        boolean nu2ok = true;

        Scanner lector = new Scanner(System.in);
        int num1 =0;
        do{
            System.out.print(" Digite un número (1) mayor a 0, si lo digito mal repita : ");
            num1 = lector.nextInt();
        }
        while (num1 <0);
        
        int num2 =0;
        do{
            System.out.print(" Digite un número (2) mayor a 0, si lo digito mal repita : ");
            num2 = lector.nextInt();
        }while (num2 <0);
        
        
        Operaciones oper = new Operaciones();
        int resultado = oper.sumar(num1, num2);
        System.out.println(" La suma entre " + num1 + " y  " + num2 + " = " + resultado);

        
        //System.out.println("lei "+num1);
        System.out.println("Finalizando ..");
        PoliciaNacional poli = new PoliciaNacional();
        
    }
    public static void main1(String[] arg) {
        System.out.println("Iniciando ..");
        //1 pedir 2 datos numericos
        //2 validar que los numeros sean positivos        
        //3 invocar el metodo suma 
        //4 imprimir el resultado        
        boolean nu1ok = true;
        boolean nu2ok = true;

        Scanner lector = new Scanner(System.in);
        System.out.print(" Digite un número mayor a 0 : ");
        int num1 = lector.nextInt();
        System.out.print(" Digite un número mayor a 0 : ");
        int num2 = lector.nextInt();
        //estructuras de control 
        //logicas - repetitivas
        if (num1 > 0) {
            nu1ok = true;
        } else {
            nu1ok = false;
        }
        //nu2ok = num2 > 0;
        if (nu1ok && num2 > 0) {
            Operaciones oper = new Operaciones();
            int resultado = oper.sumar(num1, num2);
            System.out.println(" La suma entre " + num1 + " y  " + num2 + " = " + resultado);

        } else {
            System.out.println("Numeros < de cero, ¡ no se puede sumar !");
        }

        //System.out.println("lei "+num1);
        System.out.println("Finalizando ..");

    }
}
