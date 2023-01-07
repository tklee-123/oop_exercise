package week01_homework;

import java.util.Scanner;

public class ExchangeCipher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inStr;
        System.out.print("Enter a plaintext String: ");
        inStr = in.next().toUpperCase();
        int inStrLen = inStr.length();
        System.out.print("The ciphertext string is: ");
        for (int i = 0; i < inStrLen; i++) {
            System.out.print((char) ('A' + 'Z' - inStr.charAt(i)));

        }
    }
}
