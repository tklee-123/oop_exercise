package week04;

import java.util.Scanner;

public class PrimeList {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter upper bound: ");
        int upperbound = in.nextInt();
        int count = 0;
        for (int idx = 1; idx <= upperbound; idx++) {
            if (isPrime(idx)) {
                count++;
                System.out.println(idx + " ");
            }
        }
        System.out.printf("[%d primes found (%2.2f%%)]", count, count * 100.0 / upperbound);
    }

    public static boolean isPrime(int number) {

        for (int idx = 2; idx <= Math.sqrt(number); idx++) {
            if (number % idx == 0) {
                return false;
            }
        }
        return true;
    }
}
