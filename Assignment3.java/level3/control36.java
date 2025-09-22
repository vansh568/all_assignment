import java.util.Scanner;

public class control36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int originalNum = num;
        int sum = 0;
        
        while (num != 0) {
            int digit = num % 10; // Extract last digit
            sum += digit * digit * digit; // Cube the digit and add to sum
            num /= 10; // Remove last digit
        }
        
        if (sum == originalNum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
