package week04;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array's length: ");
        int length = in.nextInt();
        System.out.println("Enter array: ");
        int[] array = input(length, in);
        System.out.println("Enter key: ");
        int key = in.nextInt();
        int fromIdx = 0;
        int toIdx = length;
        if (binarySearch(array, key, fromIdx, toIdx)) {
            System.out.println("Key exist");
        } else {
            System.out.println("Key doesn't exist");
        }
    }

    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
        int count = 0;
        for (int idx = fromIdx; idx < toIdx; idx++) {
            int middleIdx = (fromIdx + toIdx) / 2;
            if (array[middleIdx] == key) {
                count++;
            } else if (array[middleIdx] < key) {
                fromIdx = middleIdx;
            } else {
                toIdx = middleIdx - 1;
            }
        }
        if (count == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static int[] input(int length, Scanner in) {
        int[] array = new int[length];
        for (int idx = 0; idx < length; idx++) {
            array[idx] = in.nextInt();
        }
        return array;
    }
}
