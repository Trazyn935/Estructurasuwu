package com.mycompany.spotify1;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set; 

class Cancion
{
    String titulo;
    String genero;
    int vistas;
    int duracion;
}

class NodoDoble
{
    Cancion cancion;
    NodoDoble siguiente;
    NodoDoble anterior;
    
    public NodoDoble(Cancion cancion)
    {
     this.cancion=cancion;
     this.siguiente=null;
     this.anterior=null;
    }
}

class ListaDoble
{
    NodoDoble cabeza;
    NodoDoble cola;
    
    public ListaDoble()
    {
        this.cabeza=null;
        this.cola=null;
    }
    
    public void agregar(Cancion nuevaCancion)
    {
        NodoDoble nuevoNodo = new NodoDoble(nuevaCancion);
        
        if(cabeza == null)
        {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        }
        else
        {
            cola.siguiente = nuevoNodo;
            nuevoNodo.anterior = cola;
            cola = nuevoNodo;
        }
    }
    
    public void imprimir()
    {
        NodoDoble actual = cabeza;
        int i = 1;
        
        while(actual != null)
        {
            System.out.println(i + "|Titulo:" + actual.cancion.titulo + "|Genero:" + actual.cancion.genero + "|Vistas:" + actual.cancion.vistas + "|Duracion:" + actual.cancion.duracion);
            
            actual = actual.siguiente;
            i++;
        }
    }
}


public class Spotify {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        boolean coincidencia = false;
        
        ListaDoble[] playList = new ListaDoble[2];
        playList[0] = new ListaDoble();
        playList[1] = new ListaDoble();
        Cancion nuevaCancion = new Cancion();
        
        for(int i=0;i<2;i++)
        {
            System.out.println("Playlist:" + (i + 1));
            
            
            for(int j=0;j<2;j++)
            {
                System.out.println("Llena los espacios con la informacion de tu cancion");
                
                System.out.println("Titulo:");
                nuevaCancion.titulo = scaner.nextLine();
                System.out.println("Genero:");
               nuevaCancion.genero = scaner.nextLine();
                System.out.println("Vistas:");
                nuevaCancion.vistas = scaner.nextInt();
                System.out.println("Duracion:");
                nuevaCancion.duracion = scaner.nextInt();
                
                scaner.nextLine();
           
                playList[i].agregar(nuevaCancion);
                System.out.println("===========================================");
        }   }
     
        
        System.out.println("----Canciones que Coinciden----");
        
       Set<String> conjuntoTitulos = new HashSet<>();
        NodoDoble actual1 = playList[0].cabeza;
        while(actual1 != null) {
            conjuntoTitulos.add(actual1.cancion.titulo.toLowerCase());
            actual1 = actual1.siguiente;
        }
        
        
        ListaDoble playlistFiltrada = new ListaDoble();
        
        
        NodoDoble actual2 = playList[1].cabeza;
        while(actual2 != null) {
            
            if(conjuntoTitulos.contains(actual2.cancion.titulo.toLowerCase())) {
                
                playlistFiltrada.agregar(actual2.cancion);
            }
            actual2 = actual2.siguiente;
        }
        
        
        if(playlistFiltrada.cabeza == null) {
            System.out.println("No hay coincidencias con tu amigo :c");
        } else {
           
            System.out.println("========= PLAYLIST DE COINCIDENCIAS ==========");
            playlistFiltrada.imprimir();
        }
        
        scaner.close(); 
    }
    
    
    
}