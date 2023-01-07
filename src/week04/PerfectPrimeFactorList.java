package week04;

import java.util.Scanner;

public class PerfectPrimeFactorList {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 0;
        System.out.print("Enter upper bound: ");
        int upperbound = in.nextInt();
        System.out.println("These numbers are products of prime factors:");
        for (int idx = 2; idx <= upperbound; idx++) {
            if (isProductOfPrimeFactor(idx)) {
                count++;
                System.out.print(idx + " ");
            }
        }
        System.out.println();
        System.out.printf("[%d numbers found (%2.2f%%)]", count, count * 100.0 / upperbound);
    }

    public static boolean isPrime(int number) {

        for (int idx = 2; idx < number; idx++) {
            if (number % idx == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isProductOfPrimeFactor(int aPostInt) {
        int multiply = 1;
        for (int idx = 1; idx < aPostInt; idx++) {
            if (isPrime(idx)) {
                if (aPostInt % idx == 0) {
                    multiply = multiply * idx;
                }
            }
        }
        if (multiply == aPostInt) {
            return true;
        } else {
            return false;
        }
    }
}
