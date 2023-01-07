package week01_homework;

import java.util.Scanner;

public class RadixN2Dec {
    public static boolean checkBin(String Bin) {
        for (int i = 0; i < Bin.length(); i++) {
            if (Bin.charAt(i) != '0' && Bin.charAt(i) != '1') {
                return false;
            }
        }
        return true;
    }

    public static void bin2Dec(String bin) {
        int dec = 0;
        if (checkBin(bin)) {
            int intBin = Integer.parseInt(bin);
            int count = 0;
            while (intBin != 0) {
                int temp = intBin % 10;
                dec += temp * Math.pow(2, count);
                count++;
                intBin = intBin / 10;
            }
            System.out.println("The equivalent decimal number for binary " + bin + " is: " + dec);
        } else {
            System.out.println("error: invalid binary string " + bin);
        }
    }

    //Octal string into its equivalent decimal number.
    public static boolean checkOct(String Str) {
        for (int i = 0; i < Str.length(); i++) {
            if (Str.charAt(i) < '0' || Str.charAt(i) > '7') {
                return false;
            }
        }
        return true;
    }

    public static void oct2Dec(String Oct) {
        int dec = 0, count = 0;
        if (checkOct(Oct)) {
            int octInt = Integer.parseInt(Oct);
            while (octInt != 0) {
                dec += (octInt % 10) * Math.pow(8, count);
                count++;
                octInt /= 10;
            }
            System.out.println("The equivalent decimal number is: " + dec);
        } else {
            System.out.println("error: invalid Octal string.");
        }
    }

    //Hexadecimal string into its equivalent decimal number.

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

    public static void hex2Dec(String hex) {
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

    public static void main(String[] args) {
        System.out.println("Enter the radix:");
        Scanner in = new Scanner(System.in);
        int radix = in.nextInt();
        System.out.println();
        System.out.println("Enter the string: ");
        String str = in.nextLine();
        switch (radix) {
            case 2:
                bin2Dec(str);
            case 8:
                oct2Dec(str);
            case 16:
                hex2Dec(str);
        }
    }
}
