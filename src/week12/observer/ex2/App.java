package week12.observer.ex2;

public class App {
    public static void main(String[] args) {
        Subject subject = new Subject();

        BinaryObserver binaryObserver = new BinaryObserver(subject);
        HexaObserver hexaObserver = new HexaObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);

        subject.setState(1234);
        System.out.println("Integer number: " + 1234);
        System.out.println(binaryObserver);
        System.out.println(octalObserver);
        System.out.println(hexaObserver);

        subject.setState(5678);
        System.out.println("Integer Number: " + 5678);
        System.out.println(binaryObserver);
        System.out.println(octalObserver);
        System.out.println(hexaObserver);
    }
}
