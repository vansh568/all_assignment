import java.util.Scanner;

public class method6 {

    public static int findSmallest(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    public static int findLargest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        int smallest = findSmallest(num1, num2, num3);
        int largest = findLargest(num1, num2, num3);

        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);

        scanner.close();
    }
}
