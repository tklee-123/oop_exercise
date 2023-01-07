package week02;

import java.util.Scanner;

public class ArrayToString {
    public static void main(String[] args) {
        final int NUM_ITEMS;
        int[] items;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        NUM_ITEMS = in.nextInt();
        System.out.println("Enter the value of all items: ");
        items = inputArr(NUM_ITEMS, in);
        System.out.print(arrayToString(items));
        in.close();
    }

    public static String arrayToString(int[] array) {
        String[] strArr = new String[array.length];
        String stringArr = "[";
        for (int i = 0; i < array.length - 1; i++) {
            strArr[i] = Integer.toString(array[i]);
            stringArr += strArr[i] + ",";
        }
        strArr[array.length - 1] = Integer.toString(array[array.length - 1]);
        stringArr += strArr[array.length - 1] + "]";
        return stringArr;
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
