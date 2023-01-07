package week01_homework;

import java.util.Scanner;

public class Bin2Dec {
    public static boolean checkBin(String Bin) {
        for (int i = 0; i < Bin.length(); i++) {
            if (Bin.charAt(i) != '0' && Bin.charAt(i) != '1') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Binary string: ");
        String bin = in.nextLine();
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
}
