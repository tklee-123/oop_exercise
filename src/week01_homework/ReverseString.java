package week01_homework;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String inStr;
        int inStrLen;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        inStr = in.next();
        inStrLen = inStr.length();
        System.out.print("The reverse of the String " + inStr + "is ");

        for (int charIdx = inStrLen - 1; charIdx >= 0; --charIdx) {
            System.out.print(inStr.charAt(charIdx));
        }
    }
}
