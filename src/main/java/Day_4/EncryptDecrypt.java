package Day_4;


import java.util.InputMismatchException;
import java.util.Scanner;

public class EncryptDecrypt {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter text for encryption: ");
        String s = reader.nextLine();
        int userKey;
        int key;
        String encrypted;
        String decrypted;
        System.out.println("Enter integer key for encryption: ");

        while (true) {
            try {
                userKey = reader.nextInt();
                key = userKey % 26;
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("It won't work as a key! Try again: ");
                reader.nextLine();
            }
        }

        encrypted = encryptString(s, key);
        System.out.println("Your encrypted message: ");
        System.out.println(encrypted);

        System.out.println("To decrypt your message enter key: ");


        while (true) {
            int keyMatch = reader.nextInt();

            if (keyMatch == userKey) {
                decrypted = decryptString(encrypted, key);
                break;
            } else {
                System.out.println("Oops! Wrong key, try again: ");
                reader.nextLine();
            }
        }

        System.out.println("Your decrypted message: ");
        System.out.println(decrypted);
    }

    private static String encryptString(String text, int key) {
        StringBuilder after = new StringBuilder();
        for (char x : text.toCharArray()) {
            if (key >= 0) {
                if (x >= 'A' && x <= 'Z') {
                    x = (char) ((x + key - 'A') % 26 + 'A');
                } else if (x >= 'a' && x <= 'z') {
                    x = (char) ((x + (26 - key) - 'a') % 26 + 'a');
                }
            } else {
                if (x >= 'A' && x <= 'Z') {
                    x = (char) ((x + (26 - Math.abs(key)) - 'A') % 26 + 'A');
                } else if (x >= 'a' && x <= 'z') {
                    x = (char) ((x + Math.abs(key) - 'a') % 26 + 'a');
                }
            }
            after.append(x);
        }
        return after.toString();
    }

    private static String decryptString(String text, int key) {
        StringBuilder reverse = new StringBuilder();
        for (char x : text.toCharArray()) {
            if (key >= 0) {
                if (x >= 'A' && x <= 'Z') {
                    x = (char) ((x +(26 - key) - 'A') % 26 + 'A');
                } else if (x >= 'a' && x <= 'z') {
                    x = (char) ((x + key - 'a') % 26 + 'a');
                }
            } else {
                if (x >= 'A' && x <= 'Z') {
                    x = (char) ((x + Math.abs(key) - 'A') % 26 + 'A');
                } else if (x >= 'a' && x <= 'z') {
                    x = (char) ((x +(26 - Math.abs(key)) - 'a') % 26 + 'a');
                }
            }
            reverse.append(x);
        }
        return reverse.toString();
    }
}
