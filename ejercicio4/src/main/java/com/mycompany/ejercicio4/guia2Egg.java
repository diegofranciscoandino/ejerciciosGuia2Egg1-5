/*
 4. Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).

 */
package com.mycompany.ejercicio4;

import java.util.Scanner;


public class guia2Egg {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba la temperatura actual en centigrados");
        int temp = leer.nextInt();
        System.out.println("el equivalente en grados faranheit es : " + (-32 + (9 * temp / 5)));
        
    }
    
}
