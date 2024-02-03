package jd09;

public class ClassMatesReversed {
    public static void main(String[] args) {
        String[] classmates = {"Jennifer Lopez", "Jennifer Aniston", "Jennifer Garner"};

        for (String name : classmates) {
            StringBuilder reversedName = new StringBuilder(name).reverse();
            System.out.println(reversedName);
        }
    }
    }

