import java.util.Scanner;

public class control24  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age of Amar: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter height of Amar (in cm): ");
        int heightAmar = sc.nextInt();

        System.out.print("Enter age of Akbar: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter height of Akbar (in cm): ");
        int heightAkbar = sc.nextInt();

        System.out.print("Enter age of Anthony: ");
        int ageAnthony = sc.nextInt();
        System.out.print("Enter height of Anthony (in cm): ");
        int heightAnthony = sc.nextInt();

        // Finding the youngest
        if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
            System.out.println("Youngest is Amar");
        } else if (ageAkbar < ageAmar && ageAkbar < ageAnthony) {
            System.out.println("Youngest is Akbar");
        } else if (ageAnthony < ageAmar && ageAnthony < ageAkbar) {
            System.out.println("Youngest is Anthony");
        } else {
            System.out.println("There is a tie for youngest");
        }

        // Finding the tallest
        if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
            System.out.println("Tallest is Amar");
        } else if (heightAkbar > heightAmar && heightAkbar > heightAnthony) {
            System.out.println("Tallest is Akbar");
        } else if (heightAnthony > heightAmar && heightAnthony > heightAkbar) {
            System.out.println("Tallest is Anthony");
        } else {
            System.out.println("There is a tie for tallest");
        }
    }
}
