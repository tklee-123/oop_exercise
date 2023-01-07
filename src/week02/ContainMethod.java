package week02;

import java.util.Scanner;

public class ContainMethod {
    public static void main(String[] args) {
        final int NUM_ARRAY;
        int[] array;
        int key;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        NUM_ARRAY = in.nextInt();
        System.out.println("Enter the value of all items: ");
        array = inputArr(NUM_ARRAY, in);
        System.out.print("Enter key: ");
        key = in.nextInt();
        in.close();
        System.out.println(contains(array, key));
    }

    public static boolean contains(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
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
}
