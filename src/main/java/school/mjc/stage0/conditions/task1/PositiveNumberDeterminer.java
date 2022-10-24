package school.mjc.stage0.conditions.task1;

public class PositiveNumberDeterminer {
    public static void isPositive(int numberToBeDetermined) {
        if (numberToBeDetermined > 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }
    }

    public static void main(String[] args) {
        isPositive(10);
    }
}
