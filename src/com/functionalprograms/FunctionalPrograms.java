package com.functionalprograms;

import java.util.Scanner;

public class FunctionalPrograms {
    public static void main(String[] Strings) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter the value of b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter the value of c: ");
        double c = scanner.nextDouble();
        double discriminant = b * b - 4.0 * a * c;
        if (discriminant > 0.0) {
            double r1 = (-b + Math.pow(discriminant, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(discriminant, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        } else if (discriminant == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);
        } else {
            System.out.println("Roots are not real.");
        }
    }
}
