package Day_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        String userUnit = getUnit();
        double userValue = getValue();

        if (userUnit.equalsIgnoreCase("Celsius")) {
            celsius = userValue;
            convertCelsius(celsius);
        }
        else if (userUnit.equalsIgnoreCase("Fahrenheit")) {
            fahrenheit = userValue;
            convertFahrenheit(fahrenheit);
        }
        else if (userUnit.equalsIgnoreCase("Kelvin")) {
            kelvin = userValue;
            convertKelvin(kelvin);
        }

        System.out.println("Celsius: " + celsius + "\u2103.");
        System.out.println("Fahrenheit: " + fahrenheit + "\u2109.");
        System.out.println("Kelvin: " + kelvin + "\u212a.");
    }

    private static double celsius;
    private static double fahrenheit;
    private static double kelvin;

    private static void convertCelsius(double C) {
        fahrenheit = (C * 9 / 5) + 32;
        kelvin = C + 273.15;
    }

    private static void convertFahrenheit(double F) {
        celsius = (F - 32) * 5 / 9;
        kelvin = (F - 32) * 5 / 9 + 273.15;
    }

    private static void convertKelvin(double K) {
        celsius = K - 273.15;
        fahrenheit = (K - 273.15) * 9 / 5 + 32;
    }

    private static String getUnit() {
        Scanner reader = new Scanner(System.in);
        String unit;

        System.out.println("From which unit do you want to convert? (Celsius, Fahrenheit, Kelvin)");

        while (true) {
            String s = reader.nextLine();

            if (!s.equalsIgnoreCase("Celsius") && !s.equalsIgnoreCase("Fahrenheit") && !s.equalsIgnoreCase("Kelvin")) {
                System.out.println("Wrong unit. From which unit do you want to convert? (Celsius, Fahrenheit, Kelvin)");
            }
            else {
                unit = s;
                break;
            }
        }
        return unit;
    }

    private static double getValue() {
        Scanner reader = new Scanner(System.in);
        double value;

        System.out.println("Enter temperature value: ");

        while (true) {
            try {
                value = reader.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("That's not a proper value. Enter temperature value: ");
                reader.nextLine();
            }
        }
        return value;
    }
}
