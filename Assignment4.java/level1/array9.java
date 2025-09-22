import java.util.Scanner;

public class array9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] twoD = new int[rows][cols];
        int[] oneD = new int[rows * cols];
        int index = 0;

        System.out.println("Enter elements of 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                twoD[i][j] = sc.nextInt();
                oneD[index++] = twoD[i][j];
            }
        }

        System.out.println("2D Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Copied 1D Array: ");
        for (int i = 0; i < oneD.length; i++) {
            System.out.print(oneD[i] + " ");
        }

        sc.close();
    }
}
