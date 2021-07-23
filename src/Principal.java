
import java.util.Scanner;

/**
 *
 * @author Vinni
 */
public class Principal {

    public static void main(String[] arg) {
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
