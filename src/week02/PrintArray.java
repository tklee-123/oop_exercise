package week02;

import java.util.Scanner;

public class PrintArray {
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

        if (numItems > 0) {

            for (int i = 0; i < items.length; i++) {
                items[i] = in.nextInt();
            }
        }
        return items;


    }

    public static void printArr(int[] arr) {

        if (arr.length == 0) {
            System.out.println("[]");
        } else {
            System.out.print("[" + arr[0]);
            for (int i = 1; i < arr.length; i++) {

                System.out.printf(",%s", arr[i]);
            }
            System.out.print("]");
        }

    }
}
