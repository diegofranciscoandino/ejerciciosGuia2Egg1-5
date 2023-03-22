/*
 5. Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt()
 */
package com.mycompany.ejercicio5;

import java.util.Scanner;


public class NewMain {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num = leer.nextInt();
        System.out.println("el doble del numero ingresado es : " +  (num * 2));
        System.out.println("el triple del numero ingresado es : " + (num * 3)) ;
        System.out.println("la raiz cuadrada del numero ingresado es: " + (Math.sqrt(num)));
    }
    
}
