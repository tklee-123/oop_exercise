package week03;

import java.math.BigInteger;
import java.util.Scanner;

public class NumberConversion {
    public static String decimalTo(String in, int outRadix) {
        BigInteger dec = new BigInteger(in);
        String res = "";
        while (dec.compareTo(BigInteger.ZERO) > 0) {
            int tmp = Integer.parseInt(dec.mod(new BigInteger(outRadix + "")).toString());
            if (tmp < 10) {
                res = tmp + res;
            } else {
                res = (char) (tmp + 55) + res;
            }
            dec = dec.divide(new BigInteger(outRadix + ""));
        }
        return res;
    }

    public static String toDecimal(String in, int inRadix) {
        in = in.toUpperCase();
        BigInteger res = new BigInteger("0");
        for (int i = 0; i < in.length(); i++) {
            char c = in.charAt(i);
            if (c >= '0' && c <= '9') {
                int d = c - '0';
                res = res.multiply(new BigInteger(inRadix + "")).add(new BigInteger(d + ""));

            } else if (c >= 'A' && c <= 'F') {
                int d = c - 'A' + 10;
                res = res.multiply(new BigInteger(inRadix + "")).add(new BigInteger(d + ""));
            }
        }
        return res + "";
    }

    public static String toRadix(String in, int inRadix, int outRadix) {
        if (inRadix == outRadix) {
            return in;
        }
        if (outRadix == 10) {
            return toDecimal(in, inRadix);
        }
        if (inRadix == 10) {
            return decimalTo(in, outRadix);
        }
        String dec = toDecimal(in, inRadix);
        System.out.println(dec);
        return decimalTo(dec, outRadix);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number and radix: ");
        String input = in.nextLine();
        System.out.println("Enter the input radix: ");
        int inRadix = in.nextInt();
        System.out.println("Enter the output radix: ");
        int outRadix = in.nextInt();
        in.close();
        System.out.println(input + " in radix " + inRadix + " is " + toRadix(input, inRadix, outRadix) + "in radix " + outRadix);
    }

}
