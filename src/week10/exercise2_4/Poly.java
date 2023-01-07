package week10.exercise2_4;

public interface Poly {
    int degree();
    Poly derivative();
    double[] coefficients();
    double coefficient(int degree);
}
