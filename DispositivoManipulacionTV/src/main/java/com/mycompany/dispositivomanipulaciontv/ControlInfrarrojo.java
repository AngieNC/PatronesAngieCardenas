/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dispositivomanipulaciontv;

/**
 *
 * @author user
 */
public class ControlInfrarrojo extends DispositivoManipulacionTV {
    
    // Se crea un constructor vacio, pero el super hace referencia a los parametros si habian en la superclase
    public ControlInfrarrojo() {
        super ();
        System.out.println("Creando control infrarrojo");
    }
    
    // Se sobre-escriben los metodos de la superclase
    @Override
    public void encender() {
        System.out.println("Prendiendo el control infrarrojo");
    }
    
    public void cambiarEntrada(String tipoEntrada) {
        System.out.println("Se está preparando para cambiar a " + tipoEntrada);
    }

    public void manipularVolumen(int volumen) {
        System.out.println("Cambiando el volumen");         
    }

    @Override
    public void apagar() {
        System.out.println("Apagando...");
    }
}
