package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base;

       // System.out.println("Ingrese un valor entero: ");
       // base= input.nextInt();

      //  int square = base*base;
       // System.out.println("El cuadrado de: " + base + "es " + square);

        try {
            System.out.println("Ingrese un valor entero: ");
            base= input.nextInt();

            int square = base*base;
            System.out.println("El cuadrado de: " + base + "es " + square);

        }catch(InputMismatchException ex) {
            System.out.println("Debe ingresar obligatoriamente un número entero");
        }finally {
            System.out.println("Fin del proceso");
        }
    }
}