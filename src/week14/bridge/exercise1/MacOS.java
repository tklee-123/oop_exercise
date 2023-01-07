package week14.bridge.exercise1;

public class MacOS implements OperatingSystem {
    @Override
    public void startup() {
        System.out.println("Mac start up");
    }

    @Override
    public void loadUrl(String url) {
        System.out.println("Load " + url + " from Safari");
    }
}
