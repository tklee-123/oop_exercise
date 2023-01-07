package week02;

import java.util.Scanner;

public class Dec2Hex {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a decimal number: ");
        int decimal = Integer.parseInt(input.next());

        System.out.println("The equivalent hexadecimal number is " + convertDecToHex(decimal));
    }

    public static String convertDecToHex(int decimal) {
        int remnant;
        String hex = "";
        char hexChars[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (decimal > 0) {
            remnant = decimal % 16;
            hex += hexChars[remnant];
            decimal = decimal / 16;
        }
        return hex;
    }
}
