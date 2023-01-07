package week14.bridge.exercise1;

public class WindowsOS implements OperatingSystem {
    @Override
    public void startup() {
        System.out.println("WindowsOS start up");
    }

    @Override
    public void loadUrl(String url) {
        System.out.println("Load " + url + " from Edge");
    }
}
