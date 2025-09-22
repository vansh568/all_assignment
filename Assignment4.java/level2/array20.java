import java.util.Scanner;

public class array20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        int[] freq = new int[10];

        while (number > 0) {
            int digit = (int)(number % 10);
            freq[digit]++;
            number /= 10;
        }

        System.out.println("Digit\tFrequency");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println(i + "\t" + freq[i]);
            }
        }
    }
}
