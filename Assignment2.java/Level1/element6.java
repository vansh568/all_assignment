public class element6 {
    public static void main(String[] args) {
        double courseFee = 125000;
        double discountPercent = 10;

        double discountAmount = (discountPercent / 100) * courseFee;
        double discountedPrice = courseFee - discountAmount;

        System.out.println("Discount amount: INR " + discountAmount);
        System.out.println("Price to pay after discount: INR " + discountedPrice);
    }
}
