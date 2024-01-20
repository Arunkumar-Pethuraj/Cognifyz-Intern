import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the number of subjects : ");
        int numberOfGrades = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        int sum = 0;
        for (int i = 0; i < numberOfGrades; i++) {
            System.out.print("Enter Subject Mark " + (i + 1) + ": ");
            int grade = scanner.nextInt();
            scanner.nextLine();
            sum += grade;
        }
        double averageGrade = (double) sum / numberOfGrades;
        System.out.printf("The average grade is: %.2f%n", averageGrade);
        scanner.close();
    }
}
