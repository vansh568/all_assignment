import java.util.Scanner;

public class control37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        int temp = num;
        
        if (num == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                temp /= 10; // Remove last digit
                count++;    // Increment count
            }
        }
        
        System.out.println("Number of digits: " + count);
    }
}
