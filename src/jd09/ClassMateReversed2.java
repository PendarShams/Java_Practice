package jd09;

public class ClassMateReversed2 {
    public static void main(String[] args) {
        String[] classmates = {"Jennifer Lopez", "Jennifer Aniston", "Jennifer Garner"};

        for (String name : classmates) {
            System.out.println(reverseMates(name));
        }
    }

    private static String reverseMates(String classmates) {
        return new StringBuilder(classmates).reverse().toString();
    }
}
