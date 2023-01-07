package week03;

import java.util.Scanner;

public class SpecialSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = in.nextDouble();
        System.out.print("Enter number of terms: ");
        int numTerms = in.nextInt();
        if (x < -1 || x > 1) {
            System.out.println("Please choose a number from -1 to 1");
        } else {
            System.out.print("The sum of the series is " + calculateSeries(x, numTerms));
        }
    }

    public static double calculateTerm(double x, int numTerms) {
        if (numTerms == 1) {
            return x;
        } else {
            int maxOdd = numTerms * 2 - 1;
            int maxEven = numTerms * 2 - 2;
            double powerTerm = (Math.pow(x, maxOdd)) / maxOdd;
            int numerator = 1;
            for (int numMulti = maxOdd - 2; numMulti >= 1; numMulti -= 2) {
                numerator *= numMulti;
            }
            int denominator = 2;
            for (int numMulti = maxEven; numMulti > 2; numMulti -= 2) {
                denominator *= numMulti;
            }
            double multiTerm = (double) numerator / denominator;
            return powerTerm * multiTerm;
        }

    }

    public static double calculateSeries(double x, int numTerms) {
        double res = 0;
        for (int i = 1; i <= numTerms; i++) {
            res += calculateTerm(x, i);
        }
        return res;
    }
}
