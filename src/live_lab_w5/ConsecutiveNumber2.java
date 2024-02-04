package live_lab_w5;

public class ConsecutiveNumber2 {
    public static void main(String[] args) {
        ConsecutiveNumber(17);

    }


    public static void ConsecutiveNumber(int N) {
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println("CodilityTestCoders");
            } else if (i % 2 == 0) {
                System.out.println("Codility");
            } else if (i % 3 == 0) {
                System.out.println("Test");
            } else if (i % 5 == 0) {
                System.out.println("Coders");
            } else if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("CodilityTest");
            } else if (i % 5 == 0 && i % 2 == 0) {
                System.out.println("CodilityCoders");
            } else if (i % 3 == 0 && i % 2 == 0) {
                System.out.println("TestCoders");
            } else {
                System.out.println(i);
            }
        }
    }
}
