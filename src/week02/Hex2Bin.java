package week02;

import java.util.Scanner;

public class Hex2Bin {

    static Scanner input = new Scanner(System.in);
    private final static String[] HEX_BITS = {
            "0000", "0001", "0010", "0011",
            "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011",
            "1100", "1101", "1110", "1111"
    };

    public static void main(String[] args) {
        System.out.println("Enter e Hexademical string: ");
        String hexString = input.next();

        System.out.printf("The equivalent binary for hexadecimal %1$s is ", hexString);

        for (int i = 0; i < hexString.length(); i++) {
            int j = Character.digit(hexString.toLowerCase().charAt(i), 16);
            System.out.printf("%1$s ", HEX_BITS[j]);
        }
        System.out.println();
    }
}
