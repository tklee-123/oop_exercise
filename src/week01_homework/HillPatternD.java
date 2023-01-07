package week01_homework;

import java.util.Scanner;

public class HillPatternD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = in.nextInt();
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= 2 * size - 1; col++) {
                if ((row + col > size + 1) && (row > col - size + 1)) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
        for (int row = 1; row <= size - 1; row++) {
            for (int col = 1; col <= 2 * size - 1; col++) {
                if ((row + col < 2 * size - 1) && (col - row > 1)) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}
