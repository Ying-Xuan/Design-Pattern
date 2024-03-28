public class GarageDoorDownCommand implements Command {
    GarageDoor GarageDoor;

    public GarageDoorDownCommand(GarageDoor GarageDoor) {
        this.GarageDoor = GarageDoor;
    }

    public void execute() {
        GarageDoor.down();
    }

    public void undo() {
        GarageDoor.up();
    }
}

