package week11.strategy.example;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();

}
