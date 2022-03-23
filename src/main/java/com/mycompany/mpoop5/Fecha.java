/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mpoop5;

/**
 * Clase que muestra los datos de una Fecha
 * @author Julia Gabriela Hernandez Nieves
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia) {
        this.dia = dia;
    }
 /**
  * Método que muestra los datos de una Fecha
  * @param dia día dentro de la Fecha
  * @param mes mes dentro de la Fecha
  * @param anio anio dentro de la Fecha
  */

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
/**
 * Método que muestra los datos de una Fecha
 * @return día, mes y anio dentro de la Fecha
 */

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return dia+"/"+mes+"/"+anio;
    }
}
