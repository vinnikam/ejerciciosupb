/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vinni
 */
public class Conexion {
    private final String USUARIO = "elusuario";
    private final String CLAVE = "laclave";
    private final String BD = "libreta_bd";
    private final String BDP = "tabla";
    public Connection conectarse(){
        
        try {
            Class.forName("org.postgresql.Driver");
            Connection miconexion = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/"+BDP, USUARIO, CLAVE);
            return miconexion;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public Connection conectarseMariaDB(){
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            Connection miconexion = DriverManager.getConnection("jdbc:mariadb://127.0.0.1/"+BD, USUARIO, CLAVE);
            return miconexion;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void cerrarConexion (Connection cActiva){
        try {
            cActiva.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
