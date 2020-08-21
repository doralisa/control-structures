package ar.com.ada.online.second.exercise1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Algoritmo para determinar si una persona puede votar con base en su edad en las próximas elecciones");

        int personAge;
        String result;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la edad de la persona: ");
        personAge = keyboard.nextInt();

        if (personAge >= 18) {
            result = "La persona puede votar";
        } else {
            result = "La persona no puede votar";
        }

        System.out.println("----> " + result + " <----");
    }
}
