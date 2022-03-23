/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mpoop5;

/**
 *Clase que muestra los datos de un circulo
 * @author Julia Gabriela Hernandez Nieves
 */
public class Circulo {
    public final float PI = 3.1416f;
    private float radio;
    
    /*
    Constructor vacio
    */
    public Circulo(){
        
    }
    /**
     * Metodo que muestra los datos de un circulo
     * @param radio 
     */
    
    public Circulo(float radio){
        this.radio = radio;
    }
  
    
    public void perimetro(){
        float perimetro = 2 * PI * radio;
        System.out.println("Perimetro="+ perimetro);
    }
    
    public void area(){
        System.out.println("Area="+(PI * radio * radio));
    }
    /**
     * Metodo que muestra los datos de un circulo 
     * @return Perimetro y área de un circulo
     */
    
    //Setter
    public float getRadio(){
        return radio;
    }
    
    public void setRadio(float radio){
       
        this.radio = Math.abs(radio);
    }
    
    public String toString(){
        return "Circulo{radio="+radio+"}";
    }
    
}
