package com.mycompany.spotify1;
import java.util.Scanner;

class Cancion {
    String titulo;
    String genero;
    int vistas;
    int duracion;
}

public class Spotify1 {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        
        boolean coincidencia = false;
        Cancion[][] playlist = new Cancion[2][10];
        
        for(int i=0; i<2; i++) {
            System.out.println("Playlist:" + (i+1));
            for(int j=0; j<10; j++) {
                
                playlist[i][j] = new Cancion(); 
                
                System.out.println("Llena los datos de la cancion numero:" + (j+1));
                
                System.out.println("Titulo:");
                playlist[i][j].titulo = scaner.nextLine();
                
                System.out.println("Genero:");
                playlist[i][j].genero = scaner.nextLine();
                
                System.out.println("Vistas:");
                playlist[i][j].vistas = scaner.nextInt();
                
                System.out.println("Duracion:");
                playlist[i][j].duracion = scaner.nextInt();
                
                scaner.nextLine(); 
                System.out.println("=====================================");
            }
        }
        
        System.out.println("Coincidencias");
        
        for(int i=0; i<10; i++) {
            for(int j=0; j<10; j++) {
                if(playlist[0][i].titulo.equalsIgnoreCase(playlist[1][j].titulo)) {
                    System.out.println("!Hay una coincidencia:" + playlist[0][i].titulo);
                    System.out.println("Genero de la cancion:" + playlist[0][i].genero);
                    System.out.println("Duracion de la cancion:" + playlist[0][i].duracion);
                    System.out.println("Visitas de la cancion:" + playlist[0][i].vistas);
                    coincidencia = true;
                }
            }
        }
        
        if(!coincidencia) {
            System.out.println("No hay coincidencias con tu amigo :c");
        }
        
        System.out.println("=========Playlist==========");
        System.out.println("Playlist No.1:");
        imprimirPlaylist(playlist[0]);
        
        System.out.println("Playlist No.2:");
        imprimirPlaylist(playlist[1]);
        
        scaner.close(); 
    }
    
    
    public static void imprimirPlaylist(Cancion[] lista) {
        for(int i=0; i<lista.length; i++) {
           
            System.out.println((i+1) + ". Titulo:" + lista[i].titulo + 
                               " | Genero:" + lista[i].genero + 
                               " | Vistas:" + lista[i].vistas + 
                               " | Duracion:" + lista[i].duracion);
        }
    }
}
