package week03;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        final int secretNumber = (int) (Math.random() * 100);
        Scanner in = new Scanner(System.in);
        runGame(secretNumber, in);
    }

    public static void runGame(int secretNum, Scanner in) {
        int trials = 0;
        System.out.println("Key in your guess: ");
        while (true) {
            int guessNum = in.nextInt();
            trials++;
            if (guessNum == secretNum) {
                System.out.printf("You got it in %d trials !", trials);
                break;
            } else if (guessNum < secretNum) {
                System.out.println("Try higher");
            } else if (guessNum > secretNum) {
                System.out.println("Try lower");
            }
        }
    }
}
