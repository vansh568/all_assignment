import java.util.Scanner;

public class array15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Step 2: Store digits in array
        String numStr = Integer.toString(num); // Convert number to string
        int[] digits = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0'; // Convert char to int
        }

        // Step 3: Print digits in reverse order
        System.out.print("Reversed number: ");
        for (int i = digits.length - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }

        sc.close();
    }
}
