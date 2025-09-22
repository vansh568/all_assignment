import java.util.Scanner;

public class control17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter salary of employee " + i + ": ");
            double salary = sc.nextDouble();
            System.out.print("Enter years of service of employee " + i + ": ");
            int years = sc.nextInt();

            double bonus = 0;
            if (years >= 5) {
                bonus = 0.10 * salary;
            } else if (years >= 3) {
                bonus = 0.05 * salary;
            }

            System.out.println("Bonus of employee " + i + " is: " + bonus);
        }
    }
}
