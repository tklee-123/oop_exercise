package week01_homework;

import java.util.Scanner;

public class Hex2Dec {
    public static boolean checkHex(String hex) {
        for (int i = 0; i < hex.length(); i++) {
            char inChar = hex.charAt(i);
            if (inChar < '0' || (inChar > '9' && inChar < 'a') || (inChar > 'f')) {
                return false;
            }
        }
        return true;
    }

    public static int char2Int(Character ch) {
        switch (ch) {
            case 'a':
                return 10;
            case 'b':
                return 11;
            case 'c':
                return 12;
            case 'd':
                return 13;
            case 'e':
                return 14;
            case 'f':
                return 15;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Hexadecimal string: ");
        String hex = in.nextLine();
        int dec = 0, count = 0;
        if (checkHex(hex)) {
            do {
                char temp = hex.charAt(hex.length() - 1);
                if (temp >= '0' && temp <= '9') {
                    dec += Integer.parseInt(String.valueOf(temp)) * Math.pow(16, count);
                } else {
                    dec += char2Int(temp) * Math.pow(16, count);
                }
                count++;
                hex = hex.substring(0, hex.length() - 1);
            } while (!hex.equals(""));

            System.out.println("The equivalent decimal number is " + dec);
        } else {
            System.out.println("error: invalid hexadecimal string " + hex);
        }
    }
}
