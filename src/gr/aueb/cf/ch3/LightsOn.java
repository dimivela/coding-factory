package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Turn lights on when it is
 * raining AND car
 * speeds > 100 OR is dark.
 */
public class LightsOn {
    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση
        boolean isRaining = false;
        int carSpeed = 0;
        boolean isSpeeding = false;
        final int MAX_CAR_SPEED = 100;
        boolean isDark = false;
        boolean lightsOn = false;
        Scanner dark = new Scanner(System.in);
        Scanner rain = new Scanner(System.in);
        Scanner speed = new Scanner(System.in);

        //Εντολές
        System.out.printf("Please, insert if it is raining: ");
        isRaining = rain.nextBoolean();
        System.out.printf("Please, insert the car's speed: ");
        carSpeed = speed.nextInt();
        System.out.printf("Please, insert if it is dark outside: ");
        isDark = dark.nextBoolean();
        isSpeeding = carSpeed >= 100;
        lightsOn = isDark || (isRaining && isSpeeding);

        //Εκτύπωση
        System.out.println("The car's lights are on: " + lightsOn);
    }
}
