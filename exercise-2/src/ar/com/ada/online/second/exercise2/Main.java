package ar.com.ada.online.second.exercise2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Algoritmo para determinar el sueldo semanal de un trabajador con base en\n" +
                "las horas trabajadas y el pago por hora, considerando que después de las 40 horas cada\n" +
                "hora se considera como excedente y se paga el doble.");

        double workedHours;
        double priceHour;
        double weeklySalary;
        String result;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese cantidad de horas trabajadas: ");
        workedHours = keyboard.nextDouble();

        System.out.print("Ingrese el pago por hora: ");
        priceHour = keyboard.nextDouble();

        if (workedHours > 40) {
            weeklySalary = (40 * priceHour) + ((workedHours - 40) * (priceHour * 2));
        } else {
            weeklySalary = workedHours * priceHour;
        }
        System.out.println("El salario semanal es: " + weeklySalary);
    }
}
