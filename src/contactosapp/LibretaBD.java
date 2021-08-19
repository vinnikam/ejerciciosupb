/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactosapp;

import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vinni
 */
public class LibretaBD {
    private ArrayList<Contacto> contactos ;

    public LibretaBD() {
        UtilidadPersistencia util = new UtilidadPersistencia();
        this.contactos = buscarTodos();
        if (contactos == null){
            contactos = new ArrayList<>();
        }
    }
    
    
    public boolean adicionarContacto(Contacto elcontacto){
        String sql = "insert into contactos (nombre, apellidos, correo, telefono, empresa) \n" +
                    "values (?, ?, ?, ?, ?)";
                            // 1  2  3  4 5
        Conexion manejaCx = new Conexion();
        Connection cActiva = manejaCx.conectarseMariaDB();
        if (cActiva != null){
            
            try {
                PreparedStatement ps = cActiva.prepareStatement(sql);
                
                //asigna parametros
                ps.setString(1, elcontacto.getNombre());
                ps.setString(3, elcontacto.getCorreo());
                ps.setString(5, elcontacto.getEmpresa());
                ps.setInt(4, elcontacto.getTelefono());
                ps.setString(2, elcontacto.getApellidos());
                
                int rgtros = ps.executeUpdate(); //afectar la base de datos
                if (rgtros >0){
                    this.contactos = buscarTodos();
                    return true;
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(LibretaBD.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                manejaCx.cerrarConexion(cActiva);
            }
        }
        // hacerlo insert into
        return false;
    }
    public ArrayList<Contacto> buscarTodos(){
        ArrayList<Contacto> listaBD = new ArrayList<>();
        String sql = "select * from contactos";
        Conexion manejaCx = new Conexion();
        Connection cActiva = manejaCx.conectarseMariaDB();
        if (cActiva != null){
            
            try {
                PreparedStatement ps = cActiva.prepareStatement(sql);
                
                ResultSet rs = ps.executeQuery();
                
                while(rs.next()){
                    Integer identificador = rs.getInt("identificador");
                    //String nombre = rs.getString("nombre");
                    String apellidos = rs.getString("apellidos");
                    String correo = rs.getString("correo");
                    String empresa = rs.getString("empresa");
                    int telefono = rs.getInt("telefono");
                   
                    // asigna en el contacto a devolver
                    Contacto contacBD = new Contacto(rs.getString("nombre"), 
                            rs.getString("apellidos"), telefono);
                    contacBD.setIdentificador(identificador);
                    contacBD.setEmpresa(empresa);
                    contacBD.setCorreo(correo);
                    
                    listaBD.add(contacBD);
                    
                }
                
                return listaBD;
                
                
            } catch (SQLException ex) {
                Logger.getLogger(LibretaBD.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                manejaCx.cerrarConexion(cActiva);
            }
        }
        return listaBD;
    }
    public Contacto buscar(Integer identificacion){
        String sql = "select * from contactos\n" +
                    "WHERE identificador = ?";
        Conexion manejaCx = new Conexion();
        Connection cActiva = manejaCx.conectarseMariaDB();
        if (cActiva != null){
            
            try {
                PreparedStatement ps = cActiva.prepareStatement(sql);
                
                ps.setLong(1, identificacion);
                                
                ResultSet rs = ps.executeQuery();
                
                if(rs.next()){
                    Integer identificador = rs.getInt("identificador");
                    //String nombre = rs.getString("nombre");
                    String apellidos = rs.getString("apellidos");
                    String correo = rs.getString("correo");
                    String empresa = rs.getString("empresa");
                    int telefono = rs.getInt("telefono");
                   
                    // asigna en el contacto a devolver
                    Contacto contacBD = new Contacto(rs.getString("nombre"), 
                            rs.getString("apellidos"), telefono);
                    contacBD.setIdentificador(identificador);
                    contacBD.setEmpresa(empresa);
                    contacBD.setCorreo(correo);
                    
                    return contacBD;
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(LibretaBD.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                manejaCx.cerrarConexion(cActiva);
            }
        }
        return null;
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
    public boolean editarContacto(Contacto elcontacto){
           //hacerlo delete 
           String sql = "UPDATE contactos set empresa = ? , apellidos = ?, correo = ?, telefono = ?, nombre = ?" +
                "WHERE identificador = ?";
           Conexion manejaCx = new Conexion();
        Connection cActiva = manejaCx.conectarseMariaDB();
        if (cActiva != null){
            
            try {
                PreparedStatement ps = cActiva.prepareStatement(sql);
                
                ps.setString(1, elcontacto.getEmpresa());
                ps.setString(2, elcontacto.getApellidos());
                ps.setString(3, elcontacto.getCorreo());
                ps.setInt(4, elcontacto.getTelefono());
                ps.setString(5, elcontacto.getNombre());
                ps.setLong(6, elcontacto.getIdentificador());
               
                
                int rgtros = ps.executeUpdate(); //afectar la base de datos
                if (rgtros >0){
                    
                    this.contactos = buscarTodos();
                    return true;
                    
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(LibretaBD.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                manejaCx.cerrarConexion(cActiva);
            }
        }
        return false;
    }
    public boolean borrarContacto(Contacto contacto){
       // hacerlo update
       String sql = "delete from contactos \n" +
            "WHERE identificador = ?";
       Conexion manejaCx = new Conexion();
        Connection cActiva = manejaCx.conectarseMariaDB();
        if (cActiva != null){
            
            try {
                PreparedStatement ps = cActiva.prepareStatement(sql);
                ps.setLong(1, contacto.getIdentificador());
                
                int rgtros = ps.executeUpdate(); //afectar la base de datos
                if (rgtros >0){
                    this.contactos = buscarTodos();
                    return true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(LibretaBD.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                manejaCx.cerrarConexion(cActiva);
            }
        }
        return false;
    }
}
