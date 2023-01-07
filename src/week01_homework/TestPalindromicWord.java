package week01_homework;

import java.util.Scanner;

public class TestPalindromicWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (isPalindromic(in)) {
            System.out.println("Your string is a palindromic word");
        } else {
            System.out.println("Your string is not a palindromic word");
        }
    }

    public static boolean isPalindromic(Scanner in) {
        System.out.print("Enter a String: ");
        String inStr = in.next().toLowerCase();
        int strLen = inStr.length();
        int fIdx = 0;
        int bIdx = strLen - 1;
        while (fIdx < bIdx) {
            if (inStr.charAt(fIdx) != inStr.charAt(bIdx)) {
                return false;
            } else {
                ++fIdx;
                --bIdx;
            }
        }
        return true;
    }
}
