package jd11;
//Create a custom class named Pizza with the following specifications:
//
//    Attributes:
//		   size
//		   numberOfCheeseTopping
//		   numberOfPepperoniTopping
//
//	Actions:
//		calcCost(): returns the totalCost of the pizza
//		toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()
//
//   Pizza cost is determined by:
//   		Small: $10 + $2 per topping
//   		Medium: $12 + $2 per topping
//   		Large: $14 + $2 per topping
//
//    Create another class named PizzaClients, create multiple pizza objects, and test each function of the pizza object.
public class Pizza {

    public String size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;

    public Pizza (String size, int numberOfCheeseTopping, int numberOfPepperoniTopping){
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double calcCost(){
        double cost = 0;
        switch (size.toLowerCase()) {
            case "small":
                cost = 10.0;
                break;
            case "medium":
                cost = 12.0;
                break;
            case "large":
                cost = 14.0;
                break;
            default:
                System.out.println("Invalid pizza size: " + size);
        }
        return cost + 2.0 * (numberOfCheeseTopping + numberOfPepperoniTopping);
    }

    public String toString() {
        return "Pizza{" +
                "Size : " + size + "\n"+
                " Number Of Cheese Topping : " + numberOfCheeseTopping + "\n"+
                " Number Of Pepperoni Topping: " + numberOfPepperoniTopping + "\n"+
                "Total Cost : " + calcCost()+
                '}';
    }
}

