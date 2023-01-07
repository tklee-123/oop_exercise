package week04;

import java.util.Scanner;

public class GCD2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 integers: ");
        int integer1 = in.nextInt();
        int integer2 = in.nextInt();
        if (integer1 == 0 || integer2 == 0) {
            System.out.println("0");
        } else {
            System.out.println("GCD is " + gcd(integer1, integer2));
        }
        in.close();
    }

    public static int gcd(int integer1, int integer2) {
        int min = Math.min(integer1, integer2);
        int max = Math.max(integer1, integer2);
        while (min != 0) {
            int temp = min;
            min = max % min;
            max = temp;
        }
        return max;
    }
}
