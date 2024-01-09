/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dispositivomanipulaciontv;

/**
 *
 * @author user
 */
public class SmartPhoneAdapter extends DispositivoManipulacionTV {
    
    // Este es el adaptador de la clase SmartPhone
    // Se llama el atributo de la clase SmartPhone
    private SmartPhone smartPhone;
    
    // Se declara un constructor y se instancia la clase
    public SmartPhoneAdapter() {
        super();
        this.smartPhone = new SmartPhone();
        System.out.println("Creando el smart phone");
    }
    
    // Se definen y sobre-escriben metodos de la superclase con la clase SmartPhone
    @Override
    public void encender() {
        System.out.println("Encendiendo smart phone");
        this.smartPhone.iniciarAplicacion();      
    }
    
    public void cambiarEntrada(String nombre, String dispositivo) {
        System.out.println("Se va a cambiar de entrada a: " + nombre + " y buscar dispositivo: " + dispositivo);
        this.smartPhone.escanearDispositivosEnLaRed(dispositivo);
        this.smartPhone.seleccionarDispositivo(dispositivo);
        this.smartPhone.iniciarDispositivo();
    }

    public void manipularVolumen(int volumen) {
        System.out.println("Adecuando el volumen a " + volumen);    
    }

    public void apagar(String nombre) {
        this.smartPhone.detenerDispositivo(nombre);
        System.out.println("Apagando...");
    }  
}
