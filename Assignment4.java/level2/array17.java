import java.util.Scanner;

public class array17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask number of persons
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        // 2D array: [n][3] → height, weight, BMI
        double[][] data = new double[n][3];
        String[] status = new String[n];

        // Input
        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.print("Enter height (in meters): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter weight (in kilograms): ");
            data[i][1] = sc.nextDouble();

            // Calculate BMI and store
            data[i][2] = data[i][1] / (data[i][0] * data[i][0]);

            // Status
            if (data[i][2] < 18.5) {
                status[i] = "Underweight";
            } else if (data[i][2] < 25) {
                status[i] = "Normal";
            } else if (data[i][2] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Output
        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height", "Weight", "BMI", "Status");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n",
                    data[i][0], data[i][1], data[i][2], status[i]);
        }

        sc.close();
    }
}
