package week04;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {56, 5, 8, 3, 23, 1, 7, 34, 59, 67};
        System.out.println("The array at first: ");
        printArray(arr);
        insertionSort(arr);
        System.out.println();
        System.out.println("The sorted array: ");
        printArray(arr);
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
