import java.util.Scanner;

public class method2 {

  
    public static int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double targetDistance = 5000; // in meters
        return (int) Math.ceil(targetDistance / perimeter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side 1 (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter side 2 (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter side 3 (in meters): ");
        double side3 = scanner.nextDouble();
        int rounds = calculateRounds(side1, side2, side3);


        System.out.println("The athlete must complete " + rounds +
                           " full rounds to run at least 5 km.");

        scanner.close();
    }
}
