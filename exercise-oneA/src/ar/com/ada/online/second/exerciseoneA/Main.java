package ar.com.ada.online.second.exerciseoneA;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Se desea implementar un algoritmo para determinar cuál de dos valores
        //proporcionados es el mayor. Representarlo con pseudocódigo y diagrama de flujo.

    System.out.println("Programa para saber cual de dos numeros es mayor");
    int numberOne, numberTwo;
    int mayor;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Ingrese el primer número: ");
    numberOne = keyboard.nextInt();

    System.out.print("Ingrese el segundo número: ");
    numberTwo = keyboard.nextInt();

    if (numberOne > numberTwo) {
        mayor = numberOne;
    } else {
        mayor = numberTwo;
    }

    System.out.print("El número mayor es: " + mayor);

    }
}
