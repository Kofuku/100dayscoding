package Day_5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int in;
        String response = "";

        System.out.println("Enter your number: ");

        while (true) {
            try {
                in = reader.nextInt();
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("This number won't work. Try again: ");
                reader.nextLine();
            }
        }

        if (in % 3 == 0) {
            response += "Fizz";
        }
        if (in % 5 == 0) {
            response += "Buzz";
        }
        if (response.equals("")) {
            response += in;
        }

        System.out.println(response);
    }
}
