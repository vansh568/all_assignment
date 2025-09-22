import java.util.Scanner;

public class array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of players: ");
        int n = sc.nextInt();
        double[] heights = new double[n];
        double sum = 0;

        System.out.println("Enter the height of each player:");
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }

        double mean = sum / n;
        System.out.println("Mean height of players: " + mean);

        sc.close();
    }
}
