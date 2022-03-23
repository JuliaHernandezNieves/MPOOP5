/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mpoop5;

/**
 * Clase que muestra los datos de un Coche
 * @author Julia Gabriela Hernandez Nieves
 */
public class Coche {
    
    private String marca;
   private String color;
   private int placa;
   private int numPuertas;
   private int modeloAnio;

    public Coche() {
    }
/**
 * Método que realiza los datos de un Coche
 * @param marca Marca del Coche
 * @param color Color del Coche
 * @param placa Placa del Coche
 * @param numPuertas numPuestas del Coche
 * @param modeloAnio modeloAnio del Coche
 */
    public Coche(String marca, String color, int placa, int numPuertas, int modeloAnio) {
        this.marca = marca;
        this.color = color;
        this.placa = placa;
        this.numPuertas = numPuertas;
        this.modeloAnio = modeloAnio;
    }
 /**
  * Método que realiza los datos de un Coche
  * @return Marca, color, placa, numPuertas, modeloAnio del Coche
  */

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getModeloAnio() {
        return modeloAnio;
    }

    public void setModeloAnio(int modeloAnio) {
        this.modeloAnio = modeloAnio;
    }
    public void encender(){
        System.out.println("Estoy encendiendo"); 
    }
    public void apagar(){
        System.out.println("Me voy apagar");
    }
    
    public void frenar(){
        System.out.println("Frenando");
    }
    
    public void tocarClaxon(){
        System.out.println("Quitate del camino");
    }
    
    public void acelerar(int velocidad){
        System.out.println("Voy a una velocidad de "+velocidad +"Km");
    }

    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", color=" + color + ", placa=" + placa + ", numPuertas=" + numPuertas + ", modeloAnio=" + modeloAnio + '}';
    }
    
}
