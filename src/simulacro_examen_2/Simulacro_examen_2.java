/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulacro_examen_2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Simulacro_examen_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // SIMULACRO PRACTICA 2
        //LABERINTO
        Scanner sc=new Scanner (System.in);
        char [] [] laberinto= new char [10] [10];
        rellenar(laberinto);
        caminos(laberinto);
        laberinto [0][0]='O';
        mostrar(laberinto);
        int cont=0;
        int x=0, y=0;
        do{
            System.out.println("Para donde te quiere mover, 1 Arriba; 2 Abajo; 3 Derecha; 4 Izquierda; 5 Salir;");
            int mov=sc.nextInt();
            switch (mov){
                case 1 :y--;
                if(laberinto[y][x]==' '){
                  caminos (laberinto);
                  laberinto[y][x]='O';
                  mostrar (laberinto);
                }else if(laberinto[y][x]=='X'){
                    System.out.println("Te has chocado");
                    cont++;
                    y++;
                    mostrar(laberinto);
                     System.out.println("Quedan "+(5-cont)+" intentos");
                }
                break;
                case 3:x++;
                if(laberinto[y][x]==' '){
                caminos(laberinto);
                laberinto [y][x]='O';
                mostrar(laberinto);    
                }else{
                    System.out.println("Te has chocado");
                    cont++;
                    x--;
                mostrar(laberinto);
                 System.out.println("Quedan "+(5-cont)+" intentos");
                }
                break;
                case 2:y++;
                if(laberinto[y][x]==' '){
                  caminos (laberinto);
                  laberinto[y][x]='O';
                  mostrar (laberinto);
                }else if(laberinto[y][x]=='X'){
                    System.out.println("Te has chocado");
                    cont++;
                    y--;
                    mostrar(laberinto);
                    System.out.println("Quedan "+(5-cont)+" intentos");
                }
                break;
                case 4: x--;
                if(laberinto[y][x]==' '){
                    caminos(laberinto);
                    laberinto [y][x]='O';
                    mostrar (laberinto);
                }else{
                    System.out.println("Te has chocado");
                    cont++;
                    x++;
                    mostrar(laberinto);
                    System.out.println("Quedan "+(5-cont)+" intentos");
                }
                 break; 
                
            }
            
            if (x==9&&y==9){
                System.out.println("campeooooones");
                cont=5;
            }
            
        }while(cont!=5);
            
        }
    
    private static void rellenar(char[][] laberinto) {
        for(int i=0;i<laberinto.length;i++){
            Arrays.fill(laberinto[i],'X');
        }
    }

    private static void mostrar(char[][] laberinto) {
       for(int i=0;i<laberinto.length;i++){
           System.out.println(Arrays.toString(laberinto[i]));
       }
    }

    private static void caminos(char[][] laberinto) {
        for(int i=0;i<3;i++){
            laberinto [0] [i]=' ';
        }for(int i=0;i<9;i++){
            laberinto [i] [2]=' ';
        }for (int i=3;i<7;i++){
            laberinto[8][i]=' ';
        }for (int i=6;i<laberinto.length;i++){
            laberinto [9] [i]=' ';
    }
    }
    
}
