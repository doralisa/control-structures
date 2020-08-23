package ar.com.ada.online.second.exercise5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Cálculo de la persona con menor edad");

        int firstAge, secondAge, thirdAge;
        String firstName, secondName, thirdName;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la primera persona: ");
        firstName = keyboard.next();
        System.out.print("Ingrese la edad de la primera persona: ");
        firstAge = keyboard.nextInt();

        System.out.print("Ingrese el nombre de la segunda persona: ");
        secondName = keyboard.next();
        System.out.print("Ingrese la edad de la segunda persona: ");
        secondAge = keyboard.nextInt();

        System.out.print("Ingrese el nombre de la tercera persona: ");
        thirdName = keyboard.next();
        System.out.print("Ingrese la edad de la tercera persona: ");
        thirdAge = keyboard.nextInt();

        if (firstAge < secondAge && firstAge < thirdAge) {
            System.out.print("La persona de menor edad es: " + firstName + " que tiene: " + firstAge + " años");
        } else {
            if (secondAge < firstAge && secondAge < thirdAge) {
                System.out.print("La persona de menor edad es: " + secondName + " que tiene: " + secondAge + " años");
            } else {
                System.out.print("La persona de menor edad es: " + thirdName + " que tiene: " + thirdAge + " años");
            }
        }
    }
}
