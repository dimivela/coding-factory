package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Checks if a person fulfills the voting-age criteria
 */
public class VoteEligible {
    public static void main(String[] args) {
        final int VOTING_AGE = 17;
        int age = 0;
        boolean canVote = false;
        Scanner inputAge = new Scanner(System.in);

        System.out.printf("Please, insert your age: ");
        age = inputAge.nextInt();

        canVote = age >= VOTING_AGE;

        System.out.printf("You can vote: %b", canVote);
    }
}
