package week01_homework;

import java.util.Scanner;

public class CheckHexStr {
    public static boolean checkHexStr(String Str) {
        for (int i = 0; i < Str.length(); i++) {
            char inChar = Str.charAt(i);
            if (inChar < '0' || (inChar > '9' && inChar < 'A') || (inChar > 'F' && inChar < 'a') || inChar > 'f') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String Str = in.nextLine();
        if (checkHexStr(Str)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
