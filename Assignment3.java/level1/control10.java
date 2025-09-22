import java.util.Scanner;

public class control10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num;

        do {
            System.out.print("Enter a number (0 to stop): ");
            num = sc.nextInt();
            sum += num;
        } while (num != 0);

        System.out.println("The sum of the entered numbers is: " + sum);
    }
}
