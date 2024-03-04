package jd12;

public class Candy {
    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        setBrand(brand);
        setQuantity(quantity);
        setPrice(price);
        this.hasPeanuts = hasPeanuts;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0) {
<<<<<<< HEAD
            System.err.println("Quantity cannot be zero or negative.");
=======
            System.out.println("Quantity cannot be zero or negative.");
>>>>>>> origin/master
            System.exit(1);
    } else {
            this.quantity = quantity;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
<<<<<<< HEAD
            System.err.println("Price cannot be negative.");
=======
            System.out.println("Price cannot be negative.");
>>>>>>> origin/master
            System.exit(1);
        } else if (price == 0) {
            System.out.println("Free Item");
    } else {
            this.price = price;
        }
    }

<<<<<<< HEAD


=======
>>>>>>> origin/master
    public boolean isHasPeanuts() {
        return hasPeanuts;
    }


    public String toString() {
        String priceString = price == 0 ? "free" : String.valueOf(price);
        return "Candy [Brand=" + brand + ", Price=" + priceString + ", Quantity=" + quantity + "]";
    }
}


//Create a custom class named Candy with the following specifications:
//
//	Attributes:
//		brand
//		quantity
//		price
//		hasPeanuts
//
//	Ensure encapsulation for all fields.
//		Conditions:
//			The price of candy cannot be set to a negative value.
//			The quantity of candy cannot be set to zero or a negative value.
//
//	Add a constructor that allows the user to set all fields during object creation.
//
//	Actions:
//		toString(): Displays the brand, unit price, and quantity when the object is printed. If the price is zero, display "free" instead of 0.
//
//	Create another class named CandyClients, create multiple candy objects, and test each function of the candy object.
