package jd07_tasks;

public class AddressClients {
    public static void main(String[] args) {


        Address cost1 = new Address();

        cost1.buildingNumber = 7925;
        cost1.street = "Jones Branch Dr";
        cost1.city = "McLean";
        cost1.state = "VA";
        cost1.zipCode = "A1A 2A2";

        System.out.println(cost1);
    }
}
