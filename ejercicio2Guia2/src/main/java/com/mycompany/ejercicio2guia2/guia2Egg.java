/*
 2. Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla
 */
package com.mycompany.ejercicio2guia2;

import java.util.Scanner;

public class guia2Egg {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese su nombre");
        String nombre = leer.next();
        System.out.println("bienvenido " + nombre);
        
        
    }
    
}
