package week11.strategy;

public class App {
    public static void main(String[] args) {
        Context context = new Context();
        int strategyid = 3;
        if (strategyid == 1) {
            context.setStrategy(new ConcreteStrategyAdd());
        } else if (strategyid == 2) {
            context.setStrategy(new ConcreteStrategyMultiply());
        } else {
            context.setStrategy(new ConcreteStrategyAbstract());
        }
        System.out.println(context.executeStrategy(2, 3) + "");
    }
}
