package week01;

import java.util.Scanner;

public class ExtractDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap n:");
        int n = in.nextInt();
        while (n > 0) {
            int digit = n % 10;
            System.out.print(digit + " ");
            n = n / 10;
        }
        in.close();

    }
}
