package com.functionalprograms;

import java.util.Scanner;

public class FunctionalPrograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x value ");
        int x = sc.nextInt();
        System.out.println("enter y value ");
        int y = sc.nextInt();
        distance(x, y);
    }

    public static void distance(int x, int y) {
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("Distance of " + x + ", " + y + " is : " + distance);
    }

}
