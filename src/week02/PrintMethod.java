package week02;

import java.util.Scanner;

public class PrintMethod {
    public static void main(String[] args) {
        final int NUM_ITEMS;
        int[] items;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        NUM_ITEMS = in.nextInt();
        System.out.println("Enter the value of all items: ");
        items = inputArr(NUM_ITEMS, in);
        print(items);
        in.close();
    }

    public static int[] inputArr(int numItems, Scanner in) {
        int[] items;
        if (numItems == 0) {
            items = new int[0];
        } else {

            items = new int[numItems];


            for (int i = 0; i < items.length; i++) {
                items[i] = in.nextInt();
            }

        }

        return items;
    }

    public static void print(int[] array) {
        if (array.length == 0) {
            System.out.print("[]");
        } else {
            System.out.print("[" + array[0]);
            for (int i = 1; i < array.length; i++) {
                System.out.print(", " + array[i]);
            }
            System.out.print(']');
        }

    }
}
