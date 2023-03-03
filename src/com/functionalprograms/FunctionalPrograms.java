package com.functionalprograms;

public class FunctionalPrograms {
    static void findTriplets(int[] array, int length) {
        boolean found = false;
        for (int i = 0; i < length - 2; i++) {
            for (int j = i + 1; j < length - 1; j++) {
                for (int k = j + 1; k < length; k++) {
                    if (array[i] + array[j] + array[k] == 0) {
                        System.out.println(array[i] + " " + array[j] + " " + array[k]);
                        found = true;
                    }
                }
            }
        }
        if (found == false)
            System.out.println(" Triplet not exist ");
        else {
            System.out.println("Triplet found");
        }
    }

    public static void main(String[] args) {
        int arr[] = {0,-1, 2, -3, 1};
        int length = arr.length;
        findTriplets(arr, length);
    }
}
