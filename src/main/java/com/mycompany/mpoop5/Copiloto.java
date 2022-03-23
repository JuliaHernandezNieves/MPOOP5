/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mpoop5;

/**
 * Clase que muestra los datos de un Copiloto
 * @author Julia Gabriela Hernandez Nieves
 */
public class Copiloto {
    
    private String nombreC;
    private int edadC;

    public Copiloto() {
    }
/**
 * Método que muestra los datos de un Copiloto
 * @param nombreC nombre del Copiloto
 * @param edadC edad del Copiloto
 */

    public Copiloto(String nombreC, int edadC) {
        this.nombreC = nombreC;
        this.edadC = edadC;
    }
/**
 * Método que muestra los datos de un Copiloto
 * @return Nombre y edad del Copiloto
 */
    
    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public int getEdadC() {
        return edadC;
    }

    public void setEdadC(int edadC) {
        this.edadC = edadC;
    }
    
    @Override
    public String toString() {
        return "Hola soy: " + nombreC + ", tengo: " + edadC + " y voy de copiloto \n";
    }
    
}
