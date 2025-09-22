import java.util.Scanner;

public class control12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int i = 1, sumWhile = 0;
        while (i <= n) {
            sumWhile += i;
            i++;
        }

        int sumFormula = n * (n + 1) / 2;

        System.out.println("Sum using while loop: " + sumWhile);
        System.out.println("Sum using formula: " + sumFormula);

        if (sumWhile == sumFormula) {
            System.out.println("Both results are correct and match!");
        } else {
            System.out.println("Results do not match!");
        }
    }
}
