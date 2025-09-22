import java.util.Scanner;

public class array11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int employees = 10;
        double[] salary = new double[employees];
        int[] years = new int[employees];
        double[] bonus = new double[employees];
        double[] newSalary = new double[employees];
        double totalBonus = 0;

        System.out.println("Enter salary and years of service for 10 employees:");

        for (int i = 0; i < employees; i++) {
            System.out.print("Employee " + (i + 1) + " salary: ");
            salary[i] = sc.nextDouble();
            System.out.print("Employee " + (i + 1) + " years of service: ");
            years[i] = sc.nextInt();

            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.10;
            } else {
                bonus[i] = 0;
            }

            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
        }

        System.out.println("\n--- Employee Salary Details ---");
        for (int i = 0; i < employees; i++) {
            System.out.println("Employee " + (i + 1) +
                               " | Old Salary: " + salary[i] +
                               " | Bonus: " + bonus[i] +
                               " | New Salary: " + newSalary[i]);
        }

        System.out.println("\nTotal Bonus Zara has to pay = " + totalBonus);

        sc.close();
    }
}
