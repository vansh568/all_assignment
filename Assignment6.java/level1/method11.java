import java.util.Scanner;

public class method11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // First count factors to size the array
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }

        // Display factors
        System.out.print("Factors of " + num + ": ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();

        // Calculate sum, sum of squares, and product
        int sum = 0;
        int sumSquares = 0;
        long product = 1;  // Use long for large values

        for (int f : factors) {
            sum += f;
            sumSquares += f * f;
            product *= f;
        }

        System.out.println("Sum of factors = " + sum);
        System.out.println("Sum of squares of factors = " + sumSquares);
        System.out.println("Product of factors = " + product);

        sc.close();
    }
}
