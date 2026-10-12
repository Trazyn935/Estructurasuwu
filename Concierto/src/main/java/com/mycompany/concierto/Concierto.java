package com.mycompany.concierto;

import java.util.Scanner;

public class Concierto {

    public static void main(String[] args) {
        int op;
        String[] escenario = new String[10];

        escenario[0] = "Molotov,Escenario 1";
        escenario[1] = "Cafe tacuva,Escenario 2";
        escenario[2] = "Zoe,Escenario 3";
        escenario[3] = "Draco Rosa,Escenario 4";
        escenario[4] = "El haragan y cia,Escenario 5";
        escenario[5] = "Megadeth,Escenario 6";
        escenario[6] = "Metallica,Escenario 7";
        escenario[7] = "Guns N'Roses,Escenario 8";
        escenario[8] = "Kiss,Escenario 9";
        escenario[9] = "Matt Dusk,Escenario 10";

        System.out.println("===== Conciertos =====");
        for (int i = 0; i < escenario.length; i++) {
            
            System.out.println(escenario[i]);
        }

        System.out.println("=========================");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hay algun cambio que realisar(1.si 2.no):");
        op = scanner.nextInt();
        scanner.nextLine(); 
        
        if(op == 1){
            System.out.println("Ingrece el Esenario:");
            String nuevoEsenario = scanner.nextLine(); // 
            
            System.out.println("¿A que banda se le asignara el escenario?");
            String bandaCambio = scanner.nextLine(); 
                    
            
            for (int i = 0; i < escenario.length; i++) {
                if (escenario[i].toLowerCase().contains(bandaCambio.toLowerCase())) {
                    String[] partes = escenario[i].split(",");
                    escenario[i] = partes[0] + "," + nuevoEsenario;
                    System.out.println("¡Cambio aplicado correctamente!");
                    break;
                }
            }
        }
        
        System.out.println("Ingrese la banda o Solicitud a buscar:");
        String solicitud = scanner.nextLine();
        boolean encontrado = false;
        for (int i = 0; i < escenario.length; i++) {
            if (escenario[i].toLowerCase().contains(solicitud.toLowerCase())) {
                System.out.println("Resultado: " + escenario[i]);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Lo siento, esta banda no esta");
        }

        scanner.close();
    }
}