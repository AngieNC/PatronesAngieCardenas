/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dispositivomanipulaciontv;

/**
 *
 * @author user
 */
public class SmartPhone {
    
    // Esta es la clase para adaptar
    // Se declaran los atributos
    private boolean seInicio = false;
    private boolean conectar = false;
    
    // Se hace un constructor con un atributo
    public SmartPhone() {
        System.out.println("Creando smart phone");
        this.seInicio = false;       
    }
     
    // Se realiza los nuevos metodos a implementar y ciertas validaciones
    public void iniciarAplicacion(){
        System.out.println("Se esta iniciando la aplicacion");
    }
    
    public void escanearDispositivosEnLaRed(String nombre){
            System.out.println("Buscando el dispositivo "+ nombre + " en la red");       
    }
    
    public void seleccionarDispositivo(String nombre){
        if (!this.conectar){
            System.out.println("Dispositivo encontrado: ");
            System.out.println(nombre);
        } else {
            System.out.println("Dispositivo no encontrado");
        }       
    }
 
    public void iniciarDispositivo(){
        if (!this.seInicio){
            System.out.println("Se esta iniciando el dispositivo...");
        } else {
            System.out.println("No se ha podido iniciar nada");
            System.out.println("Intentelo de nuevo");
        }
    }
    
    public void detenerDispositivo(String nombre){
        System.out.println("Se esta desconectando el dispositivo " + nombre + " de la red");
    } 
}
