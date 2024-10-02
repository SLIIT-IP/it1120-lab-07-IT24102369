import java.util.Scanner;

public class IT24102369Lab7Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[4];
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            sum += marks[i];
        }

        double average = sum / 4.0;

        System.out.println("Average Marks: " + average);

        if (average >= 75 && average <= 100) {
            System.out.println("Grade: Distinction");
        } else if (average >= 50 && average < 75) {
            System.out.println("Grade: Credit");
        } else {
            System.out.println("Grade: Fail");
        }
    }
}
