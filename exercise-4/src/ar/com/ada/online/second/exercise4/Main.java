package ar.com.ada.online.second.exercise4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Calculo del cobro por el uso del estacionamiento");
        double time;
        double finalPrice;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese cantidad de horas: ");
        time = keyboard.nextDouble();

        if (time <= 2) {
            finalPrice = time * 5.00;
        } else {
            if (time >= 3 && time <= 4) {
                finalPrice = ((time - 2) * 4.00) + 10;
            } else {
                if (time >= 5 && time <= 9) {
                    finalPrice = ((time - 4) * 3.00) + 16;
                } else {
                    finalPrice = ((time - 9) * 2.00) + 27;
                }
            }
        }

        System.out.print("El cobro por el uso del estacionamiento es: " + finalPrice);

    }
}
