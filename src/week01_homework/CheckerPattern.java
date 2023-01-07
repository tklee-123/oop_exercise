package week01_homework;

import java.util.Scanner;

public class CheckerPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = in.nextInt();
        for (int row = 1; row <= size; row++) {
            if ((row % 2) == 0) {
                System.out.print(" ");
            }
            for (int col = 1; col <= size; col++) {
                System.out.print("#");
            }
            System.out.println();

        }
    }
}
