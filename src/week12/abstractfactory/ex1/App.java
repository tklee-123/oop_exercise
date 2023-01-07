package week12.abstractfactory.ex1;

public class App {
    private GUIFactory factory;
    private Button button;
    private Checkbox checkbox;

    public App(GUIFactory factory) {
        this.factory = factory;
    }

    public void createUI() {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }

}
