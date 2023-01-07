package week03;


public class TrigonometricSeries {
    public static void main(String[] args) {
        double x = Math.PI / 6;
        int numTerms = 10;
        System.out.println(sin(x, numTerms)); // 0.49999999999999994
        System.out.println(Math.sin(x)); // 0.49999999999999994
        System.out.println(cos(x, numTerms)); // 0.8660254037844386
        System.out.println(Math.cos(x)); // 0.8660254037844387
    }

    public static double calculateTerm(double x, int numTerms) {
        double term = 1D;
        for (int i = numTerms; i >= 1; i--) {
            term *= x / i;
        }
        return term;
    }

    public static double sin(double x, int numTerms) {
        double res = 0;
        for (int i = 0; i < numTerms; i++) {
            if (i % 2 == 0) {
                res += calculateTerm(x, (2 * i) + 1);
            } else {
                res -= calculateTerm(x, (2 * i) + 1);
            }
        }
        return res;
    }

    public static double cos(double x, int numTerms) {
        double res = 1;
        for (int i = 1; i < numTerms; i++) {
            if (i % 2 == 0) {
                res += calculateTerm(x, 2 * i);
            } else {
                res -= calculateTerm(x, 2 * i);
            }
        }
        return res;
    }
}
