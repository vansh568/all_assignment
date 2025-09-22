import java.util.Scanner;

public class control3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("The first number is the largest");
        } else if (b > a && b > c) {
            System.out.println("The second number is the largest");
        } else if (c > a && c > b) {
            System.out.println("The third number is the largest");
        } else {
            System.out.println("There is a tie for the largest number");
        }
    }
}
