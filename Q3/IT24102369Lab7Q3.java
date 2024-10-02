import java.util.Scanner;

public class IT24102369Lab7Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int customer = 1; customer <= 5; customer++) {
            System.out.print("Enter total bill amount for customer " + customer + ": ");
            double billAmount = scanner.nextDouble();

            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char paymentMode = scanner.next().charAt(0);

            if (paymentMode == 'C' || paymentMode == 'c') {
                double discount = billAmount * 0.05;
                double finalAmount = billAmount - discount;
                System.out.println("Discount: " + discount);
                System.out.println("Amount to be paid: " + finalAmount);
            } else if (paymentMode == 'O' || paymentMode == 'o') {
                System.out.println("No discount. Amount to be paid: " + billAmount);
            } else {
                System.out.println("Payment Mode is Not Valid");
            }
        }
    }
}
