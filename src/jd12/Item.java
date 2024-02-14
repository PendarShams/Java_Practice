package jd12;

public class Item {
        private String name;
        private double unitPrice;
        private int quantity;

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }


    public String getName() {
            return name;
        }

        public void setName(String name) {

            if (name == null || name.isBlank() || name.isEmpty()) {
                System.err.println("Name Cannot Be Blank Nor Empty");
                System.exit(1);
            } else {
                for (char each : name.toCharArray()) {
                    if (!Character.isLetterOrDigit(each) && each != ' ') {
                        System.err.println("Name cannot contain any special characters other than space.");
                        System.exit(1);
                    }
                }
                if(!Character.isLetter(name.charAt(0))){
                    System.err.println("Name must start with letters");
                    System.exit(1);
                }

            }
            this.name = name;
        }

        public double getUnitPrice() {
            return unitPrice;
        }

        public void setUnitPrice(double unitPrice) {
            if (unitPrice < 0) {
                System.err.println("Unit Price Cannot Be Negative");
                System.exit(1);
            }
            this.unitPrice = unitPrice;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            if (quantity < 0) {
                System.err.println("Unit Quantity Cannot Be Negative");
                System.exit(1);
            }
            this.quantity = quantity;
        }

        public Item() {
            this.quantity = 1;
        }

        public double calcCost() {
            return unitPrice * quantity;
        }

        @Override
        public String toString() {
            return "Item"  + "{" +
                    "name='" + name + '\'' +
                    ", unitPrice=" + unitPrice +
                    ", quantity=" + quantity +
                    ", total cost=" + calcCost() +
                    '}';
        }
    }


