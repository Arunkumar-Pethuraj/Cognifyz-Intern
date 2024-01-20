import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature value: ");
        double temperature = scanner.nextDouble();
        System.out.println("Enter the unit of measurement (C for Celsius or F for Fahrenheit): ");
        String unit = scanner.next();

        if (unit.equalsIgnoreCase("C")) {
            double fahrenheit = (temperature * 9 / 5) + 32;
            System.out.printf("%.2f degrees Celsius is equal to %.2f degrees Fahrenheit.%n", temperature, fahrenheit);
        } else if (unit.equalsIgnoreCase("F")) {
            double celsius = (temperature - 32) * 5 / 9;
            System.out.printf("%.2f degrees Fahrenheit is equal to %.2f degrees Celsius.%n", temperature, celsius);
        } else {
            System.out.println("Invalid unit of measurement. Please enter C for Celsius or F for Fahrenheit.");
        }

        scanner.close();
    }
}
