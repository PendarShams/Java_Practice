package jd07_tasks;

public class itemClients {
    public static void main(String[] args) {

        Item bill = new Item();
        bill.unitPrice=79.99;
        bill.quantity=2;
        bill.itemName="Laptop";

        double total = bill.calcCost();

        System.out.println(total);
        System.out.println(bill);
    }
}
