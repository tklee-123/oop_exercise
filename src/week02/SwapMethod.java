package week02;

public class SwapMethod {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 8, 9, 10};
        int[] arr2 = {9, 8, 7};
        System.out.println(swap(arr1, arr2));
    }

    public static boolean swap(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        } else {
            for (int i = 0; i < array1.length; i++) {
                int temp = array1[i];
                array1[i] = array2[i];
                array2[i] = temp;
            }
        }
        return true;
    }
}
