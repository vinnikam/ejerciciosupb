/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactosapp;

import java.util.ArrayList;

/**
 *
 * @author Vinni
 */
public class Libreta {
    private ArrayList<Contacto> contactos = new ArrayList<>();
    
    public boolean adicionarContacto(Contacto elcontacto){
        
        UtilidadPersistencia util = new UtilidadPersistencia();
        if (util.guardarArchivo(elcontacto)){
            this.contactos.add(elcontacto);
            return true;
        }
        return false;
    }
    
    
}
