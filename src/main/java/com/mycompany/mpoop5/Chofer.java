/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mpoop5;

/**
 *Clase que muestra los datos de un Chofer
 * @author Julia Gabriela Hernandez Nieves
 */
public class Chofer {
    
    private String nombreCh;
    private int edadCh;

    public Chofer() {
    }
    /**
     * Método que realiza los datos de un Chofer
     * @param nombreCh Nombre del Chofer
     * @param edadCh Edad del Chofer
     */

    public Chofer(String nombreCh, int edadCh) {
        this.nombreCh = nombreCh;
        this.edadCh = edadCh;
    }
    /**
     * Método que realiza los datos de una persona
     * @return Nombre y edad del chofer
     */

    public String getNombreCh() {
        return nombreCh;
    }

    public void setNombreCh(String nombreCh) {
        this.nombreCh = nombreCh;
    }

    public int getEdadCh() {
        return edadCh;
    }

    public void setEdadCh(int edadCh) {
        this.edadCh = edadCh;
    }
 
    @Override
    public String toString() {
        return "Hola soy: " + nombreCh + ", tengo " + edadCh + " años y soy el chofer \n";
    }
}
