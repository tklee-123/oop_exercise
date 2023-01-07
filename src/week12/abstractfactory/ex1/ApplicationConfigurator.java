package week12.abstractfactory.ex1;

public class ApplicationConfigurator {
    public static void main(String[] args) throws Exception {
        String configOS = System.getProperty("os.name").toLowerCase();;
        GUIFactory factory;
        if (configOS.contains("win")) {
            factory = new WinFactory();
        } else if (configOS.contains("mac")) {
            factory = new MacFactory();
        } else {
            throw new Exception("Error! Unknown OS");
        }
        App app = new App(factory);
        app.createUI();
        app.paint();
    }

}
