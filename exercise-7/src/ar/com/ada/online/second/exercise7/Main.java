package ar.com.ada.online.second.exercise7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Asignación de becas mensuales para estudiantes universitarios");

        int studentAge;
        double studentAverage;
        double scholarshipAmount = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la edad del estudiante: ");
        studentAge = keyboard.nextInt();
        System.out.print("Ingrese el promedio del estudiante: ");
        studentAverage = keyboard.nextDouble();

        if (studentAge > 18) {
            if (studentAverage >= 9) {
                System.out.print("El monto de la beca será: " + (scholarshipAmount = 2000.00));
            } else if (studentAverage >= 7.5) {
                System.out.print("El monto de la beca será: " + (scholarshipAmount = 1000.00));
            } else if (studentAverage >= 6) {
                System.out.print("El monto de la beca será: " + (scholarshipAmount = 500.00));
            } else {
                System.out.print("Se le enviara una carta de invitación");
            }
        } else {
            if (studentAverage >= 9) {
                System.out.print("El monto de la beca será: " + (scholarshipAmount = 3000.00));
            } else if (studentAverage >= 8) {
                System.out.print("El monto de la beca será: " + (scholarshipAmount = 2000.00));
            } else if (studentAverage >= 6) {
                System.out.print("El monto de la beca será: " + (scholarshipAmount = 100.00));
            } else {
                System.out.print("Se le enviara una carta de invitación");
            }
        }
    }
}
