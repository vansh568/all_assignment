public class element4 {
    public static void main(String[] args) {
        double costPrice = 129;
        double sellingPrice = 191;

        if (sellingPrice > costPrice) {
            double profit = sellingPrice - costPrice;
            double profitPercent = (profit / costPrice) * 100;
            System.out.println("Profit: INR " + profit);
            System.out.println("Profit Percentage: " + profitPercent + "%");
        } else if (sellingPrice < costPrice) {
            double loss = costPrice - sellingPrice;
            double lossPercent = (loss / costPrice) * 100;
            System.out.println("Loss: INR " + loss);
            System.out.println("Loss Percentage: " + lossPercent + "%");
        } else {
            System.out.println("No profit, no loss.");
        }
    }
}
