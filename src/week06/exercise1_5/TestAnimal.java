package week06.exercise1_5;

public class TestAnimal {
    public static void main(String[] args) {
        Cat cat = new Cat("Meo");
        System.out.println(cat);
        cat.greets();

        Dog dog1 = new Dog("Cho");
        Dog dog2 = new Dog("Cho2");
        System.out.println(dog1);
        dog1.greets();
        dog1.greets(dog2);
    }
}
