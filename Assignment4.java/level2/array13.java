import java.util.Scanner;

public class array13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String numStr = Integer.toString(num);
        int[] digits = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }

        int largest = -1, secondLargest = -1;

        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }

        System.out.print("Digits in array: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }

        System.out.println("\nLargest digit: " + largest);
        if (secondLargest == -1) {
            System.out.println("Second largest digit does not exist.");
        } else {
            System.out.println("Second largest digit: " + secondLargest);
        }

        sc.close();
    }
}
