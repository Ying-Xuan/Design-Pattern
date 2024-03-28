package Ch7_AdapterAndFacade.Facade;

public class StreamingPlayer {

    public void on() {
        System.out.println("The streamingplayer is on.");
    }

    public void play(String movie) {
        System.out.println("The streamingplayer is playing.");

    }

    public void stop() {
        System.out.println("The streamingplayer is stop.");
    }

    public void off() {
        System.out.println("The streamingplayer is off.");

    }

}
