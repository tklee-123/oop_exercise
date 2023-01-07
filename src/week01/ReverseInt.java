package week01;

import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int inNumber = in.nextInt();
        int inDigit;
        in.close();
        while (inNumber > 0) {
            inDigit = inNumber % 10;
            System.out.print(inDigit);
            inNumber /= 10;
        }
    }
}
