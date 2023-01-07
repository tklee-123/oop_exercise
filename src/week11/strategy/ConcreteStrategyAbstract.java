package week11.strategy;

public class ConcreteStrategyAbstract implements Strategy {
    @Override
    public double execute(double a, double b) {
        return a - b;
    }
}
