package com.functionalprograms;

import java.util.Scanner;

public class FunctionalPrograms {
    public static void main(String[] args) {
        int n[][] = new int[3][4];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 12 numbers");

        for (int i = 0; i < 3; i++) {
            for(int j =0; j<4; j++){
                n[i][j] = sc.nextInt();
            }
        }
        for (int i =0; i<3; i++){
            for (int j=0; j<4; j++){
                System.out.print("["+i+"]["+j+"] " + n[i][j] + " ");
            }
            System.out.println();
        }
    }
}
