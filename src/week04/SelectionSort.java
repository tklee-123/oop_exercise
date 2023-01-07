package week04;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 9, 10, 67, 43, 34, 78, 2};
        System.out.println("The array at first: ");
        printArray(arr);
        selectionSort(arr);
        System.out.println();
        System.out.println("The sorted array: ");
        printArray(arr);
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
