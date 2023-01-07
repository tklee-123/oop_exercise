package week02;

import java.util.Scanner;

public class PrintArrayinStars {
    public static void main(String[] args) {
        final int NUM_ITEMS;
        int[] items;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        NUM_ITEMS = in.nextInt();
        System.out.print("Enter the value of all items: ");
        items = inputArr(NUM_ITEMS, in);
        printArr(items);
        in.close();


    }

    public static int[] inputArr(int numItems, Scanner in) {
        int[] items;
        items = new int[numItems];

        if (items.length > 0) {
            for (int i = 0; i < items.length; i++) {
                items[i] = in.nextInt();
            }
        }
        return items;


    }

    public static void printArr(int[] items) {
        for (int idx = 0; idx < items.length; ++idx) {
            System.out.print(items[idx] + ": ");
            for (int starNo = 1; starNo <= items[idx]; ++starNo) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
