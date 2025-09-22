import java.util.Scanner;

public class element9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the course fee (INR): ");
        double courseFee = sc.nextDouble();

        System.out.print("Enter the discount percentage (%): ");
        double discountPercent = sc.nextDouble();

        double discountAmount = (discountPercent / 100) * courseFee;
        double discountedPrice = courseFee - discountAmount;

        System.out.println("Discount amount: INR " + discountAmount);
        System.out.println("Price to pay after discount: INR " + discountedPrice);
    }
}
