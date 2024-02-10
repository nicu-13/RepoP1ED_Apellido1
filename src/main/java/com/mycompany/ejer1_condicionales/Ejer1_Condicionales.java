/*
 1.	Algoritmo que devuelve el perímetro y el área de un rectángulo a partir de su base y su altura.
        El usuario podrá decidir si ve el perímetro, el área o ambos.
 */

package com.mycompany.ejer1_condicionales;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejer1_Condicionales {

    public static void main(String[] args) {
        int l,h;  
        int resp;
        Scanner A= new Scanner (System.in);  // esto es un comentario
        System.out.println(" Dime la altura del rectangulo");
        h=A.nextInt();
        System.out.println("Dime cuanto vale el lado del rectangulo");
        l=A.nextInt();
        System.out.println("\n Dime que operacion quieres realizar: \n 1: Area \n 2: Perimetro \n 3: Ambos?");
        resp=A.nextInt();
        if (resp==1){
            System.out.println("El area del rectangulo es: "+ l*h);
        }
        if (resp==2){
            System.out.println("El perimetro del rectangulo es: "+ (2*l+2*h));
        }
        if (resp==3){
            System.out.println(" El area del rectangulo es: "+ l*h+" y el perimetro del rectangulo es: "+ (2*l+2*h));         
        }            
    }
}
