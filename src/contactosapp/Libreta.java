/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactosapp;

import contactosapp.vista.Ventana;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Vinni
 */
public class Libreta  implements Serializable{
    private ArrayList<Contacto> contactos ;

    public Libreta() {
        UtilidadPersistencia util = new UtilidadPersistencia();
        this.contactos = util.abrirArchivo();
        if (contactos == null){
            contactos = new ArrayList<>();
        }
    }
    
    
    public boolean adicionarContacto(Contacto elcontacto){
        
        UtilidadPersistencia util = new UtilidadPersistencia();
        int identif = this.obtenerIdentificador();
        elcontacto.setIdentificador(identif);
        this.contactos.add(elcontacto);
        if (util.guardarArchivo(this.contactos)){
            return true;
        }
        return false;
    }
    public Contacto buscar(Integer identificacion){
        for (Contacto contacto : contactos) {
            if (contacto.getIdentificador()== identificacion)
                return contacto;
        }
        return null;
    }
    private int obtenerIdentificador(){
        if (this.contactos.isEmpty())
            return 1;
        this.ordenarContactos();
        Contacto ultimo = this.contactos.get(this.contactos.size()-1);
        return ultimo.getIdentificador()+1;
    }
    public void ordenarContactos(){
        Collections.sort(contactos, new Comparator<Contacto>() {
            @Override
            public int compare(Contacto c1, Contacto c2) {
                    return c1.getIdentificador().compareTo(c2.getIdentificador());
            }
        });
    } 
    public ArrayList<Contacto> buscarOrdenadoNombre() {
        
        Collections.sort(contactos, new Comparator<Contacto>() {
            @Override
            public int compare(Contacto c1, Contacto c2) {
                    return c1.getNombre().compareTo(c2.getNombre());
            }
        });
        
        return this.contactos;
    }
    public void imprimirContactos(){
        this.ordenarContactos();
        for (Contacto contacto : contactos) {
            System.out.println(contacto); 
        }
    }
    public boolean borrarContacto(Contacto contacto){
//        for (int i = 0; i < 10; contactos.size()) {
//            Contacto elContacto = contactos.get(i);
//        }
        if (contacto == null){
            return false;
        }

        for (Contacto elContacto : contactos) {
            if (elContacto.getIdentificador() == contacto.getIdentificador()){
                this.contactos.remove(elContacto);
                UtilidadPersistencia util = new UtilidadPersistencia();
                if (util.guardarArchivo(this.contactos)){
                    return true;
                }
                
            }
        }
        return false;
    }
    public boolean editarContacto(Contacto contacto){
        if (contacto == null){
            return false;
        }
        for (Contacto elContacto : contactos) {
            if (elContacto.getIdentificador() == contacto.getIdentificador()){
                elContacto.setNombre(contacto.getNombre());
                elContacto.setApellidos(contacto.getApellidos());
                elContacto.setTelefono(contacto.getTelefono());
                elContacto.setEmpresa(contacto.getEmpresa());
                elContacto.setCorreo(contacto.getCorreo());
                UtilidadPersistencia util = new UtilidadPersistencia();
                if (util.guardarArchivo(this.contactos)){
                    return true;
                }
                
            }
        }
        return false;
    }
}
