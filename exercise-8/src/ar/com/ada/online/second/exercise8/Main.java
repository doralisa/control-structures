package ar.com.ada.online.second.exercise8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Calculo de bono mensual a trabajadores");

        double salary;
        double salaryBonus = 0;
        double antiquity;
        double antiquityBonus = 0;
        double monthlyBonus = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el salario mensual: ");
        salary = keyboard.nextDouble();
        System.out.print("Ingrese años de antiguedad: ");
        antiquity = keyboard.nextDouble();

        if (salary <= 1000) {
            salaryBonus = salary * 0.25;
        } else if (salary <= 3500) {
            salaryBonus = salary * 0.15;
        } else {
            salaryBonus = salary * 0.10;
        }

        if (antiquity >= 2 && antiquity < 5) {
            antiquityBonus = salary * 0.20;
        } else {
            antiquityBonus = salary * 0.30;
        }

        if (antiquityBonus > salaryBonus) {
            monthlyBonus = antiquityBonus;
        } else {
            monthlyBonus = salaryBonus;
        }

        System.out.println("Su bono mensual es: " + monthlyBonus);
        System.out.println("Su bono por antiguedad es: " + antiquityBonus);
        System.out.println("Su bono por sueldo es: " + salaryBonus);
    }
}

