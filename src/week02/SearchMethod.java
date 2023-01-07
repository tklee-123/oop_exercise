package week02;

import java.util.Scanner;

public class SearchMethod {
    public static void main(String[] args) {
        final int NUM_ARRAY;
        int[] array;
        int key;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of array: ");
        NUM_ARRAY = in.nextInt();
        System.out.println("Enter the value of all array: ");
        array = inputArr(NUM_ARRAY, in);
        System.out.print("Enter key: ");
        key = in.nextInt();
        in.close();
        System.out.println(search(array, key));
    }

    public static int search(int[] array, int key) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                index = i;
            }
        }
        return index;
    }

    public static int[] inputArr(int numArr, Scanner in) {
        int[] arr;
        if (numArr == 0) {
            arr = new int[0];
        } else {

            arr = new int[numArr];


            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }

        }

        return arr;
    }
}
