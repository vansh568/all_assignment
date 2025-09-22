import java.util.Scanner;

public class control13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sumFor = 0;
        for (int i = 1; i <= n; i++) {
            sumFor += i;
        }

        int sumFormula = n * (n + 1) / 2;

        System.out.println("Sum using for loop: " + sumFor);
        System.out.println("Sum using formula: " + sumFormula);

        if (sumFor == sumFormula) {
            System.out.println("Both results are correct and match!");
        } else {
            System.out.println("Results do not match!");
        }
    }
}
