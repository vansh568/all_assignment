import java.util.Scanner;

public class element17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base of triangle (cm): ");
        double base = sc.nextDouble();

        System.out.print("Enter height of triangle (cm): ");
        double height = sc.nextDouble();

        double areaCm = 0.5 * base * height;
        double areaInch = areaCm / 6.4516;

        System.out.println("\nArea of Triangle:");
        System.out.println("In square centimeters: " + areaCm);
        System.out.println("In square inches: " + areaInch);

        sc.close();
    }
}
