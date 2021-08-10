package parqueo;

/**
 *
 * @author Vinni
 */
public class Principal {
    
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("ABC123", "MOTO");
        
        System.out.println(v1.getPlaca());
        
        int numeros[] = new int[5];
        numeros[3] = 99;
        numeros[4] = 76;
        
        for(int i = 0;i<5;i++){
            System.out.print("["+numeros[i]+"]");
        }
       
    }
    
}
