import java.util.Scanner;

public class method22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of players: ");
        int n = sc.nextInt();
        double[] heights = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
        }
        double shortest = heights[0], tallest = heights[0], sum = 0;
        for (double h : heights) {
            if (h < shortest) shortest = h;
            if (h > tallest) tallest = h;
            sum += h;
        }
        double mean = sum / n;
        System.out.println("Shortest height: " + shortest);
        System.out.println("Tallest height: " + tallest);
        System.out.println("Mean height: " + mean);
    }
}
