import java.util.*;

public class method28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        List<Integer> factorsList = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factorsList.add(i);
            }
        }

        int[] factors = factorsList.stream().mapToInt(i -> i).toArray();

        System.out.println("Factors of " + num + ": " + Arrays.toString(factors));
        System.out.println("Total factors: " + factors.length);

        int sum = 0, largest = factors[0], smallest = factors[0];
        List<Integer> evenFactors = new ArrayList<>();
        List<Integer> oddFactors = new ArrayList<>();

        for (int f : factors) {
            sum += f;
            if (f > largest) largest = f;
            if (f < smallest) smallest = f;
            if (f % 2 == 0) evenFactors.add(f);
            else oddFactors.add(f);
        }

        double mean = (double) sum / factors.length;

        System.out.println("Sum of factors: " + sum);
        System.out.println("Mean of factors: " + mean);
        System.out.println("Smallest factor: " + smallest);
        System.out.println("Largest factor: " + largest);
        System.out.println("Even factors: " + evenFactors);
        System.out.println("Odd factors: " + oddFactors);
    }
}
