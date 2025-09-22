import java.util.Scanner;

public class control4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n > 0) {
            int sum = n * (n + 1) / 2;
            System.out.println(n + " is a natural number");
            System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        } else {
            System.out.println(n + " is not a natural number");
        }
    }
}
