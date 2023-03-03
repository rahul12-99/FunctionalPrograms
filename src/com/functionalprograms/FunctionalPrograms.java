package com.functionalprograms;

import java.util.Scanner;

public class FunctionalPrograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature above 50");
        int temp = sc.nextInt();
        System.out.println("Enter wind speed above 120 less than 3");
        int speed = sc.nextInt();
        windChill(temp,speed);
    }
    public static void windChill(int temp, int speed) {
        if ((temp > 50) && (speed > 120 || speed < 3)) {
            double windChill = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(speed, 0.16);
            System.out.println("wind chill : " + windChill);
        } else {
            System.out.println("The formula is not valid");
        }
    }
}
