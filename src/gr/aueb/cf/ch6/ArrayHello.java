package gr.aueb.cf.ch6;

import java.util.Arrays;

public class ArrayHello {

    public static void main(String[] args) {
        int[] arr = new int[3];  // Δήλωση και αρχικοποίηση πίνακα 10 θέσεων
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 4; // Populate

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
