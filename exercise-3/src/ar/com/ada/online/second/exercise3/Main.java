package ar.com.ada.online.second.exercise3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Algoritmo que ayude a determinar qué regalo se le\n" +
                "puede comprar a ese ser tan especial por el día del amor y la amistad");

        int moneyGift;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el dinero que tiene para el regalo: ");
        moneyGift = keyboard.nextInt();

        if (moneyGift <= 10) {
            System.out.print("El regalo que puede comprar es una tarjeta");
        } else {
            if (moneyGift >= 11 && moneyGift <= 100) {
                System.out.print("El regalo que puede comprar son chocolates");;
            } else {
                if (moneyGift >= 101 && moneyGift <= 250) {
                    System.out.print("El regalo que puede comprar son flores");;
                } else {
                    System.out.print("El regalo que puede comprar es un anillo");;
                }

            }
        }
    }
}
