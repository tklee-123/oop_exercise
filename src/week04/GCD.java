package week04;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num_1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int num_2 = in.nextInt();
        System.out.printf("The G.C.D of %d and %d is %d", num_1, num_2, gcd(num_1, num_2));
        in.close();
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
