import java.util.Scanner;

public class element10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");
        double heightCm = sc.nextDouble();

        double totalInches = heightCm / 2.54; // 1 inch = 2.54 cm
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        System.out.println("Your height is: " + feet + " feet and " + inches + " inches");
    }
}
