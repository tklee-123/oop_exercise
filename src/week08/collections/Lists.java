package week08.collections;
import java.util.*;

public class Lists {
    public static void insertFirst(ArrayList<Integer> list, int value) {
        list.add(0, value);
    }

    public static void insertLast(ArrayList<Integer> list, int value) {
        list.add(list.size() - 1, value);
    }

    public static void replace(ArrayList<Integer> list, int value) {
        list.set(2, value);
    }

    public static void removeThird(ArrayList<Integer> list) {
        list.remove(2);
    }

    public static void removeEvil(ArrayList<Integer> list) {
        if (list == null) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 666) {
                list.remove(i);
            }
        }
    }

    public static boolean squareNumber(int number) {
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (i * i == number) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList<Integer> generateSquare() {
        ArrayList<Integer> firstTenSquareNumber = new ArrayList<>();
        for (int num = 1; firstTenSquareNumber.size() <= 10; num++) {
            if (squareNumber(num)) {
                firstTenSquareNumber.add(num);
            }
        }
        return firstTenSquareNumber;
    }

    public static boolean contains(ArrayList<Integer> list, int value) {
        if (list.contains(value)) {
            return true;
        }
        return false;
    }

    public static void copy(ArrayList<Integer> source, ArrayList<Integer> target) {
        for (int idx = 0; idx < source.size(); idx++) {
            target.add(source.get(idx));
        }
    }

    public static void reverse(ArrayList<Integer> list) {
        Collections.reverse(list);
    }

    public static void reverseManual(ArrayList<Integer> list) {
        for (int i = 0, j = list.size() - 1; i < j; i++) {
            int temp = list.remove(j);
            list.add(i, temp);
        }
    }

    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        list.addFirst(value);
        list.addLast(value);
    }
}
