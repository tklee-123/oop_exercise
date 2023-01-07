package week01_homework;

import java.util.Scanner;

public class Oct2Dec {
    public static boolean checkOct(String Str) {
        for (int i = 0; i < Str.length(); i++) {
            if (Str.charAt(i) < '0' || Str.charAt(i) > '7') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an Octal string: ");
        String Oct = in.nextLine();
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
}
