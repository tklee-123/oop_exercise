package week04;

import java.util.Scanner;

public class NumberSequenceLength {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        System.out.printf("The length of S(%d) is %d", n, calculateNumberSequenceLength(n));
        in.close();
    }

    public static int calculateNumberSequenceLength(int n) {
        if (n == 1) {
            return 1;
        } else {
            return calculateNumberSequenceLength(n - 1) + numOfDigits(n);
        }
    }

    public static int numOfDigits(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }
}
