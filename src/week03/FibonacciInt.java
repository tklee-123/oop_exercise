package week03;

public class FibonacciInt {
    public static void main(String[] args) {
        FibonacciInt();
    }

    public static int FibonacciNumber(int number) {
        if (number == 0) {
            return 1;
        } else if (number == 1) {
            return 1;
        } else {
            return FibonacciNumber(number - 1) + FibonacciNumber(number - 2);
        }
    }

    public static void FibonacciInt() {
        int number = 0;
        while (true) {
            System.out.printf("F(%1$d) = %2$d\n", number, FibonacciNumber(number));
            number++;
            if (Integer.MAX_VALUE - FibonacciNumber(number - 1) < FibonacciNumber(number - 2)) {
                System.out.printf("F(%1$d) is out of the range of int\n", number);
                break;
            }
        }
    }
}
