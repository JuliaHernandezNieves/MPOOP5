/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mpoop5;

/**
 *Clase que muestra los datos de una persona
 * @author Julia Gabriela Hernandez Nieves
 */
public class Persona {
    private String nombre;
    private String apellido;
    private Fecha fNacimiento;
    
    public Persona(){
        
    }
/**
 * Método que muestra los datos de una persona
 * @param nombre Nombre de la persona
 */
    public Persona(String nombre) {
        this.nombre = nombre;
    }
/**
 *  Método que muestra los datos de una persona
 * @param nombre Nombre de la persona
 * @param apellido Apellio de la persona
 * @param fNacimiento fNacimiento de la persona
 */
    public Persona(String nombre, String apellido, Fecha fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento = fNacimiento;
    }
    /**
     * Método que muestra los datos de una persona
     * @return Muestra el nombre, apellio y fecha de nacimiento de una persona
     */
  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Fecha getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }
//Generar igual el toString
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", fNacimiento=" + fNacimiento + '}';
    }
    
    public Persona(String nombre, String apellido, int dia, int mes, int anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento = new Fecha(dia,mes,anio);
    }
}
