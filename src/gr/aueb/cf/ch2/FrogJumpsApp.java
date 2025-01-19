package gr.aueb.cf.ch2;

/**
 * Counts the jumps needed to
 * cover a given distance.
 */
public class FrogJumpsApp {
    public static void main(String[] args) {
        int target = 85;
        int start = 20;
        int step = 30;
        int distance = 0;
        int jumps = 0;

        distance = target - start;

        jumps = (int) Math.ceil(distance / (double) step); // Η συνάρτηση ceil κάνει στρογγυλοποίηση
                                                //   στον αμέσως επόμενο ακέραιο και επιστρέφει
                                                //   αποτέλεσμα σε μορφή double.
        // Ακόμα κι αν υπάρχει ένας μόνο όρος που είναι καταχωρημένος
        // ως double, τότε και όλοι οι υπόλοιπο θα γίνουν promoted σε double.






        System.out.println("The frog covered " + distance + " cm, jumping " + jumps + " times.");

    }
}
