package ar.com.ada.online.second.exercisetwoA;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Realice un algoritmo para determinar si un número es positivo o negativo.
        //Represéntelo en pseudocódigo y diagrama de flujo.

        System.out.println("Programa para determinar si un número es positivo o negativo");
        int number;
        String result;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingresar el número: ");
        number = keyboard.nextInt();

        if (number >= 0) {
            result = "Positivo";
        } else {
            result = "Negativo";
        }

        System.out.print("El número es: " + result);
    }
}
