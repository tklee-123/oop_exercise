package week02;

import java.util.Arrays;
import java.util.Scanner;

public class CopyOfMethod {
    public static void main(String[] args) {
        final int NUM_ARRAY;
        int[] array;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of array: ");
        NUM_ARRAY = in.nextInt();
        System.out.println("Enter the all value of array: ");
        array = inputArr(NUM_ARRAY, in);
        System.out.print("Enter new length: ");
        int newLength = in.nextInt();
        in.close();
        System.out.println(Arrays.toString(copyOf(array)));
        System.out.println(Arrays.toString(copyOfNewLength(array, newLength)));
    }

    public static int[] copyOf(int[] array) {
        int[] copiedArray = Arrays.copyOf(array, array.length);
        return copiedArray;
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

    public static int[] copyOfNewLength(int[] array, int newLength) {
        int[] copiedArray = Arrays.copyOf(array, newLength);
        return copiedArray;
    }

}
