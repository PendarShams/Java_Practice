package jd09;

import java.util.Arrays;

public class ClassMatesInitials {
    public static void main(String[] args) {

        String[] classmates = {"john doe", "Alen kut", "Boba Jen",
                "Pend Ar", "Jennifer Aniston", "Jeniffer Lopez"};

        String[] initials = findInitials(classmates);
        for (String initial : initials) {
            System.out.println(initial);
        }
    }

    public static String[] findInitials(String[] classmates) {

        String[] init = new String[classmates.length];

        for (int i = 0; i < classmates.length; i++) {
            init[i] = classmates[i].charAt(0) + "." + classmates[i].charAt(classmates[i].indexOf(" ") + 1);
        }
        return init;
    }

}