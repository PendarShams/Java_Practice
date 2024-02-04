package live_lab_w4;

public class PurchaseCalculator {

    public static void main(String[] args) {

        double saleTaxRate = 13;
        String itemName = "Barbie";
        double unitPrice = 20.99;
        int quantity = 1;

        double tax = unitPrice*(saleTaxRate/100);
        double total = quantity*unitPrice;
        double grandTotal = (total + tax);

        System.out.println("Item Name : " + itemName);
        System.out.println("Unit Price : $" + unitPrice);
        System.out.println("Quantity : " + quantity);
        System.out.println("Sale Tax Rate : %" + saleTaxRate);
        System.out.println("\n");
        System.out.println("Total : $" + total);
        System.out.println("Tax : $" + tax);
        System.out.println("===============================");
        System.out.println("Grand Total : $" + grandTotal);
    }
}
