package m15_lab;

public class LaptopModel {
    public static void main(String[] args) {
         String laptop = "apple";

         switch (laptop){
             case "apple" :
                 System.out.println("Apple: " + "No Virus");
                 break;
             case "dell" :
                 System.out.println("Dell: " + "Tough One");
                 break;
             case "hp" :
                 System.out.println("hp: " + "Not recommended!");
                 break;
             default:
                 System.out.println("Do not buy that one!");


         }



    }
}
