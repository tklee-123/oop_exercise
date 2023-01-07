package week14.bridge.exercise2;

public class Client {
    private static AdvancedRemote advancedRemote;

    public static void main(String[] args) {
        System.out.println("Tests with basic remote.");
        Tv tv = new Tv();
        RemoteControl remote = new RemoteControl(tv);
        remote.power();
        System.out.println(tv.getVolume());
        remote.volumeDown();
        System.out.println(tv.getVolume());

        System.out.println("\nTests with advanced remote.");
        Radio radio = new Radio();
        AdvancedRemote advancedRemote = new AdvancedRemote(radio);
        advancedRemote.power();
        advancedRemote.mute();
        System.out.println(radio.getVolume());


    }
}
