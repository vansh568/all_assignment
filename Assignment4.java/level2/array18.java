import java.util.Scanner;

public class array18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

    
        double[][] marks = new double[n][4];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.print("Enter Physics marks: ");
            marks[i][0] = sc.nextDouble();
            System.out.print("Enter Chemistry marks: ");
            marks[i][1] = sc.nextDouble();
            System.out.print("Enter Maths marks: ");
            marks[i][2] = sc.nextDouble();

            
            marks[i][3] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            
            if (marks[i][3] >= 90) {
                grade[i] = "A";
            } else if (marks[i][3] >= 75) {
                grade[i] = "B";
            } else if (marks[i][3] >= 50) {
                grade[i] = "C";
            } else if (marks[i][3] >= 35) {
                grade[i] = "D";
            } else {
                grade[i] = "Fail";
            }
        }

        System.out.println("\n--- Student Report ---");
        System.out.printf("%-10s %-10s %-10s %-12s %-10s%n", 
                          "Physics", "Chemistry", "Maths", "Percentage", "Grade");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-12.2f %-10s%n",
                    marks[i][0], marks[i][1], marks[i][2], marks[i][3], grade[i]);
        }

        sc.close();
    }
}
