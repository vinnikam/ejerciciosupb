package parqueo;

/**
 *
 * @author Vinni
 */
public class Parqueadero {
    private Vehiculo[] cuposCarro;
    private Vehiculo[] cuposMoto;
    private int tarifaMoto;
    private int tarifaCarro;
    private final int ESPACIOSC = 18;
    private final int ESPACIOSM = 10;
    private long totalRecaudado;
    
    private Parqueadero(){
        this.cuposCarro = new Vehiculo[ESPACIOSC];
        this.cuposMoto = new Vehiculo[ESPACIOSM];
        
    }
    public int cuposDisponiblesC(){
        return 7;
    }
    public int cuposDisponiblesM(){
        return 7;
    }
    public boolean registraM(Vehiculo moto){
        return true;
    }
    public boolean registraC(Vehiculo carro){
        return true;
    }
    
    public boolean salidaC(Vehiculo carro){
        return true;
    }
    public boolean salidaM(Vehiculo carro){
        return true;
    }
    
    public long getTotalRecaudado(){
        return this.totalRecaudado;
    }
    public void setTarifaMoto(int tarifa){
        this.tarifaMoto = tarifa;
    }
    public int getTarifaMoto(){
        return this.tarifaMoto;
    }
    public void setTarifaCarro(int tarifa){
        this.tarifaCarro = tarifa;
    }
    public int getTarifaCarro(){
        return this.tarifaCarro;
    }

}
