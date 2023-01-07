package week01_homework;

import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = in.nextInt();
        System.out.print("* |");
        for (int i = 1; i <= size; i++) {
            System.out.printf("\t%4d", i);
        }
        System.out.println();
        for (int i = 1; i <= size + 1; i++) {
            System.out.print("-------");
        }
        System.out.println();
        for (int row = 1; row <= size; row++) {
            System.out.print(row + " " + "|");
            for (int col = 1; col <= size; col++) {
                System.out.printf("\t%4d", col * row);
            }
            System.out.println();
        }
    }
}
