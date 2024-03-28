package Ch7_AdapterAndFacade.Facade;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
    
        StreamingPlayer player = new StreamingPlayer();
        Projector projector = new Projector();
        Screen screen = new Screen();
        TheaterLights lights = new TheaterLights();

        HomeTheaterFacade homeTheater =  new HomeTheaterFacade(player, projector, screen, lights);
        
        homeTheater.watchMovie("Raiders of the Lost Ark");
        System.out.println();
        homeTheater.endMovie();
    }
}
