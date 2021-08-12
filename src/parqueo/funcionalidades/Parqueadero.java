package parqueo.funcionalidades;

import java.util.Date;

/**
 *
 * @author Vinni
 */
public class Parqueadero {
    private Vehiculo[] cuposCarro;
    private Vehiculo[] cuposMoto;
    private int tarifaMoto;
    private int tarifaCarro;
    public final int ESPACIOSC = 18;
    public final int ESPACIOSM = 10;
    private long totalRecaudado;
    
    public Parqueadero(){
        this.cuposCarro = new Vehiculo[ESPACIOSC];
        this.cuposMoto = new Vehiculo[ESPACIOSM];
        this.tarifaMoto = 30;
        this.tarifaCarro = 60;
        
    }
    public int cuposDisponiblesC(){
        int contador =0;
        for(int i =0; i<this.cuposCarro.length;i++){
            if(cuposCarro[i]==null){
                contador++;
            }
        }
        return contador;
    }
    public int cuposDisponiblesM(){
        int contador =0;
        for(int i =0; i<this.cuposMoto.length;i++){
            if (cuposMoto[i] == null) {
                contador++;
            }
        }
        return contador;
    }
    public boolean registraM(Vehiculo moto){
        boolean encontro = false;
//        boolean existe = this.yaEstaMoto(moto);
//        if (existe)
//            return false;

        if (this.yaEstaMoto(moto))
            return false;
        
        int i = 0;
        do{
            if (this.cuposMoto[i] == null){
                Date fecha = new Date();
                moto.setHEntrada(fecha);
                this.cuposMoto[i] = moto;
                encontro = true;
            }
            i++;
        }while(encontro == false || i>this.cuposMoto.length);
        return encontro;
    }
    
    private boolean yaEstaMoto(Vehiculo moto){
        for(Vehiculo elVehiculo: this.cuposMoto){
            if(elVehiculo !=null && elVehiculo.getPlaca().equals(moto.getPlaca())){
                return true;
            }
        }
        return false;
    }
    
    public boolean registraC(Vehiculo carro){
        boolean encontro = false;

        if (this.yaEstaCarro(carro))
            return false;
        
        int i = 0;
        do{
            if (this.cuposCarro[i] == null){
                Date fecha = new Date();
                carro.setHEntrada(fecha);
                this.cuposCarro[i] = carro;
                encontro = true;
            }
            i++;
        }while(encontro == false || i>this.cuposCarro.length);
        return encontro;
    }
    private boolean yaEstaCarro(Vehiculo carro){
        for(Vehiculo elVehiculo: this.cuposCarro){
            if(elVehiculo !=null && elVehiculo.getPlaca().equals(carro.getPlaca())){
                return true;
            }
        }
        return false;
    }
    public long salidaC(Vehiculo carro){
        if(!yaEstaCarro(carro)){
            return -4;
        }
        
        long valorpagar = 0;
        for (int i = 0; i < this.cuposCarro.length; i++) {
            Vehiculo elVehiculo = this.cuposCarro[i];
            if (elVehiculo != null && elVehiculo.getPlaca().equals(carro.getPlaca())){
                
                this.cuposCarro[i] = null;
                Date fecha = new Date();
                elVehiculo.setHSalida(fecha);
                
                valorpagar = elVehiculo.calcularPago(tarifaCarro);
                this.totalRecaudado += valorpagar;
            }
            
        }
        return valorpagar;
    }
    public long salidaM(Vehiculo moto){
        if(!yaEstaMoto(moto)){
            return -4;
        }
        
        long valorpagar = 0;
        for (int i = 0; i < this.cuposMoto.length; i++) {
            Vehiculo elVehiculo = this.cuposMoto[i];
            if (elVehiculo != null && elVehiculo.getPlaca().equals(moto.getPlaca())){
                
                this.cuposMoto[i] = null;
                Date fecha = new Date();
                elVehiculo.setHSalida(fecha);
                
                valorpagar = elVehiculo.calcularPago(tarifaMoto);
                this.totalRecaudado += valorpagar;
            }
            
        }
        return valorpagar;
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
