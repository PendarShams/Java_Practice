package m11_lab;

public class EligibleToDrive {

    public static void main(String[] args) {

        double ageMike = 15.5;
        double ageMary = 17;

        boolean hasLearningPermit = true;
        boolean hasNoLearningPermit = false;
        boolean hasDriverLicense = true;
        boolean hasNoDriverLicense = false;


        boolean result1 = ((ageMike>=15.5) & (hasLearningPermit)) || ((ageMike>=18) & (hasNoDriverLicense));
        boolean result2 = ((ageMary>=15.5) & (hasNoLearningPermit)) || ((ageMary>=18) & (hasDriverLicense));


        System.out.println("Is Mike eligible to drive? " + result1);
        System.out.println("Is Mary eligible to drive? " + result2);
    }
}
