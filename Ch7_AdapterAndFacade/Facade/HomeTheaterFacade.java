package Ch7_AdapterAndFacade.Facade;

public class HomeTheaterFacade {
    
    // all the components of the subsystem
    StreamingPlayer player;
    Projector projector;
    Screen screen;
    TheaterLights lights;

    public HomeTheaterFacade(StreamingPlayer player, Projector projector, Screen screen, TheaterLights lights) {
        this.player = player;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        player.on();
        player.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        lights.on();
        screen.up();
        projector.off();
        player.stop();
        player.off();
    }
}
