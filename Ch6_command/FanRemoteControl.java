public class FanRemoteControl {
    Command[] Commands;
    Command undoCommand;

    public FanRemoteControl() {
        Commands = new Command[4];
        Command noCommand = new NoCommand();

        for (int i = 0; i < 4; i++) {
            Commands[i] = noCommand;
        }
        undoCommand = noCommand;
    }
    
    public void setCommand(int slot, Command Command) {
        Commands[slot] = Command;
    }

    public void ButtonWasPushed(int slot) {
        Commands[slot].execute();
        undoCommand = Commands[slot];
    }
    
    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
}
