import java.util.Scanner;

public class array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10]; 
        int count = 0;
        int sum = 0;

        System.out.println("Enter up to 10 positive numbers (enter 0 or negative to stop):");

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if (num <= 0) {
                break;
            }
            numbers[count] = num;
            sum += num;
            count++;
        }

        System.out.print("Numbers entered: ");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }

        
        System.out.println("\nSum of numbers: " + sum);

        sc.close();
    }
}
