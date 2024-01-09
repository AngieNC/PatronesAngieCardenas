/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dispositivomanipulaciontv;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {

    public static void main(String[] args) {
        // Se importa la libreria para poder ingresar valores
        Scanner scan = new Scanner(System.in);
        
        // Se crean las instancias       
        ControlInfrarrojo control = new ControlInfrarrojo();
        PanelTV panel = new PanelTV();
        SmartPhoneAdapter phone = new SmartPhoneAdapter();
        
        // Se crea el menú
        System.out.println("*******************************");
        System.out.println("Bienvenido a ManipulacionTV");
        System.out.println("Selecciona una opción");
        System.out.println("1. ControlInfrarrojo");     
        System.out.println("2. PanelTV");
        System.out.println("3. SmartPhone");
        System.out.println("4. Salir");
        int opcion = scan.nextInt();
        System.out.println("*******************************");
        
        // Se hace un switch para variar las opciones de entrada
        switch(opcion){
            // Por si su numero fue uno
            case 1:
                // Se llaman los metodos y se validan ciertos datos
                control.encender();
                scan.nextLine();
                System.out.println("Elija la entrada a la cual cambiar: ");
                String tipoEntrada = scan.nextLine();
                
                control.cambiarEntrada(tipoEntrada);
                
                while (true){
                    System.out.println("Adecue el volumen: ");
                    int volumen = scan.nextInt();
                    if (volumen > 5) {
                        System.out.println("No se puede subir tanto el volumen");
                        System.out.println("El volumen debe de ser entre 1 a 5");
                    } else if (volumen <= 5 && volumen >= 1){
                        control.manipularVolumen(volumen);
                        break;
                    } else{
                        System.out.println("No hay opción válida");
                   }    
                }
                
                while (true){
                    System.out.println("Desea apagar el control infrarrojo? 1 = SI, 2 = NO");
                    int numero = scan.nextInt();
                    if (numero == 1){
                        control.apagar();
                        break;
                    } else if (numero == 2){
                        System.out.println("Sigue estando en control infrarrojo");
                        break;
                    } else {
                        System.out.println("Opcion invalida, intentelo de nuevo");
                    }
                }
            // Por si su numero fue dos
            case 2:
                // Se llaman los metodos y se validan ciertos datos
                panel.encender();
                scan.nextLine();
                System.out.println("Elija la entrada a la cual cambiar: ");
                String entrada = scan.nextLine();
                
                panel.cambiarEntrada(entrada);
                
                while (true){
                    System.out.println("Adecue el volumen: ");
                    int volumen = scan.nextInt();
                    if (volumen > 5) {
                        System.out.println("No se puede subir tanto el volumen");
                        System.out.println("El volumen debe de ser entre 1 a 5");
                    } else if (volumen <= 5 && volumen >= 1){
                        panel.manipularVolumen(volumen);
                        break;
                    } else{
                        System.out.println("No hay opción válida");
                   }    
                }
                
                while (true){
                    System.out.println("Desea apagar el panel TV? 1 = SI, 2 = NO");
                    int numero = scan.nextInt();
                    if (numero == 1){
                        panel.apagar();
                        break;
                    } else if (numero == 2){
                        System.out.println("Sigue estando en panel TV");
                        break;
                    } else {
                        System.out.println("Opcion invalida, intentelo de nuevo");
                    }
                }
            // Por si su numero fue tres
            case 3: 
                // Se llaman los metodos y se validan ciertos datos
                phone.encender();
                scan.nextLine();
                System.out.println("Elija la entrada a la cual cambiar: ");
                String cambiar = scan.nextLine();
                
                System.out.println("Ahora ingrese el dispositivo a usar: ");
                String dispositivo = scan.nextLine();
                
                phone.cambiarEntrada(cambiar,dispositivo );
                
                while (true){
                    System.out.println("Adecue el volumen: ");
                    int volumen = scan.nextInt();
                    if (volumen > 5) {
                        System.out.println("No se puede subir tanto el volumen");
                        System.out.println("El volumen debe de ser entre 1 a 5");
                    } else if (volumen <= 5 && volumen >= 1){
                        phone.manipularVolumen(volumen);
                        break;
                    } else{
                        System.out.println("No hay opción válida");
                   }    
                }
                
                while (true){
                    System.out.println("Desea apagar el dispositivo smart Phone? 1 = SI, 2 = NO");
                    int numero = scan.nextInt();
                    if (numero == 1){
                        phone.apagar(dispositivo);
                        break;
                    } else if (numero == 2){
                        System.out.println("Sigue estando conectado");
                        break;
                    } else {
                        System.out.println("Opcion invalida, intentelo de nuevo");
                    }
                }
            // Por si su numero fue cuatro
            case 4:
                // Se sale del menú
                System.out.println("Cerrando programa...");
                break;  
        }
    }
}
