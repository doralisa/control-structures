package ar.com.ada.online.second.exercisethreeA;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Realice un algoritmo para determinar cuánto se debe pagar por equis cantidad
        //de lápices considerando que si son 1000 o más el costo es de 85$ c/lapiz; de lo
        //contrario, el precio es de 90$ c/lapiz. Represéntelo con el pseudocódigo y el diagrama
        //de flujo

        System.out.println("Programa para calcular precio de lapices");

        int numbersPencil;
        double cost;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de lapices a comprar: ");
        numbersPencil=keyboard.nextInt();

        if (numbersPencil >= 1000) {
            cost = 85 * numbersPencil;
        } else {
            cost = 90 * numbersPencil;
        }

        System.out.println("El precio es: " + cost);
    }
}
