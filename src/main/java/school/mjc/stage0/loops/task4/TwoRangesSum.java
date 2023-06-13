package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public static void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int sumOfSkipped = 0;
        int sumOfCounted = 0;

        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
            return;
        }
        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bigger then the last");
            return;
        }
        for (int i = 1; i <= lastInRow; i++) {
            if (0 < numberToSkip) {
                numberToSkip--;
                System.out.println(i);
                sumOfSkipped += i;
                continue;
            }
            sumOfCounted += i;
        }
        System.out.println("skipped sum is " + sumOfSkipped);
        System.out.println("counted sum is " + sumOfCounted);
    }

    public static void main(String[] args) {
        printSumOfTwoRanges(5, 10);
    }
}
