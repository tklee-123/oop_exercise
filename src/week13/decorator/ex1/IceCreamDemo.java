package week13.decorator.ex1;

public class IceCreamDemo {
    public static void main(String[] args) {
        HoneyToppingDecorator vanillaIceCreamWithHoney = new HoneyToppingDecorator(new VanillaIceCream());
        System.out.println(vanillaIceCreamWithHoney.getDescription());

        NutsToppingDecorator strawberryCreamWithNuts = new NutsToppingDecorator(new StrawberryIceCream());
        System.out.println(strawberryCreamWithNuts.getDescription());

    }
}
