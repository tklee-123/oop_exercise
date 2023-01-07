package week12.observer.ex2;

public class OctalObserver extends Observer {
    private String octal;

    public OctalObserver(Subject subject) {
        super(subject);
        subject.attach(this);
    }

    @Override
    public void update() {
        this.octal = convertDecimalToOctal(this.subject.getState());
    }

    private String convertDecimalToOctal(int decimal) {
        return Integer.toOctalString(decimal);
    }

    @Override
    public String toString() {
        return "Octal Number: " + octal;
    }
}
