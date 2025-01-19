package gr.aueb.cf.ch1;

/**
 * Calculates the sum of two integers
 * and the result is printed at console {stdout}.
 */

public class AddApp {

    public static void main(String[] args) {
        //Δήλωση και Αρχικοποίηση των μεταβλητών
        int num1 = 10;
        int num2 = 12;
        int result = 0;

        //Εντολές
        result = num1 + num2;

        //Εκτύπωση Αποτελέσματος
        System.out.println("Το αποτέλεσμα είναι: " + result);
        System.out.println("Τo αποτέλεσμα των " + num1 + ", " + num2 + " είναι ίσο με: " + result);
        System.out.printf("Το άθροισμα των %d, %d είναι ίσο με: %d", num1, num2, result); // Πιο ευανάγνωστο από το παραπάνω
    }
}
