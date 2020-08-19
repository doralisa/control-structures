package ar.com.ada.online.second.exercisefourA;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Almacenes “El harapiento distinguido” tiene una promoción: a todos los trajes
        //que tienen un precio superior a $2500.00 se les aplicará un descuento de 15 %, a todos
        //los demás se les aplicará sólo 8%. Realice un algoritmo para determinar el precio final
        //que debe pagar una persona por comprar un traje y de cuánto es el descuento que
        //obtendrá. Represéntelo mediante el pseudocódigo y el diagrama de flujo.

        System.out.println("Programa para aplicar descuentos a trajes según su costo");

        double suitPrice;
        double suitDiscount;
        double finalPrice;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese costo del traje: ");
        suitPrice = keyboard.nextDouble();

        if (suitPrice >= 2500) {
            suitDiscount = suitPrice * 0.15;
        } else {
            suitDiscount = suitPrice * 0.08;
        }

        finalPrice = suitPrice - suitDiscount;

        System.out.printf("El precio final es: %.2f\n El descuento es: %.2f", finalPrice, suitDiscount);

//        System.out.println("El precio final del traje es: " + finalPrice + " y su descuento es: " + suitDiscount);
    }
}
