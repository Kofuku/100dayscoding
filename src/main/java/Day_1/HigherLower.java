package Day_1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class HigherLower {

    public static void main(String[] args) {
        int winner = ThreadLocalRandom.current().nextInt(1, 100);
        Scanner reader = new Scanner(System.in);

        System.out.println("Higher/Lower Game!");
        System.out.println("Rules: At each game a computer will choose a random natural number from 1 to 100.");
        System.out.println("Try to guess this number. You have 5 rounds before you lose. START!");
        System.out.println("Enter your number: ");

        int round = 5;

        while (round > 0) {
            try {
                int in = reader.nextInt();

                if (in < 1 || in > 100) {
                    System.out.println("Your number is outside the range! Try again: ");
                } else if (in < winner) {
                    System.out.println("Your number is too small. Try again: ");
                } else if (in > winner) {
                    System.out.println("Your number is too big. Try again: ");
                } else {
                    System.out.println("Correct! You won the game!");
                    return;
                }
            }
            catch (InputMismatchException e) {
                System.out.println("That's not a natural number! Try again: ");
                reader.nextLine();
            } finally {
                round -= 1;
            }
        }
        System.out.println("You've lost! The wining number was: " + winner);
    }
}
