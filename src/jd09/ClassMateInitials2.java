package jd09;

public class ClassMateInitials2 {
    public static void main(String[] args) {

        String[] classmates = {"john doe", "Alen kut", "Boba Jen",
                "Pend Ar", "Jennifer Aniston", "Jeniffer Lopez"};
        initials(classmates);
}

    private static void initials(String[] names) {
        for (String name : names) {

            String[] parts = name.split(" ");

            System.out.println(parts[0].charAt(0) + "." + parts[1].charAt(0));
        }
}}
