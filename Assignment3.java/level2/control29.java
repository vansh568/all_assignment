import java.util.Scanner;

public class control29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Multiples of " + num + " below 100 are:");
        for (int i = num; i < 100; i += num) {
            System.out.print(i + " ");
        }
    }
}
