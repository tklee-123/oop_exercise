package week14.bridge.exercise1;

public class Laptop extends Computer {
    public Laptop(OperatingSystem os) {
        super(os);
    }

    @Override
    public void startup() {
        os.startup();
    }

    @Override
    public void browseInternet(String url) {
        os.loadUrl(url);
    }

    @Override
    public boolean canMove() {
        return true;
    }
}
