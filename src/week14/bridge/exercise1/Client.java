package week14.bridge.exercise1;

public class Client {
    public static void main(String[] args) {
        Computer computer = new PC(new WindowsOS());
        computer.startup();
        computer.browseInternet("fb.com");

        Computer computer1 = new Laptop(new MacOS());
        computer1.startup();
        computer1.browseInternet("youtube.com");
        if (computer1.canMove()) {
            System.out.println("Move to another place");
        }

    }
}
