/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mpoop5;

/**
 *
 * @author Julia Gabriela Hernandez Nieves
 */
public class MPOOP5 {
    public static void main(String[] args) {
      Circulo cir1 = new Circulo();
        //cir1.radio=5: No funciona
        cir1.setRadio(5);
        System.out.println(cir1.getRadio());
        cir1.area();
        cir1.perimetro();
        System.out.println(cir1.toString());
        System.out.println(cir1);
        
        System.out.println("##########");
        Circulo cir2 = new Circulo();
        cir2.setRadio(-15);
        System.out.println(cir2);
        
        System.out.println("########");
        Coche coche = new Coche();
        System.out.println(coche);
        
        System.out.println("############");
        Coche coche2 = new Coche("Ford", "rojo", 13795, 4, 2017);
        System.out.println(coche2);
        
        
        System.out.println("##########");
        Persona per1 = new Persona();
        per1.setNombre("Panchita");
        per1.setApellido("Lopez");
        //per1.setfNacimiento(fNacimiento);
        System.out.println(per1);
        Fecha fecha = new Fecha(6,7,2001);
        per1.setfNacimiento(fecha);
        System.out.println(per1);
        
        
        System.out.println("#########");
        Persona per2 = new Persona();
        per2.setNombre("Juanito");
        per2.setApellido("Perez");
        per2.setfNacimiento(new Fecha(15,6,2002));
        System.out.println(per2);
        
        System.out.println("#########3");
        Persona per3 = new Persona("Alan", "Martinez",new Fecha(16,2,2002));
        System.out.println(per3);
        
        
        System.out.println("#########");
        Persona per4 = new Persona("Sofìa","Vazquez", 12,9,1999);
        System.out.println(per4);
        
        System.out.println("##########");
        CocheLleno coche1 = new CocheLleno(new Chofer("Andres", 22), new Copiloto("Frida", 20), new Pasajeros( "Fernanda", 20, "Erick", 21));
        System.out.println(coche1);
    }
        
    }
    
