package week02;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseMethod {
    public static void main(String[] args) {
        final int NUM_ARRAY;
        int[] array;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of array: ");
        NUM_ARRAY = in.nextInt();
        System.out.println("Enter the all value of array: ");
        array = inputArr(NUM_ARRAY, in);
        reverse(array);
    }

    public static void reverse(int[] array) {
        int[] reversedArray = new int[array.length];
        int j = array.length;
        for (int i = 0; i < array.length; i++) {
            reversedArray[j - 1] = array[i];
            j = j - 1;
        }
        System.out.println(Arrays.toString(reversedArray));
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
