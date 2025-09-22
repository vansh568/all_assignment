import java.util.Scanner;

public class element20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter unit price of the item: ");
        double unitPrice = sc.nextDouble();

        System.out.print("Enter quantity to be bought: ");
        int quantity = sc.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println("Total price: " + totalPrice);

        sc.close();
    }
}
