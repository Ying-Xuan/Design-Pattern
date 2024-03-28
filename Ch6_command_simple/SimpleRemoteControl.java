package Ch6_command_simple;

// Using the command object
public class SimpleRemoteControl {
    Command slot;  // to hold our command, which will control one device

    public SimpleRemoteControl() {}

    // to set the command the slot is going to control. 
    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
