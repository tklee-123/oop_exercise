package week07.exercise1_7;

public class TestAnimal {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.greeting();
        Dog dog1 = new Dog();
        dog1.greeting();
        BigDog bigDog1 = new BigDog();
        bigDog1.greeting();
        Animal animal1 = new Cat();
        animal1.greeting();
        Animal animal2 = new Dog();
        animal2.greeting();
        Animal animal3 = new BigDog();
        animal3.greeting();
        Dog dog2 = (Dog) animal2;
        Dog dog3 = (Dog) animal3;
        BigDog bigDog2 = (BigDog) animal3;
        Cat cat2 = (Cat) animal1;
        dog2.greeting(dog2);
        dog3.greeting(dog2);
        dog2.greeting(bigDog2);
    }
}
