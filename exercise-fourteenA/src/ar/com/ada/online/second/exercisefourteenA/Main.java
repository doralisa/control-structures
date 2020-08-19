package ar.com.ada.online.second.exercisefourteenA;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Programa para cacular costo de servicio de paqueteria");

        int packageWeigth;
        double deliveryCost;
        int deliveryZone;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese zona de envío: ");
        System.out.println("[1] America del norte [2] America central [3] America del sur [4] Europa [5] Asia: ");
        deliveryZone = keyboard.nextInt();

        System.out.print("Ingrese el peso del paquete (en grms): ");
        packageWeigth = keyboard.nextInt();

        if (packageWeigth > 5000) {
            System.out.print("No se puede dar el servicio");
        } else {
            switch (deliveryZone) {

                case 1:
                    deliveryCost = packageWeigth * 11;
                    break;

                case 2:
                    deliveryCost = packageWeigth * 10;
                    break;

                case 3:
                    deliveryCost = packageWeigth * 12;
                    break;

                case 4:
                    deliveryCost = packageWeigth * 24;
                    break;

                case 5:
                    deliveryCost = packageWeigth * 27;
                    break;

                default:
                    deliveryCost = 0;
                    System.out.println("Numero de destino invalido");
            }
            System.out.println("El coste de envio es: " + deliveryCost);
        }

    }
}
