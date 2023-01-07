package week03;

public class FactorialInt {
    public static void main(String[] args) {
        FactorialInt();
        FactorialLong();
    }

    public static void FactorialInt() {
        int i = 1;
        int fact_number = 1;
        while (true) {
            System.out.printf("The factorial of %1$d is %2$d.\n", i, fact_number);
            if (Integer.MAX_VALUE / fact_number < (i + 1)) {
                System.out.printf("The factor number of %d is out of range.", i + 1);
                break;
            }
            i++;
            fact_number *= i;
        }
    }

    public static void FactorialLong() {
        long i = 1L;
        long fact_number = 1L;
        while (true) {
            System.out.printf("The factorial of %1$d is %2$d.\n", i, fact_number);
            if (Long.MAX_VALUE / fact_number < (i + 1)) {
                System.out.printf("The factorial of %d is out of range.\n", (i + 1));
                break;
            }
            i++;
            fact_number *= i;
        }
    }
}
