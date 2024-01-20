import java.util.Random;
import java.util.Scanner;

public class RandomPasswordGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the desired length of the password : ");
        int length = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Include numbers? (y/n) : ");
        boolean includeNumbers = scanner.nextLine().equalsIgnoreCase("y");

        System.out.print("Include lowercase letters? (y/n) : ");
        boolean includeLowercaseLetters = scanner.nextLine().equalsIgnoreCase("y");

        System.out.print("Include uppercase letters? (y/n) : ");
        boolean includeUppercaseLetters = scanner.nextLine().equalsIgnoreCase("y");

        System.out.print("Include special characters? (y/n) : ");
        boolean includeSpecialCharacters = scanner.nextLine().equalsIgnoreCase("y");

        String characterSet = "";
        if (includeNumbers) {
            characterSet += "0123456789";
        }
        if (includeLowercaseLetters) {
            characterSet += "abcdefghijklmnopqrstuvwxyz";
        }
        if (includeUppercaseLetters) {
            characterSet += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        }
        if (includeSpecialCharacters) {
            characterSet += "!@#$%^&*()-_=+[]{};:,.<>/?";
        }
        scanner.close();

        if (characterSet.length() == 0) {
            System.out.println("\nError : at least one character set must be included.");
            return;
        }

        Random random = new Random();
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            password[i] = characterSet.charAt(random.nextInt(characterSet.length()));
        }

        System.out.println("\nGenerated password : " + new String(password));
    }
}
