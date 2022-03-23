/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mpoop5;

/**
 *Clase que muestra los datos de pasajeros
 * @author Julia Gabriela Hernandez Nieves
 */
public class Pasajeros {
    
    private String nombreP;
    private int edadP;
    private String nombreP2;
    private int edadP2;

    public Pasajeros() {
    }
    /**
     * Método que realiza los datos de los pasajeros
     * @param nombreP Nombre del primer pasajero
     * @param edadP Edad del primer pasajero
     * @param nombreP2 Nombre del segundo pasajero
     * @param edadP2 Edad del segundo pasajero
     */

    public Pasajeros(String nombreP, int edadP, String nombreP2, int edadP2) {
        this.nombreP = nombreP;
        this.edadP = edadP;
        this.nombreP2 = nombreP2;
        this.edadP2 = edadP2;
    }
    /**
     * Método que realiza los datos de los pasajeros
     * @return Nombre y edad de los pasajeros
     */

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public int getEdadP() {
        return edadP;
    }

    public void setEdadP(int edadP) {
        this.edadP = edadP;
    }

    public String getNombreP2() {
        return nombreP2;
    }

    public void setNombreP2(String nombreP2) {
        this.nombreP2 = nombreP2;
    }

    public int getEdadP2() {
        return edadP2;
    }

    public void setEdadP2(int edadP2) {
        this.edadP2 = edadP2;
    }
    

    
    @Override
    public String toString() {
        return "Hola soy: " + nombreP + " , tengo " + edadP + " anios y voy de pasajero"+
                "\nHola soy: " + nombreP2 + " , tengo " + edadP2 + " anios y voy de pasajero" ;
    }
    
}
