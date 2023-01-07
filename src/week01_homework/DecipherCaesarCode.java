package week01_homework;

import java.util.Scanner;

public class DecipherCaesarCode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inStr;
        System.out.print("Enter a ciphertext String: ");
        inStr = in.next().toUpperCase();
        int inStrLen = inStr.length();
        System.out.print("The plain string is: ");
        for (int i = 0; i < inStrLen; i++) {
            if (inStr.charAt(i) != 'A' || inStr.charAt(i) != 'B' || inStr.charAt(i) != 'C') {
                System.out.print((char) (inStr.charAt(i) - 3));
            } else {
                switch (inStr.charAt(i)) {
                    case 'A':
                        System.out.print('X');
                        break;
                    case 'B':
                        System.out.print('Y');
                        break;
                    case 'C':
                        System.out.print('Z');
                        break;
                }
            }
        }


    }
}
