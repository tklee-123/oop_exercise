package week04;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {56, 5, 8, 3, 23, 1, 7, 34, 59, 67};
        System.out.println("The array at first: ");
        printArray(arr);
        bubbleSort(arr);
        System.out.println();
        System.out.println("The sorted array: ");
        printArray(arr);
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
            n = n - 1;
        } while (swapped);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
