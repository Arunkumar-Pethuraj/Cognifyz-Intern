import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a word or phrase : ");
        String input = scanner.nextLine();
        if (isPalindrome(input)) {
            System.out.println("The given word or phrase is a palindrome.");
        } else {
            System.out.println("The given word or phrase is not a palindrome.");
        }
        scanner.close();
    }

    public static boolean isPalindrome(String input) {
        // Remove non-alphanumeric characters and convert to lowercase
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Compare the cleaned input with its reverse
        String reverse = new StringBuilder(cleanedInput).reverse().toString();
        return cleanedInput.equals(reverse);
    }
}
