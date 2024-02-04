package jd07_tasks;

public class Item {

    public String itemName;
    public double unitPrice;
    public int quantity;

    public double calcCost(){
        return quantity*unitPrice;
    }

    public String toString() {
        double cost = calcCost();
        return "Item{" +
                "itemName:'" + itemName + '\'' +
                "\nunitPrice:" + unitPrice +
                "\nquantity:" + quantity +
                "\nCost:" + cost +
                '}';
    }
}
