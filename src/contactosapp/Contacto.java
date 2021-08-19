/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactosapp;

import java.io.Serializable;

/**
 * D.T.O.
 * @author Vinni
 */

public class Contacto implements Serializable{
    // Atributos
    private String nombre;
    private String apellidos;
    private int telefono;
    private String correo;
    private String empresa;
    private Integer identificador;

    public Contacto(String nombre, String apellidos, int telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Contacto{ identificador=" + identificador + "nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", correo=" + correo + ", empresa=" + empresa +  '}';
    }
    
    
}
