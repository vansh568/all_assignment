import java.util.Scanner;

public class control38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;
        
        while (temp != 0) {
            sum += temp % 10; // Add last digit to sum
            temp /= 10;       // Remove last digit
        }
        
        if (num % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }
    }
}
