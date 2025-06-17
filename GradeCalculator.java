package login;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept marks for three subjects
        System.out.print("Enter Math marks: ");
        int math = scanner.nextInt();

        System.out.print("Enter Science marks: ");
        int science = scanner.nextInt();

        System.out.print("Enter English marks: ");
        int english = scanner.nextInt();

        // Calculate average
        double average = (math + science + english) / 3.0;

        // Determine grade based on average
        String grade;
        if (average >= 90 && average <= 100) {
            grade = "A+";
        } else if (average >= 75 && average < 90) {
            grade = "A";
        } else if (average >= 60 && average < 75) {
            grade = "B";
        } else if (average >= 40 && average < 60) {
            grade = "C";
        } else {
            grade = "Fail";
        }

        // Output result
        System.out.println("\n--- Result ---");
        System.out.printf("Average Marks: %.2f\n", average);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
