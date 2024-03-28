public class GarageDoorUpCommand implements Command {
    GarageDoor GarageDoor;

    public GarageDoorUpCommand(GarageDoor GarageDoor) {
        this.GarageDoor = GarageDoor;
    }

    public void execute() {
        GarageDoor.up();
    }

    public void undo() {
        GarageDoor.down();
    }
}
