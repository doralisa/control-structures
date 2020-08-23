package ar.com.ada.online.second.exercise6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Algoritmo para determinar el costo y el descuento que tendrá un artículo");

        double productPrice;
        double discount;
        double cost;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el precio del articulo: ");
        productPrice = keyboard.nextDouble();

        if (productPrice >= 200) {
            discount = productPrice * 0.15;
        } else if (productPrice >= 100 && productPrice < 200) {
            discount = productPrice * 0.12;
        } else {
            discount = productPrice * 0.10;
        }

        cost = productPrice - discount;

        System.out.print("El costo del producto es: " + cost + " con un descuento de: " + discount);
    }
}
