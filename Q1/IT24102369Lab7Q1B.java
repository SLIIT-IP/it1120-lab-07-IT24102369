import java.util.Scanner;

public class IT24102369Lab7Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int student = 1; student <= 3; student++) {
            System.out.print("Enter marks for 4 subjects for student " + student + " (separated by space): ");
            int sum = 0;
            for (int i = 0; i < 4; i++) {
                sum += scanner.nextInt();
            }

            double average = sum / 4.0;
            System.out.println("Average Marks for student " + student + ": " + average);

            if (average >= 75 && average <= 100) {
                System.out.println("Grade: Distinction");
            } else if (average >= 50 && average < 75) {
                System.out.println("Grade: Credit");
            } else {
                System.out.println("Grade: Fail");
            }
        }
    }
}
