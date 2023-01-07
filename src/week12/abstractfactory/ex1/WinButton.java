package week12.abstractfactory.ex1;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("WindowsButton");
    }
}
