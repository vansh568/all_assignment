import java.util.Scanner;

public class control27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int greatestFactor = 1;
        for (int i = num / 2; i >= 1; i--) {
            if (num % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        System.out.println("The greatest factor of " + num + " besides itself is: " + greatestFactor);
    }
}
