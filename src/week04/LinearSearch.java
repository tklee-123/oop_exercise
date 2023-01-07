package week04;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 6, 7, 8, 9, 40};
        System.out.println(linearSearch(array, 5)); // false
        System.out.println(linearSearch(array, 9)); // true
        System.out.println(linearSearchIndex(array, 8)); // 6
        System.out.println(linearSearchIndex(array, 10)); // 0
    }

    public static boolean linearSearch(int[] array, int key) {
        for (int idx = 0; idx < array.length; idx++) {
            if (array[idx] == key) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchIndex(int[] array, int key) {
        if (linearSearch(array, key)) {
            for (int idx = 1; idx <= array.length; idx++) {
                if (array[idx - 1] == key) {
                    return idx;
                }
            }
        }
        return 0;
    }
}
