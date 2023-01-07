package week01_homework;

import java.util.Scanner;

public class CaesarCode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inStr;
        System.out.print("Enter a plaintext String: ");
        inStr = in.next().toUpperCase();
        int inStrLen = inStr.length();
        System.out.print("The ciphertext string is: ");
        for (int i = 0; i < inStrLen; i++) {
            if (inStr.charAt(i) != 'X' || inStr.charAt(i) != 'Y' || inStr.charAt(i) != 'Z') {
                System.out.print((char) (inStr.charAt(i) + 3));
            } else {
                switch (inStr.charAt(i)) {
                    case 'X':
                        System.out.print('A');
                        break;
                    case 'Y':
                        System.out.print('B');
                        break;
                    case 'Z':
                        System.out.print('C');
                        break;
                }
            }
        }


    }
}
