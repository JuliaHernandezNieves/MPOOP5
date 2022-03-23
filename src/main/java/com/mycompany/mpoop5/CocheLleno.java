/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mpoop5;

/**
 * Clase que muestra los datos de un CocheLleno
 * @author Julia Gabriela Hernandez Nieves
 */
public class CocheLleno {
    private Chofer chofer;
    private Copiloto copilotoCoche;
    private Pasajeros pasajero;

    public CocheLleno() {
    }
/**
 * Método que muestra los datos de un CocheLleno
 * @param chofer Chofr que esta dentro del CocheLlleno
 * @param copilotoCoche Copiloto que esta dentro del CocheLlleno
 * @param pasajero pasajeros que estan dentro el CocheLlleno
 */

    public CocheLleno(Chofer chofer, Copiloto copilotoCoche, Pasajeros pasajero) {
        this.chofer = chofer;
        this.copilotoCoche = copilotoCoche;
        this.pasajero = pasajero;
    }
 /**
  * Método que muestra los datos de un CocheLleno
  * @return Chofer, Copiloto y pasajeros dentro del CocheLlleno
  */

    public Chofer getChofer() {
        return chofer;
    }

    public void setChofer(Chofer chofer) {
        this.chofer = chofer;
    }

    public Copiloto getCopilotoCoche() {
        return copilotoCoche;
    }

    public void setCopilotoCoche(Copiloto copilotoCoche) {
        this.copilotoCoche = copilotoCoche;
    }

    public Pasajeros getPasajeros() {
        return pasajero;
    }

    public void setPasajero(Pasajeros pasajero) {
        this.pasajero = pasajero;
    }

    @Override
    public String toString() {
        return "CocheLleno{" + "chofer=" + chofer + "CopilotoCoche=" + copilotoCoche + "Pasajero=" + pasajero + '}';
    } 
}
