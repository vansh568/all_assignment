import java.util.Scanner;

public class control2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a < b && a < c) {
            System.out.println("The first number is the smallest");
        } else {
            System.out.println("The first number is not the smallest");
        }
    }
}
