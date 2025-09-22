import java.util.Scanner;

public class element12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base of the triangle (in inches): ");
        double baseInches = sc.nextDouble();

        System.out.print("Enter the height of the triangle (in inches): ");
        double heightInches = sc.nextDouble();

        double areaInches = 0.5 * baseInches * heightInches;
        double areaCm = areaInches * 6.4516; // 1 square inch = 6.4516 cm²

        System.out.println("Area of the triangle: " + areaInches + " square inches");
        System.out.println("Area of the triangle: " + areaCm + " square centimeters");
    }
}
