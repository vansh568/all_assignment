import java.util.Scanner;

public class method10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter angle in degrees: ");
        double degrees = sc.nextDouble();

        // Convert degrees to radians because Math class uses radians
        double radians = Math.toRadians(degrees);

        double sinValue = Math.sin(radians);
        double cosValue = Math.cos(radians);
        double tanValue = Math.tan(radians);
        double cotValue = 1.0 / tanValue;   // cot(x) = 1 / tan(x)
        double secValue = 1.0 / cosValue;   // sec(x) = 1 / cos(x)
        double cscValue = 1.0 / sinValue;   // csc(x) = 1 / sin(x)

        System.out.println("sin(" + degrees + ") = " + sinValue);
        System.out.println("cos(" + degrees + ") = " + cosValue);
        System.out.println("tan(" + degrees + ") = " + tanValue);
        System.out.println("cot(" + degrees + ") = " + cotValue);
        System.out.println("sec(" + degrees + ") = " + secValue);
        System.out.println("csc(" + degrees + ") = " + cscValue);

        sc.close();
    }
}
