import java.util.Scanner;

public class method1 {

    
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int students = scanner.nextInt();

        if (students < 2) {
            System.out.println("At least two students are required for handshakes.");
        } else {
            int handshakes = calculateHandshakes(students);
            System.out.println("The maximum number of handshakes among " + students + " students is: " + handshakes);
        }

        scanner.close();
    }
}
