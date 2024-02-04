package m15_lab;

public class TrafficLight {
    public static void main(String[] args) {

        String trafficLight = "R";

        switch (trafficLight){
            case "R" , "r":
                System.out.println("Red");
                break;
            case "Y" , "y":
                System.out.println("Yellow");
                break;
            case "G" , "g" :
                System.out.println("Green");
                break;
            default:
                System.out.println("No Light!");
        }
    }
}
