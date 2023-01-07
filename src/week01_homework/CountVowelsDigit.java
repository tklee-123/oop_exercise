package week01_homework;

import java.util.Scanner;

public class CountVowelsDigit {
    public static void main(String[] args) {
        String inStr;
        int countVow, countDig;
        int inStrLen;

        countVow = 0;
        countDig = 0;


        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        inStr = in.next().toLowerCase();
        inStrLen = inStr.length();
        for (int charIdx = 0; charIdx <= inStr.length() - 1; charIdx++) {
            if (Character.isDigit(inStr.charAt(charIdx))) {
                countDig++;
            } else if (inStr.charAt(charIdx) == ('a') || inStr.charAt(charIdx) == 'e' || inStr.charAt(charIdx) == 'i' || inStr.charAt(charIdx) == 'o' || inStr.charAt(charIdx) == 'u') {
                countVow++;
            }
        }
        double vowPercent = (double) countVow * 100 / inStrLen;
        double digPercent = (double) countDig * 100 / inStrLen;
        System.out.printf("Number of vowels: %d (%2.2f%%)", countVow, vowPercent);
        System.out.printf("Number of digits: %d (%2.2f%%)", countDig, digPercent);
    }
}
