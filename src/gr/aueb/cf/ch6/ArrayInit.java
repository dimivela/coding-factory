package gr.aueb.cf.ch6;

/**
 * Δήλωση, αρχικοποίηση και γεμισμα πίνακα.
 * - new
 * - unsized init
 * - array initializer
 * - print
 */
public class ArrayInit {

    public static void main(String[] args) {
        int[] arr = new int[3];  // Δήλωση και αρχικοποίηση πίνακα 3 θέσεων
        int[] arr2 = {1, 2, 3, 4, 5}; // Unsized initialization
        int[] arr3 = new int[] {1, 2, 3, 4, 5}; //Array initializer
//        int arr3;
//        arr3 = new int[] {1, 2, 3, 4, 5};

        // Populate
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 4;

        // Traverse
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Enhanced for (suitable for quick printing
        // of the elements of an array
        for (int el : arr3) {
            System.out.print(el + " ");
        }
    }
}
