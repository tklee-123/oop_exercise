package week12.observer.ex2;

public class BinaryObserver extends Observer {
    private String binary;

    public BinaryObserver(Subject subject) {
        super(subject);
        subject.attach(this);
    }
    @Override
    public void update() {
        this.binary = convertDecimalToBinary(this.subject.getState());
    }

    private String convertDecimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    @Override
    public String toString() {
        return "Binary Number: " + binary;
    }
}
