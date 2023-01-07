package week02;

import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        final int SENTINEL = -1;
        int number;
        int magicsum = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a positive integer (or -1 to end): ");
        number = in.nextInt();


        while (number != SENTINEL) {
            if (hasEight(number)) {
                magicsum += number;
            }
            System.out.print("Enter a positive integer (or -1 to end): ");
            number = in.nextInt();

        }
        System.out.println("The magic sum is: " + magicsum);
    }

    public static boolean hasEight(int number) {
        int mod;
        while (number > 0) {
            mod = number % 10;
            if (mod == 8) {
                return true;
            }
            number = number / 10;

        }
        return false;
    }
}
