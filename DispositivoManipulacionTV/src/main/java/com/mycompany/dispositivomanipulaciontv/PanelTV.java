/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dispositivomanipulaciontv;

/**
 *
 * @author user
 */
public class PanelTV extends DispositivoManipulacionTV {
    
    // Se crea un constructor vacio, pero el super hace referencia a los parametros si habian en la superclase
    public PanelTV() {
        super ();
        System.out.println("Creando panel tv");
    }
    
    // Se sobre-escriben los metodos de la superclase
    @Override
    public void encender() {
        System.out.println("Encendiendo el panel TV...");
    }

    public void cambiarEntrada(String entrada) {
        System.out.println("Cambiando de entrada a: " + entrada);
    }

    public void manipularVolumen(int volumen) {
        System.out.println("Cambiando el volumen...");         
    }

    @Override
    public void apagar() {
        System.out.println("Apagando panel Tv...");
    }  
}
