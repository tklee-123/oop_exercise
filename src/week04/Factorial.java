package week04;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        for (int i = 1; i < n; i++) {
            System.out.printf("factorial(%d) = %d * %d = %d\n", i, i, factorial(i - 1), factorial(i));
        }
        System.out.printf("factorial(%d) = %d * %d = %d (DONE)", n, n, factorial(n - 1), factorial(n));
        in.close();
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
