package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Special forms of while.
 */
public class SpecialWhileTypes {
    public static void main(String[] args) {
        int i = 1;
        int num;

        while (i <= 0){
            System.out.println("Never gets in!");
            i++;
        }

        while (i < 1){
            System.out.println("Never gets in!");
        }

        while (i <= 1){
            System.out.println("Only onetime gets in!");
            i++;
        }

        //Eternal loop
        while (true){
            System.out.println("That's an eternal loop!");
        }

        //Scanner in = new Scanner(System.in);
        //while ( (num = in.nextInt()) >= 0 ); //Θα παίρνει θετικους ή μηδέν μέχρι να παρει αρνητικό.
                                            // Δεν έχει σώμα, που σημαίνει ότι αγνοεί, ό,τι του δίνουμε, εν τέλει.
    }
}
