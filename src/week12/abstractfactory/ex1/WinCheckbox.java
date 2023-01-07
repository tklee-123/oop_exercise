package week12.abstractfactory.ex1;

public class WinCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("WindowsCheckbox");
    }
}
