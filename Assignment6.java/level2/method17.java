import java.util.Scanner;

public class method17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar's age: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = sc.nextInt();

        System.out.print("Enter Amar's height in cm: ");
        double heightAmar = sc.nextDouble();
        System.out.print("Enter Akbar's height in cm: ");
        double heightAkbar = sc.nextDouble();
        System.out.print("Enter Anthony's height in cm: ");
        double heightAnthony = sc.nextDouble();

        // Find youngest
        int minAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngest = "";
        if (minAge == ageAmar) youngest += "Amar ";
        if (minAge == ageAkbar) youngest += "Akbar ";
        if (minAge == ageAnthony) youngest += "Anthony ";

        // Find tallest
        double maxHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallest = "";
        if (maxHeight == heightAmar) tallest += "Amar ";
        if (maxHeight == heightAkbar) tallest += "Akbar ";
        if (maxHeight == heightAnthony) tallest += "Anthony ";

        System.out.println("Youngest friend(s): " + youngest.trim());
        System.out.println("Tallest friend(s): " + tallest.trim());

        sc.close();
    }
}
