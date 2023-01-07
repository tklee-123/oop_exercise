package week04;

import java.util.Scanner;

public class PerfectNumberList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int upperbound = in.nextInt();
        int countPerfectNum = 0;
        int countOtherNum = 0;
        System.out.println("These numbers are perfect:");
        for (int number = 1; number <= upperbound; number++) {
            if (isPerfect(number)) {
                countPerfectNum++;
                System.out.print(number + " ");
            }
        }
        System.out.println();
        double perfectNumPercent = (double) 100.0 * countPerfectNum / upperbound;
        System.out.printf("%d perfect numbers found (%2.2f%%)\n", countPerfectNum, perfectNumPercent);
        System.out.println("These numbers are neither deficient nor perfect: ");
        for (int number = 1; number <= upperbound; number++) {
            if (isDeficient(number) == false && isPerfect(number) == false) {
                countOtherNum++;
                System.out.print(number + " ");
            }
        }
        System.out.println();
        double otherNumPercent = (double) 100.0 * countOtherNum / upperbound;
        System.out.printf("%d numbers found (%2.2f%%)\n", countOtherNum, otherNumPercent);
        in.close();
    }

    public static boolean isPerfect(int aPosInt) {
        int sumDivisors = 0;
        for (int i = 1; i < aPosInt; i++) {
            if (aPosInt % i == 0) {
                sumDivisors += i;
            }
        }
        if (sumDivisors == aPosInt) {
            return true;
        }
        return false;
    }

    public static boolean isDeficient(int aPosInt) {
        int sumDivisors = 0;
        for (int i = 1; i < aPosInt; i++) {
            if (aPosInt % i == 0) {
                sumDivisors += i;
            }
        }
        if (sumDivisors < aPosInt) {
            return true;
        }
        return false;
    }
}
